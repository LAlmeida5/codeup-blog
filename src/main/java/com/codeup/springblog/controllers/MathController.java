package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{num}/and/{num2}")
    @ResponseBody
    public String reportAddition(@PathVariable int num, @PathVariable int num2) {
        return String.format("When you add %d and %d, you get : %d", num, num2, num + num2);
    }

    @GetMapping("/subtract/{num}/from/{num2}")
    @ResponseBody
    public String reportSubtraction(@PathVariable int num, @PathVariable int num2) {
        return String.format("When you subtract %d from %d, you get : %d", num, num2, num2 - num);
    }

    @GetMapping("/multiply/{num}/and/{num2}")
    @ResponseBody
    public String reportMultiplication(@PathVariable int num, @PathVariable int num2) {
        return String.format("When you multiply %d and %d, you get : %d", num, num2, num * num2);
    }

    @GetMapping("/divide/{num}/by/{num2}")
    @ResponseBody
    public String reportDivision(@PathVariable int num, @PathVariable int num2) {
        return String.format("When you multiply %d and %d, you get : %d", num, num2, num / num2);
    }





}
