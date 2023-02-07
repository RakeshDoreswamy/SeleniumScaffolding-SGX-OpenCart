package com.sgx.pages;

import com.sgx.utils.PageActionHelpers;
import org.openqa.selenium.By;

public class OpenCartLoginPage {


    private static final By EMAIL_TXT = By.xpath("//input[@id='input-email']");

    private static final By PASSWORD_TXT = By.xpath("//input[@id='input-password']");

    private static final By LOGIN_BTN = By.xpath("//button[text()='Login']");


    public OpenCartLoginPage setEmail(String email){
        PageActionHelpers.waitAndSendkeys(EMAIL_TXT,email);
        return this;
    }

    public OpenCartLoginPage setPassword(String password){
        PageActionHelpers.waitAndSendkeys(PASSWORD_TXT,password);
        return this;
    }

    public OpenCartLoginPage clickOnLoginBtn(){
        PageActionHelpers.waitAndClick(LOGIN_BTN);
        return this;
    }

    public OpenCartLoginPage loginToApplication(String email, String password){
        new OpenCartLoginPage().setEmail(email).setPassword(password).clickOnLoginBtn();
        return this;
    }







}
