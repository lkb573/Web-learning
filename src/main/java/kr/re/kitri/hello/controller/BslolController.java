package kr.re.kitri.hello.controller;


import kr.re.kitri.hello.common.MockBslol;
import kr.re.kitri.hello.model.Bslol;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BslolController {

    @RequestMapping("/bslol")
    public ModelAndView bslol(){
        MockBslol mock = new MockBslol();
        List<Bslol> list = mock.getBslols();

        return new ModelAndView("bslol/bs_sample")
                .addObject("list", list);
    }


    @RequestMapping("/bslol/bs-read")
    public String bslolread(){
        return "bslol/bs_read";
    }

    @RequestMapping("/bslol/bs-write")
    public String bslolwrite(){
        return "bslol/bs_write";
    }


    /*@RequestMapping("/bs-write/{bsnum}")
    public ModelAndView bslolwrite(@PathVariable("bsnum") String bsnum){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("bslol/bs_write");
        mav.addObject("bsnum",bsnum);
        return mav;
    }*/

}
