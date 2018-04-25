package com.cloudtechpro.thymeleaf.model;

import java.util.List;

public class MonthGroup {

    private List<Month> months;

    public MonthGroup() {
    }

    public List<Month> getMonths() {
	return months;
    }

    public void setMonths(List<Month> months) {
	this.months = months;
    }

    public boolean isMonthSelected() {
	if (months == null)
	    return false;
	return months.stream().filter(month -> month.getChecked() != null && month.getChecked()).findFirst().isPresent();
    }
}
