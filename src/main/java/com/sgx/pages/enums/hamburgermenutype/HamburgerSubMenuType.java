package com.sgx.pages.enums.hamburgermenutype;

public enum HamburgerSubMenuType {

    PC("PC"),
    MAC("Mac"),
    MONITORS("Monitors");


    private final String name;

    HamburgerSubMenuType(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }


}
