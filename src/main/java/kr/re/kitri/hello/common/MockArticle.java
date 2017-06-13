package kr.re.kitri.hello.common;


import kr.re.kitri.hello.model.Article;

import java.util.ArrayList;
import java.util.List;

public class MockArticle {


    public List<Article> getArticles(){
        List<Article> list = new ArrayList<>();

        Article a = new Article();
        a.setAid("1");
        a.setTitle("no.1 board");
        a.setAuthor("Lee");
        a.setContent("ABCD 한글 확인");
        list.add(a);

        a = new Article();
        a.setAid("2");
        a.setTitle("no.2 board");
        a.setAuthor("Hong");
        a.setContent("ABCDH 한글 확인");
        list.add(a);

        a = new Article();
        a.setAid("3");
        a.setTitle("no.3 board");
        a.setAuthor("한글이름");
        a.setContent("ABC");
        list.add(a);

        a = new Article();
        a.setAid("4");
        a.setTitle("no.4 board");
        a.setAuthor("Park");
        a.setContent("ABC 한글");
        list.add(a);

        a = new Article();
        a.setAid("5");
        a.setTitle("no.5 board");
        a.setAuthor("Jin");
        a.setContent("한글 확인");
        list.add(a);

        return list;
    }

}