package kr.re.kitri.hello.service;


import kr.re.kitri.hello.dao.ArticleDao;
import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service        // Managed Bean 으로 등록하는 개념(marking)
public class BbsService {

    @Autowired
    private ArticleDao dao;


    //글쓰기   DB=insert action
    public void registArticle(Article article){
        dao.insertArticle(article);
    }

    //글 상세보기  인자-글번호  리턴-글
    public Article viewArticledeatail(String aid){
        return dao.selectArticleById(aid);
    }

    //전체 글보기
    public List<Article> getArticles(){
        return dao.selectAllArticles();
    }


    public void removeArticle(String aid) {
        dao.deleteArticle(aid);
    }

    public void modifyArticle(String aid, Article article) {
        dao.updateArticle(aid, article);
    }
}