package com.cloudtechpro.thymeleaf.model;

public class Month {

    private String name;
    private Boolean checked;
    
    public Month() {}
    
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
}
