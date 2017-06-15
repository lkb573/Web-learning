package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@Repository         //등록하는 개념
public class ArticleDao {

    @Autowired
    private DataSource dataSource;


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


        /* simple code
        try {
            Connection conn = dataSource.getConnection();
            System.out.println("connection check!!!");

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }*/

    }
}