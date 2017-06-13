package kr.re.kitri.hello.common;

import kr.re.kitri.hello.model.Amigo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-13.
 */
public class MockAmigo {

    public List<Amigo> getAmigos(){
        List<Amigo> list = new ArrayList<>();

        Amigo a = new Amigo();
        a.setName("친구이름");
        a.setPhoneNum("친구번호");
        a.seteMail("친구이메일");
        list.add(a);

        a = new Amigo();
        a.setName("Lee");
        a.setPhoneNum("0101234567");
        a.seteMail("aaa@123.com");
        list.add(a);

        a = new Amigo();
        a.setName("Hong");
        a.setPhoneNum("0102345678");
        a.seteMail("bbb@123.com");
        list.add(a);

        a = new Amigo();
        a.setName("바닐라");
        a.setPhoneNum("01031313131");
        a.seteMail("한글31@BS31.com");
        list.add(a);

        return list;
    }


}
