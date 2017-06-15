package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockAmigo;
import kr.re.kitri.hello.model.Amigo;
import kr.re.kitri.hello.service.AmigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/*
*
*   /amigo
*   /amigo/regist - GET
*   /amigo/regist - POST
*   /amigo/{name}
*   /amigo/{name}/modify - GET
*   /amigo/{name}/modify - POST
*   /amigo/{name}/remove - GET
*
*/


@Controller
@RequestMapping("/amigo")
public class AmigoController {

    @Autowired
    private AmigoService service;

    @RequestMapping("")
    public ModelAndView amigo(){
        MockAmigo mockA = new MockAmigo();
        List<Amigo> list = mockA.getAmigos();

        return new ModelAndView("amigo/amigo_all")
                .addObject("list",list);
    }

    @GetMapping("/regist")
    public String amigoregist(){
        return "amigo/amigo_regist";
    }

    @PostMapping("/regist")
    public ModelAndView amigoregistdo(Amigo amigo){

        service.registAimgo(amigo);

        return new ModelAndView("amigo/amigo_regist_go")
                .addObject("amigo",amigo);
    }

    @RequestMapping("/{name}")
    public ModelAndView amigoDetail(@PathVariable("name") String name){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/amigo_detail");

        mav.addObject("name", name);

        return mav;
    }




}
