package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Amigo;
import kr.re.kitri.hello.model.Article;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ArticleDaoTest {

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

        ArticleDao dao = context.getBean("articleDao", ArticleDao.class);

        Article article = new Article();

        article.setAid("3");
        article.setTitle("test 실험");
        article.setAuthor("작가이름 author name");
        article.setContent("한다 테스트 냐냐냐");

        dao.insertArticle(article);

    }

    @Test
    public void testInsertAimgo(){

        AmigoDao dao = context.getBean("amigoDao", AmigoDao.class);

        Amigo amigo = new Amigo();

        amigo.setName("테스트 네임");
        amigo.setPhoneNum("12345678");
        amigo.seteMail("check@mail.com");



        dao.insertAimgo(amigo);

    }

}
