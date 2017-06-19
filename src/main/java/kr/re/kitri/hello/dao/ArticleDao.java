package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Article;

import java.util.List;

public interface ArticleDao {

    void insertArticle(Article article);
    Article selectArticleById(String aid);
    List<Article> selectAllArticles();
    void deleteArticle(String aid);

    void updateArticle(String aid, Article article);
}