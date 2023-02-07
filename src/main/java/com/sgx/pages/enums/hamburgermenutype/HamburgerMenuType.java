package com.sgx.pages.enums.hamburgermenutype;

public enum HamburgerMenuType {

    DESKTOPS("Desktops"),
    LAPTOPNOTEBOOK("Laptops & Notebooks"),
    COMPONENTS("Components"),
    TABLETS("Tablets"),
    SOFTWARE("Software"),
    PHONEPDA("Phones & PDAs"),
    CAMERAS("Cameras"),
    MP3PLAYERS("MP3 Players");

    private final String name;

    HamburgerMenuType(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }


}
