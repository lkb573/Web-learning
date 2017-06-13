package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockAmigo;
import kr.re.kitri.hello.model.Amigo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AmigoController {

    @RequestMapping("/amigo")
    public ModelAndView amigo(){
        MockAmigo mockA = new MockAmigo();
        List<Amigo> list = mockA.getAmigos();

        return new ModelAndView("amigo/amigo_all")
                .addObject("list",list);
    }

    @RequestMapping(value = "/amigo/regist", method=RequestMethod.GET)
    public String amigoregist(){
        return "amigo/amigo_regist";
    }


    @RequestMapping("/amigo/{name}")
    public ModelAndView amigoDetail(@PathVariable("name") String name){


        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/amigo_detail");

        mav.addObject("name", name);

        return mav;
    }


    @RequestMapping(value = "/amigo/regist", method=RequestMethod.POST)
    public ModelAndView amigoregistdo(Amigo amigone){
            /*@RequestParam("name") String name,
                                    @RequestParam("phoneNum") String phoneNum,
                                    @RequestParam("eMail") String eMail)*/

        /*System.out.println(name);
        System.out.println(phoneNum);
        System.out.println(eMail);*/

        /*mAv.addObject("name", name);
        mAv.addObject("phoneNum", phoneNum);
        mAv.addObject("eMail", eMail);*/

        ModelAndView mAv = new ModelAndView();

        mAv.setViewName("amigo/amigo_regist_go");
        mAv.addObject("amigo", amigone);

        System.out.println(amigone);

        return mAv;
    }


}
