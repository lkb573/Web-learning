package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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

        String query = "SELECT aid, title, author, content\n" +
                "from article\n" +
                "WHERE aid = ?";


        return jdbcTemplate.queryForObject(query,
                (rs, i) -> {
                    Article article = new Article();

                    article.setAid(rs.getString(1));
                    article.setTitle(rs.getString(2));
                    article.setAuthor(rs.getString(3));
                    article.setContent(rs.getString(4));
                    return article;
                    }, Integer.parseInt(aid));

        /*
        return jdbcTemplate.queryForObject(query, new RowMapper<Article>() {
            @Override
            public Article mapRow(ResultSet rs, int i) throws SQLException {
                Article article = new Article();

                article.setAid(rs.getString(1));
                article.setTitle(rs.getString(2));
                article.setAuthor(rs.getString(3));
                article.setContent(rs.getString(4));

                return article;
            }
        }, aid);*/
    }

    @Override
    public List<Article> selectAllArticles() {

        String query = "SELECT aid, title, author, content from article";

        return jdbcTemplate.query(query,
                (rs, i) -> {
                    Article article = new Article();

                    article.setAid(rs.getString(1));
                    article.setTitle(rs.getString(2));
                    article.setAuthor(rs.getString(3));
                    article.setContent(rs.getString(4));

                    return article;
                });
    }


    @Override
    public void deleteArticle(String aid){

        String query = "DELETE FROM article\n" +
                "WHERE aid = ?";

        jdbcTemplate.update(query, Integer.parseInt(aid));
    }

    @Override
    public void updateArticle(String aid, Article article){

        String query = "UPDATE article SET content = ?\n" +
                "WHERE aid = ?";

        jdbcTemplate.update(query,
                article.getContent(),
                Integer.parseInt(aid));

    }



}