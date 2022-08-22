package com.cbh.pages;

import com.cbh.pages.enums.hamburgermenutype.HamburgerMenuType;
import com.cbh.pages.enums.hamburgermenutype.HamburgerSubMenuType;
import com.cbh.pages.pagecomponents.homepage.HamburgerComponent;
import com.cbh.utils.PageActionHelpers;
import org.openqa.selenium.By;

public class AmazonHomePage {

    private HamburgerComponent hamburgerComponent;
    private static final By HAMBURGER_LINK = By.xpath("//span[text()='All' and @class='hm-icon-label']/parent::a");

    public HamburgerComponent getHamburgerComponent(){
        return hamburgerComponent;
    }

    public AmazonHomePage(){
        this.hamburgerComponent = new HamburgerComponent();
    }

    public AmazonHomePage clickOnHamburgerLink(){
        PageActionHelpers.waitAndClick(HAMBURGER_LINK);
        return this;
    }

    public AmazonSubItemPage navigateToHamburgerSubMenuItem(){
            new AmazonHomePage().clickOnHamburgerLink().getHamburgerComponent()
                .clickHamburgerMenuItem(HamburgerMenuType.TVAPPLIANCESElECTRONICS)
                .clickHamburgerSubMenuItem(HamburgerSubMenuType.TELEVISIONS);
            return new AmazonSubItemPage();
    }

}
