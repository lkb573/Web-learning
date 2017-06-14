package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@Repository         //등록하는 개념
public class ArticleDao {

    @Autowired
    private DataSource dataSource;

    public int getSum(int a, int b){
        return a + b;
    }

    public void insertArticle(Article article) {

        try {
            Connection conn = dataSource.getConnection();
            System.out.println("connection check!!!");

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}