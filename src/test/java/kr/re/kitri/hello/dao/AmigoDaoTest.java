package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Amigo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring/applicationContext.xml","classpath:spring/db.xml"})

public class AmigoDaoTest {

    @Autowired
    private AmigoDao amigoDao;

    @Test
    public void testInsertAmigo(){

        Amigo amigo = new Amigo();

        amigo.setName("testtest");
        amigo.setPhoneNum("0101234567");
        amigo.seteMail("test@mail.net");

        amigoDao.insertAimgo(amigo);

    }



}
