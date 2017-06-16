package kr.re.kitri.hello.controller;


import kr.re.kitri.hello.model.Post;
import kr.re.kitri.hello.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*
 *
 *   /post/write     GET
 *   /post/write    POST
 *
 */


@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;


    @RequestMapping("")
    public ModelAndView viewAll(){
        List<Post> list = postService.getPosts();

        return new ModelAndView("post/main_view")
                .addObject("list",list);
    }


    @GetMapping("/write")
    public String write(){

        return "post/write";
    }

    @PostMapping("/write")
    public ModelAndView doWrite(Post post){

        postService.registPost(post);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("post/write_do");
        mav.addObject("post", post);

        System.out.println(post);

        return mav;
    }

    @RequestMapping("/{memberId}")
    public ModelAndView viewDetail(@PathVariable int memberId){

        Post post = postService.viewPostDetail(memberId);

        return new ModelAndView("post/detail_view")
                .addObject("post", post);
    }

}