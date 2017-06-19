package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockArticle;
import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/*
*   설계하는 법
*   /bbs            Main
*   /bbs/{id}       view
*   /bbs/write      write GET/POST
*
*/


@Controller
@RequestMapping("/bbs")
public class BbsController {

    @Autowired
    private BbsService service;

    @RequestMapping("")
    public ModelAndView viewAll(){
        //view all data load
        /*MockArticle mock = new MockArticle();
        List<Article> list = mock.getArticles();*/

        List<Article> list = service.getArticles();

        return new ModelAndView("bbs/view_all")
                .addObject("list",list);
    }

    //Json 사용
    @RequestMapping("/api")
    @ResponseBody
    public List<Article> viewAllApi(){

        List<Article> list = service.getArticles();

        return list;

    }


    //글 상세보기
    @RequestMapping("/{aid}")
    public ModelAndView viewDetail(@PathVariable String aid){

        Article article = service.viewArticledeatail(aid);

        return new ModelAndView("bbs/view_detail")
                .addObject("article", article);
    }

    //JSON 사용
    @RequestMapping("/{aid}/api")
    @ResponseBody
    public Article viewDetailApi(@PathVariable String aid){

        Article article = service.viewArticledeatail(aid);

        return article;

    }

    //글 작성하기
    @GetMapping("/write")
    public String bbswrite(){
        return "bbs/bbs_write";
    }

    //실제 글 작성 부분
    @PostMapping(/*value = */ "/write" /*, method = RequestMethod.POST*/)
    public ModelAndView bbswritedo(Article article){
            /*@RequestParam("aid") String aid,
                             @RequestParam("title") String title,
                             @RequestParam("author") String author,
                             @RequestParam("content") String content)*/

        /*BbsService service = new BbsService();*/
        service.registArticle(article);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/bbs_write_do");
        mav.addObject("article", article);     /*article 객체를 이용하여 Jsp에서 사용가능*/

        System.out.println(article);

        return mav;
    }

    //Json 사용
    @PostMapping("/write/api")
    public String bbswriteApi(@RequestBody Article article){

        service.registArticle(article);

        return "bbs/view_all";
    }






    /*@RequestMapping("/15")
    public String view15(){
        return "view15";
    }
    @RequestMapping("/write/do")
    public String bbswritedo(HttpServletRequest request){
        String artcleId = request.getParameter("aid");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String content = request.getParameter("content");

        System.out.printf(artcleId);
        System.out.printf(title);
        System.out.printf(author);
        System.out.printf(content);

        return "bbs_write_do";
    }*/

}