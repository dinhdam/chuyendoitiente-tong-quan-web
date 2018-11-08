package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverter  {
    @GetMapping("/")
    public String displayPages(){
        return "index";
    }
    @PostMapping("/")
    public String convertToVND(@RequestParam String rate, @RequestParam String usd, Model model) {
        double USD = Double.parseDouble(usd);
        double RATE = Double.parseDouble(rate);
        double VND = USD * RATE;
        model.addAttribute("vnd", VND);
        return "index";
    }
}
