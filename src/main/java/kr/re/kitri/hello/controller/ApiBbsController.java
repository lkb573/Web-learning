package kr.re.kitri.hello.controller;


import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
*   RESTful Api
*  /api/bbs         GET         전체보기
*  /api/bbs/{aid}   GET         상세보기
*  /api/bbs/        POST        글쓰기
*  /api/bbs/{aid}   PUT         글수정
*  /api/bbs/{aid}   DELETE      글삭제
*
* */

@RestController
@RequestMapping("/api/bbs")
public class ApiBbsController {

    @Autowired
    private BbsService service;
    private String aid;
    private Article article;


    @GetMapping("")
    public List<Article> viewAll(){

        List<Article> list = service.getArticles();

        return list;
    }

    @GetMapping("/{aid}")
    public Article viewDetail(@PathVariable String aid) {

        Article article = service.viewArticledeatail(aid);

        return article;
    }

    @PostMapping("")
    public void regist(@RequestBody Article article){

        service.registArticle(article);

    }

    @PutMapping("/{aid}")
    public void modify(@PathVariable String aid, @RequestBody Article article){

        service.modifyArticle(aid, article);

    }

    @DeleteMapping("/{aid}")
    public void remove(@PathVariable String aid){

        service.removeArticle(aid);

    }

}