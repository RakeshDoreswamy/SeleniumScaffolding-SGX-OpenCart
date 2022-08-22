package com.cbh.pages.enums.hamburgermenutype;

public enum HamburgerMenuType {

    TVAPPLIANCESElECTRONICS("TV, Appliances, Electronics"),
    MOBILESCOMPUTERS("Mobiles, Computers"),
    MENSFASHION("Men's Fashion"),
    WOMENSFASHION("Women's Fashion");

    private final String name;

    HamburgerMenuType(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }


}
