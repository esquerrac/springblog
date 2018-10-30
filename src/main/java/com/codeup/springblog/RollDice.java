package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@Controller
public class RollDice {
    @GetMapping("/roll-dice")
    public String home(){
        return "diceHome";
    }
//    @GetMapping("/roll-dice/id={roll}")
//    public String rollDice(@PathVariable String roll) {
//        return roll;
//    }
//        String rollId (HttpSession session){
//        session.setAttribute("rollParam" , rollDice);
//    }
//
//    public String rollDice(@PathVariable int roll){
//        return "diceHome/"+roll;
//    }
    @GetMapping("/roll-dice/1")
    public String rollOne(){
        return "guessOne";
    }
    @GetMapping("/roll-dice/2")
    public String rollTwo(){
        return "guessTwo";
    }
    @GetMapping("/roll-dice/3")
    public String rollThree(){
        return "guessThree";
    }
    @GetMapping("/roll-dice/4")
    public String rollFour(){
        return "guessFour";
    }
    @GetMapping("/roll-dice/5")
    public String rollFive(){
        return "guessFive";
    }
    @GetMapping("/roll-dice/6")
    public String rollSix(){
        return "guessSix";
    }

}
