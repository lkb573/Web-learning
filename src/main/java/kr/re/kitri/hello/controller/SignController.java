package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/sign")
public class SignController {

    @Autowired
    private SignUpService signUpService;

    @RequestMapping("")
    public String mainSign(){
        return "signup/main_sign";
    }

    @GetMapping("/up_id")
    public String signup(){
        return "signup/sign_up";
    }

    @PostMapping("/up_id")
    public ModelAndView dosignup(Member member){
        signUpService.registMember(member);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("signup/sign_up_do");
        mav.addObject("member", member);

        System.out.println(member);

        return mav;
    }

}