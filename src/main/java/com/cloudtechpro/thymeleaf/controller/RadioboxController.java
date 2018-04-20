package com.cloudtechpro.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cloudtechpro.thymeleaf.model.MonthGroup;

@Controller
public class RadioboxController {

    @GetMapping("/radiobox-display")
    public ModelAndView radioBoxDisplay(@ModelAttribute("monthGroup") MonthGroup monthGroup, BindingResult bindingResult, ModelAndView modelAndView) {	
	modelAndView.addObject("monthGroup", new MonthGroup());
	modelAndView.setViewName("display-radio");
	return modelAndView;
    }

    @PostMapping("/radiobox-submit")
    public ModelAndView radioBoxSubmit(@ModelAttribute("monthGroup") MonthGroup monthGroup, BindingResult bindingResult, ModelAndView modelAndView) {
	modelAndView.setViewName("display-radio");
	return modelAndView;
    }

}