package com.cbh.pages.enums.hamburgermenutype;

public enum HamburgerSubMenuType {

    TELEVISIONS("Televisions"),
    HOMEENTERTAINMENTSYSTEMS("Home Entertainment Systems"),
    HEADPHONES("Headphones"),
    SPEAKERS("Speakers"),
    CAMERS("Cameras");

    private final String name;

    HamburgerSubMenuType(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }


}
