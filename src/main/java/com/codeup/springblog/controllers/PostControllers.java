package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostControllers {

    @PostMapping("/posts")
    @ResponseBody
    public String indexPage(){
        return "<h1>post index page</h1>";
    }

    @PostMapping("/posts/{id}")
    @ResponseBody
    public String indPost(@PathVariable int id){
        return "<h1>view an individual post</h1>";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String getPage(){
        return "<h1>view the form for creating a post</h1>";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String postPage(){
        return "<h1>create a new post</h1>";
    }
}
