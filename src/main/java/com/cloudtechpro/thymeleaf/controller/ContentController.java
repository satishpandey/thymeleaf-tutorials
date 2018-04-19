package com.cloudtechpro.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContentController {

    @GetMapping("/display-name")
    public String displayName(@RequestParam(name="name", required=false, defaultValue="Cloudtechpro") String name, Model model) {
        model.addAttribute("name", name);
        return "display-name";
    }

}