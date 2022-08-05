package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.repositories.PostRepository;
import com.codeup.springblog.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostControllers {

    //configures the injection of repositories into the post controller.
    private PostRepository postsDao;
    private UserRepository usersDao;

    public PostControllers(PostRepository postsDao, UserRepository usersDao) {
        this.postsDao = postsDao;
        this.usersDao = usersDao;
    }
    //end of injection.

    @GetMapping("/posts")
    public String indexPage(Model model){

        model.addAttribute("posts", postsDao.findAll());

        return "posts/index";
    }

    @PostMapping("/posts/{id}")
    public String indPost(@PathVariable int id){
        return "<h1>view an individual post</h1>";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    public String viewCreateForm(){
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String savePost(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body){
        return "redirect:/posts";
    }
}
