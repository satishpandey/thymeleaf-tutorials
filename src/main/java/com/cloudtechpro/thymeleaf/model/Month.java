package com.cloudtechpro.thymeleaf.model;

public class Month {

    private String name;
    private Boolean checked;

    public Month() {
    }

    public Month(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Boolean getChecked() {
	return checked;
    }

    public void setChecked(Boolean checked) {
	this.checked = checked;
    }

    public boolean isWinter() {
	if (name.equalsIgnoreCase("December") || name.equalsIgnoreCase("January") || name.equalsIgnoreCase("February")) {
	    return true;
	}
	return false;
    }

    public boolean isSpring() {
	if (name.equalsIgnoreCase("December") || name.equalsIgnoreCase("January") || name.equalsIgnoreCase("February")) {
	    return true;
	}
	return false;
    }

    public boolean isSummer() {
	if (name.equalsIgnoreCase("December") || name.equalsIgnoreCase("January") || name.equalsIgnoreCase("February")) {
	    return true;
	}
	return false;
    }

    public boolean isAutumn() {
	if (name.equalsIgnoreCase("December") || name.equalsIgnoreCase("January") || name.equalsIgnoreCase("February")) {
	    return true;
	}
	return false;
    }

}
