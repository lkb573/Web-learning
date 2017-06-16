package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class PostDaoJdbc implements PostDao{

    @Autowired
    private DataSource dataSource;

    public void insertPost(Post post) {

        try {
            //connection 확보
            Connection conn = dataSource.getConnection();

            //query create
            String query = "INSERT INTO post (title, content, write_date, member_seq)\n" +
                    "VALUES (?, ?, now(), ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, post.getTitle());
            pstmt.setString(2, post.getContent());
            pstmt.setInt(3, post.getMemberId());

            pstmt.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Post> selectAllPost() {

        String query = "SELECT post_seq, title, content, write_date, member_seq from post";


        try {
            Connection conn = dataSource.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            List<Post> list = new ArrayList<>();
            Post post;
            while (rs.next()){

                post = new Post();

                post.setPost_seq(rs.getInt(1));
                post.setTitle(rs.getString(2));
                post.setContent(rs.getString(3));
                post.setWrite_date(rs.getDate(4));
                post.setMemberId(rs.getInt(5));


                list.add(post);
            }

            conn.close();

            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

    public Post selectPostMemberId(int memberId){

        String query = "SELECT post_seq, title, content, write_date, member_seq\n" +
                "from post\n" +
                "WHERE member_seq = ?";

        try {
            Connection conn = dataSource.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, memberId);
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            Post post = new Post();

            post.setPost_seq(rs.getInt(1));
            post.setTitle(rs.getString(2));
            post.setContent(rs.getString(3));
            post.setWrite_date(rs.getDate(4));
            post.setMemberId(rs.getInt(5));


            conn.close();

            return post;

        } catch (SQLException e) {
            e.printStackTrace();
            return new Post();
        }
    }
}