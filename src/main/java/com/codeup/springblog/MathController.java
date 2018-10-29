package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/add/3/and/4")
    @ResponseBody
    public int addThreeFour() {
        return 7;
    }
    @GetMapping("subtract/3/from/10")
    @ResponseBody
    public int threeFromTen() {
        return 7;
    }
    @GetMapping("multiply/4/and/5")
    @ResponseBody
    public int fourTimesFive() {
        return 20;
    }
    @GetMapping("divide/6/by/3")
    @ResponseBody
    public int sixDivideThree() {
        return 2;
    }
}
