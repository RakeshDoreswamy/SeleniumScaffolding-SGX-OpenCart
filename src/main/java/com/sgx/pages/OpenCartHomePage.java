package com.sgx.pages;

import com.sgx.pages.enums.hamburgermenutype.HamburgerMenuType;
import com.sgx.pages.enums.hamburgermenutype.HamburgerSubMenuType;
import com.sgx.pages.pagecomponents.homepage.HamburgerComponent;
import com.sgx.utils.PageActionHelpers;
import org.openqa.selenium.By;

public class OpenCartHomePage {

    private HamburgerComponent hamburgerComponent;
    private static final By OPENCART_LINK = By.xpath("//img[@title='Your Store']");

    private static final By MYACCOUNT_EXPANARROW = By.xpath("//span[text()='My Account']/parent::a//i[@class='fas fa-caret-down']");

    private static final By REGISTER_LINK = By.xpath("//a[text()='Register']");

    private static final By LOGIN_LINK = By.xpath("//a[text()='Login']");

    public OpenCartHomePage clickOnMyAccountLink(){
        PageActionHelpers.waitAndClick(MYACCOUNT_EXPANARROW);
        return this;
    }

    public OpenCartHomePage clickOnRegisterLink(){
        PageActionHelpers.waitAndClick(REGISTER_LINK);
        return this;
    }

    public OpenCartHomePage clickOnLoginLink(){
        PageActionHelpers.waitAndClick(LOGIN_LINK);
        return this;
    }

    public OpenCartRegistrationPage navigateToRegisterationPage(){
        new OpenCartHomePage().clickOnMyAccountLink().clickOnRegisterLink();
        return new OpenCartRegistrationPage();
    }

    public OpenCartLoginPage navigateToLoginPage(){
        new OpenCartHomePage().clickOnMyAccountLink().clickOnLoginLink();
        return new OpenCartLoginPage();
    }

    public HamburgerComponent getHamburgerComponent(){
        return hamburgerComponent;
    }

    public OpenCartHomePage(){
        this.hamburgerComponent = new HamburgerComponent();
    }

    public OpenCartHomePage clickOnOpenCartLink(){
        PageActionHelpers.waitAndClick(OPENCART_LINK);
        return this;
    }

    public OpenCartSubItemPage navigateToHamburgerSubMenuItem(){
            new OpenCartHomePage().clickOnOpenCartLink().getHamburgerComponent()
                .clickHamburgerMenuItem(HamburgerMenuType.COMPONENTS)
                .clickHamburgerSubMenuItem(HamburgerSubMenuType.MONITORS);
            return new OpenCartSubItemPage();
    }

}
