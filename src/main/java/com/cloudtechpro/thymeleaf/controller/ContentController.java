package com.cloudtechpro.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContentController {

    @GetMapping("/display-name")
    public String displayName(@RequestParam(name = "name", required = false, defaultValue = "Cloudtechpro") String name, Model model) {
	model.addAttribute("name", name);
	return "display-name";
    }

    @GetMapping("/display-message")
    public String displayMessage() {
	return "display-message";
    }

    @GetMapping("/display-collection")
    public String displayCollection(Model model) {
	List<String> names = new ArrayList<>();
	for (int index = 0; index < 10; index++) {
	    names.add("Student" + index);
	}
	model.addAttribute("names", names);
	return "display-collection";
    }

}