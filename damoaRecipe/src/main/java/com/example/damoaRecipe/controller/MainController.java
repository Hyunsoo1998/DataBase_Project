package com.example.damoaRecipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/damoa")
    @ResponseBody
    public String index() {
        return "다모아레시피에 방문하신 것을 환영합니다 >3<";
    }
}
