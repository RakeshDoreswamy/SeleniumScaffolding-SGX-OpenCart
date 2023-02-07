package com.sgx.pages.pagecomponents.homepage;

import com.sgx.pages.OpenCartSubItemPage;
import com.sgx.pages.enums.hamburgermenutype.HamburgerMenuType;
import com.sgx.pages.enums.hamburgermenutype.HamburgerSubMenuType;
import com.sgx.utils.PageActionHelpers;
import org.openqa.selenium.By;

public class HamburgerComponent {

    // %s --> Wildcard and we can use String.format and pass required hamburger item name in menu
    private static final String HAMBURGER_MENU = "//a[text()='%s']";

    private static final String HAMBURGER_SUB_MENU = "//a[contains(text(),'%s')]";

    public HamburgerComponent clickHamburgerMenuItem(HamburgerMenuType hamburgerMenuType){
        String xpath = String.format(HAMBURGER_MENU,hamburgerMenuType.getName());
        PageActionHelpers.waitAndClick(By.xpath(xpath));
        return this;
    }

    public OpenCartSubItemPage clickHamburgerSubMenuItem(HamburgerSubMenuType hamburgerSubMenuType){
        String xpath = String.format(HAMBURGER_SUB_MENU,hamburgerSubMenuType.getName());
        PageActionHelpers.waitAndClick(By.xpath(xpath));
        return new OpenCartSubItemPage();
    }

}
