package com.cbh.pages.enums.refinementbrand;

public enum RefinementBrandName {

    ONEPLUS("OnePlus"),
    MI("MI"),
    SAMSUNG("Samsung"),
    LG("LG"),
    SONY("Sony");

    private final String name;

    RefinementBrandName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}
