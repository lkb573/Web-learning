package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ArticleDaoSpringJdbc implements ArticleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void insertArticle(Article article) {

        String query = "INSERT INTO article (aid, title, author, content)\n" +
                "VALUES (?, ?, ?, ?)";

        jdbcTemplate.update(query,
                Integer.parseInt(article.getAid()),
                article.getTitle(),
                article.getAuthor(),
                article.getContent());

    }

    @Override
    public Article selectArticleById(String aid) {
        return null;
    }

    @Override
    public List<Article> selectAllArticles() {
        return null;
    }
}