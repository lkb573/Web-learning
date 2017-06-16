package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


//@Repository         //등록하는 개념
public class ArticleDaoJdbc implements ArticleDao{

    @Autowired
    private DataSource dataSource;

    //글 작성
    public void insertArticle(Article article) {

        try {
            //connection 확보
            Connection conn = dataSource.getConnection();

            //query create
            String query = "INSERT INTO article (aid, title, author, content)\n" +
                    "VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, Integer.parseInt(article.getAid()));
            pstmt.setString(2, article.getTitle());
            pstmt.setString(3, article.getAuthor());
            pstmt.setString(4, article.getContent());

            pstmt.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //전체 글 보기
    public List<Article> selectAllArticles(){

        String query = "SELECT aid, title, author, content from article";

        try {
            Connection conn = dataSource.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            List<Article> list = new ArrayList<>();
            Article article;
            while (rs.next()){
                article = new Article();
                article.setAid(rs.getString(1));
                article.setTitle(rs.getString(2));
                article.setAuthor(rs.getString(3));
                article.setContent(rs.getString(4));

                list.add(article);
            }

            conn.close();

            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    //글 상세보기 - 글 번호
    public Article selectArticleById(String aid){

        String query = "SELECT aid, title, author, content\n" +
                "from article\n" +
                "WHERE aid = ?";

        try {
            Connection conn = dataSource.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(aid));
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            Article article = new Article();
            article.setAid(rs.getString(1));
            article.setTitle(rs.getString(2));
            article.setAuthor(rs.getString(3));
            article.setContent(rs.getString(4));

            conn.close();

            return article;

        } catch (SQLException e) {
            e.printStackTrace();
            return new Article();
        }

    }

}