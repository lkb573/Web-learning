package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Article;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;



public class ArticleDaoJdbcTest {

    private ApplicationContext context;

    @Before
    public void setup(){
        context =
                new ClassPathXmlApplicationContext(
                        "classpath:spring/db.xml",
                        "classpath:spring/applicationContext.xml");
    }

    @Test
    public void testInsertArticle(){

        ArticleDaoJdbc dao = context.getBean("articleDaoJdbc", ArticleDaoJdbc.class);

        Article article = new Article();

        article.setAid("3");
        article.setTitle("test 실험");
        article.setAuthor("작가이름 author name");
        article.setContent("한다 테스트 냐냐냐");

        dao.insertArticle(article);

    }

    @Test
    public void testSelectAllArticles(){
        ArticleDaoJdbc dao = context.getBean("articleDaoJdbc", ArticleDaoJdbc.class);
        List<Article> list = dao.selectAllArticles();

        Assert.assertTrue(list.size()>0);
        Assert.assertTrue(list.get(0).getAuthor().equals("author"));

    }

    @Test
    public void testSelectArticleById(){
        ArticleDaoJdbc dao = context.getBean("articleDaoJdbc", ArticleDaoJdbc.class);
        Article article = dao.selectArticleById("2");
        Assert.assertTrue(article.getAuthor().equals("작가"));


    }


}
