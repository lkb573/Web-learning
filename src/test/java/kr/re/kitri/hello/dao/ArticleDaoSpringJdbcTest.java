package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring/applicationContext.xml","classpath:spring/db.xml"})
public class ArticleDaoSpringJdbcTest {

    @Autowired
    private ArticleDaoSpringJdbc articleDao;


    @Test
    public void testInsertArticle(){
        Article article = new Article();
         article.setAid("6");
        article.setTitle("TT");
        article.setAuthor("AT");
        article.setContent("CT");


        articleDao.insertArticle(article);
    }

}