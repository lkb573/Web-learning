package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Article;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestArticleDao {

    private ApplicationContext context;

    @Before
    public void init(){
        context =
                new ClassPathXmlApplicationContext(
                        "classpath:spring/db.xml",
                        "classpath:spring/applicationContext.xml");
    }

    @Test
    public void testGetSum(){

        ArticleDao dao = context.getBean("articleDao", ArticleDao.class);
        int result = dao.getSum(1, 3);

        Assert.assertEquals(4, result);

    }

    @Test
    public void testInsertArticle(){

        ArticleDao dao = context.getBean("articleDao", ArticleDao.class);

        dao.insertArticle(new Article());

    }

}
