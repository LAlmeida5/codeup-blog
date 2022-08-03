package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiceController {

    @GetMapping("/rolldice")
    public String rollDice(){return "rollDice";}

    @GetMapping("/rolldice/{n}")
    public String rolledDice(@PathVariable int n, Model model){
        int firstRoll = (int) Math.floor((Math.random()*6)+1);
        boolean checkFirstMatch = n == firstRoll;
        int secondRoll = (int) Math.floor((Math.random()*6)+1);
        boolean checkSecondMatch = n == secondRoll;
        int thirdRoll = (int) Math.floor((Math.random()*6)+1);
        boolean checkThirdMatch = n == thirdRoll;
        int fourthRoll = (int) Math.floor((Math.random()*6)+1);
        boolean checkFourthMatch = n == fourthRoll;
        int fifthRoll = (int) Math.floor((Math.random()*6)+1);
        boolean checkFifthMatch = n == fifthRoll;
        int sixthRoll = (int) Math.floor((Math.random()*6)+1);
        boolean checkSixthMatch = n == sixthRoll;
        model.addAttribute("num", n);
        model.addAttribute("roll1", firstRoll);
        model.addAttribute("roll2", secondRoll);
        model.addAttribute("roll3", thirdRoll);
        model.addAttribute("roll4", fourthRoll);
        model.addAttribute("roll5", fifthRoll);
        model.addAttribute("roll6", sixthRoll);
        model.addAttribute("firstCheck",checkFirstMatch);
        model.addAttribute("secondCheck",checkSecondMatch);
        model.addAttribute("thirdCheck",checkThirdMatch);
        model.addAttribute("fourthCheck",checkFourthMatch);
        model.addAttribute("fifthCheck",checkFifthMatch);
        model.addAttribute("sixthCheck",checkSixthMatch);
        return "rolledDice";
    }


}
