package kr.re.kitri.hello.common;


import kr.re.kitri.hello.model.Bslol;

import java.util.ArrayList;
import java.util.List;

public class MockBslol {

    public List<Bslol> getBslols(){
        List<Bslol> list = new ArrayList<>();

        Bslol b = new Bslol();
        b.setBsnum("1");
        b.setBstitle("작성한 제목1");
        b.setBscontent("작성내용1");
        b.setBswirter("작성자1");
        b.setBsclick("1001");
        list.add(b);

        b = new Bslol();
        b.setBsnum("2");
        b.setBstitle("작성한 제목2");
        b.setBscontent("작성내용2");
        b.setBswirter("작성자2");
        b.setBsclick("1002");
        list.add(b);

        b = new Bslol();
        b.setBsnum("3");
        b.setBstitle("작성한 제목3");
        b.setBscontent("작성내용3");
        b.setBswirter("작성자3");
        b.setBsclick("1003");
        list.add(b);

        b = new Bslol();
        b.setBsnum("4");
        b.setBstitle("작성한 제목4");
        b.setBscontent("작성내용4");
        b.setBswirter("작성자4");
        b.setBsclick("1004");
        list.add(b);


        return list;
    }
}
