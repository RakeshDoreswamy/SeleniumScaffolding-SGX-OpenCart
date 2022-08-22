package com.cbh.pages.pagecomponents.homepage;

import com.cbh.pages.AmazonSubItemPage;
import com.cbh.pages.enums.hamburgermenutype.HamburgerMenuType;
import com.cbh.pages.enums.hamburgermenutype.HamburgerSubMenuType;
import com.cbh.utils.PageActionHelpers;
import org.openqa.selenium.By;

public class HamburgerComponent {

    // %s --> Wildcard and we can use String.format and pass required hamburger item name in menu
    private static final String HAMBURGER_MENU = "//div[text()='%s']/parent::a";

    private static final String HAMBURGER_SUB_MENU = "//a[text()='%s']";

    public HamburgerComponent clickHamburgerMenuItem(HamburgerMenuType hamburgerMenuType){
        String xpath = String.format(HAMBURGER_MENU,hamburgerMenuType.getName());
        PageActionHelpers.waitAndClick(By.xpath(xpath));
        return this;
    }

    public AmazonSubItemPage clickHamburgerSubMenuItem(HamburgerSubMenuType hamburgerSubMenuType){
        String xpath = String.format(HAMBURGER_SUB_MENU,hamburgerSubMenuType.getName());
        PageActionHelpers.waitAndClick(By.xpath(xpath));
        return new AmazonSubItemPage();
    }

}
