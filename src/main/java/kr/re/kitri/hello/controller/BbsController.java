package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockArticle;
import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
        MockArticle mock = new MockArticle();
        List<Article> list = mock.getArticles();

        return new ModelAndView("bbs/view_all")
                .addObject("list",list);
    }

    @RequestMapping("/{Id}")
    public ModelAndView viewDetail(@PathVariable/*("Id")*/ String Id){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/view_detail");

        mav.addObject("Id", Id);

        return mav;
    }

    @GetMapping("/write")
    public String bbswrite(){
        return "bbs/bbs_write";
    }

    @PostMapping(/*value = */ "/write" /*, method = RequestMethod.POST*/)
    public ModelAndView bbswritedo(Article article){
            /*@RequestParam("Id") String aid,
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





    /*@RequestMapping("/15")
    public String view15(){
        return "view15";
    }*/

    /*@RequestMapping("/write/do")
    public String bbswritedo(HttpServletRequest request){
        String artcleId = request.getParameter("Id");
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