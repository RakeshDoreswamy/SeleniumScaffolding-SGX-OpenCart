package com.sgx.pages.enums.refinementbrand;

public enum RefinementBrandName {

    SAMSUNG("Samsung"),
    APPLE("Apple");

    private final String name;

    RefinementBrandName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}
