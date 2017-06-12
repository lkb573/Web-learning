package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BbsController {

    @RequestMapping("/bbs")
    public String viewAll(){
        return "bbs/view_all";
    }

    @RequestMapping("/bbs/{Id}")
    public ModelAndView viewDetail(@PathVariable("Id") String Id){


        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/view_detail");

        mav.addObject("Id", Id);

        return mav;
    }


    @RequestMapping("/bbs/15")
    public String view15(){
        return "view15";
    }

    @RequestMapping(value = "/bbs/write", method = RequestMethod.GET)
    public String bbswrite(){
        return "bbs/bbs_write";
    }

    @RequestMapping(value = "/bbs/write", method = RequestMethod.POST)
    public ModelAndView bbswritedo(Article articled){
            /*@RequestParam("Id") String aid,
                             @RequestParam("title") String title,
                             @RequestParam("author") String author,
                             @RequestParam("content") String content)*/



        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/bbs_write_do");
        mav.addObject("article", articled);

        System.out.println(articled);


        return mav;
    }







    /*@RequestMapping("/bbs/write/do")
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