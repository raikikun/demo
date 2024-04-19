package es4.demo.allication.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController  {

    @GetMapping("/")
    public String showStartPage(Model model) {
        return "index";
    }
    
}