package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostControllers {

    private final PostRepository postDao;

    public PostControllers(PostRepository postDao) {
        this.postDao = postDao;
    }


    @GetMapping("/posts")
    public String indexPage(Model model){

        model.addAttribute("posts", postDao.findAll());

        return "posts/index";
    }

    @PostMapping("/posts/{id}")
    public String indPost(@PathVariable int id){
        return "<h1>view an individual post</h1>";
    }

    @GetMapping("/posts/create")
    public String getPage(){
        return "<h1>view the form for creating a post</h1>";
    }

    @PostMapping("/posts/create")
    public String postPage(){
        return "<h1>create a new post</h1>";
    }
}
