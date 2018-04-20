package com.cloudtechpro.thymeleaf.model;

import java.util.ArrayList;
import java.util.List;

public class MonthGroup {

    private List<Month> months = new ArrayList<>();
    
    public MonthGroup() {
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
    }

    public List<Month> getMonths() {
        return months;
    }

    public void setMonths(List<Month> months) {
        this.months = months;
    }
}
