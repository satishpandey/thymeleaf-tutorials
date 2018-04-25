package com.cloudtechpro.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cloudtechpro.thymeleaf.model.Month;
import com.cloudtechpro.thymeleaf.model.MonthGroup;

@Controller
@SessionAttributes("monthGroup")
public class FormController {

    @GetMapping("/radiobox-display")
    public ModelAndView radioBoxDisplay(ModelAndView modelAndView) {
	MonthGroup monthGroup = new MonthGroup();
	monthGroup.setMonths(this.prepareDefaultMonthGroup());
	modelAndView.addObject("monthGroup", monthGroup);
	modelAndView.setViewName("display-radio");
	return modelAndView;
    }

    @PostMapping("/radiobox-submit")
    public ModelAndView radioBoxSubmit(@ModelAttribute("monthGroup") MonthGroup monthGroup, BindingResult bindingResult, ModelAndView modelAndView) {
	modelAndView.setViewName("display-radio");
	return modelAndView;
    }

    @GetMapping("/checkbox-display")
    public ModelAndView checkBoxDisplay(ModelAndView modelAndView) {
	MonthGroup monthGroup = new MonthGroup();
	monthGroup.setMonths(this.prepareDefaultMonthGroup());
	modelAndView.addObject("monthGroup", monthGroup);
	modelAndView.setViewName("display-checkbox");
	return modelAndView;
    }

    @PostMapping("/checkbox-submit")
    public ModelAndView checkBoxSubmit(@ModelAttribute("monthGroup") MonthGroup monthGroup, BindingResult bindingResult, ModelAndView modelAndView) {
	modelAndView.addObject("monthGroup", monthGroup);
	modelAndView.setViewName("display-checkbox");
	return modelAndView;
    }

    private List<Month> prepareDefaultMonthGroup() {
	List<Month> months = new ArrayList<>();
	months.add(new Month("January"));
	months.add(new Month("February"));
	months.add(new Month("March"));
	months.add(new Month("April"));
	months.add(new Month("May"));
	months.add(new Month("June"));
	months.add(new Month("July"));
	months.add(new Month("August"));
	months.add(new Month("September"));
	months.add(new Month("October"));
	months.add(new Month("November"));
	months.add(new Month("December"));
	return months;
    }
}