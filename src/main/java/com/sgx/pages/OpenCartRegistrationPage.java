package com.sgx.pages;

import com.sgx.utils.PageActionHelpers;
import org.openqa.selenium.By;

public class OpenCartRegistrationPage {

    private static final By FIRSTNAME_TXT = By.xpath("//input[@id='input-firstname']");

    private static final By LASTNAME_TXT = By.xpath("//input[@id='input-lastname']");

    private static final By EMAIL_TXT = By.xpath("//input[@id='input-email']");

    private static final By PASSWORD_TXT = By.xpath("//input[@id='input-password']");

    private static final By NEWSLETTER_RADIO = By.xpath("//input[@id='input-newsletter-yes']");

    private static final By AGREE_CHECK = By.xpath("//input[@name='agree']");

    private static final By CONTINUE_BTN = By.xpath("//button[text()='Continue']");

    public OpenCartRegistrationPage setFirstname(String firstName){
        PageActionHelpers.waitAndSendkeys(FIRSTNAME_TXT,firstName);
        return this;
    }

    public OpenCartRegistrationPage setLastName(String lastName){
        PageActionHelpers.waitAndSendkeys(LASTNAME_TXT,lastName);
        return this;
    }

    public OpenCartRegistrationPage setEmail(String email){
        PageActionHelpers.waitAndSendkeys(EMAIL_TXT,email);
        return this;
    }

    public OpenCartRegistrationPage setPassword(String password){
        PageActionHelpers.waitAndSendkeys(PASSWORD_TXT,password);
        return this;
    }

    public OpenCartRegistrationPage clickOnNewLetterYesRadioButton(){
        PageActionHelpers.waitAndClick(NEWSLETTER_RADIO);
        return this;
    }

    public OpenCartRegistrationPage clickOnAgreeCheckbox(){
        PageActionHelpers.waitAndClick(AGREE_CHECK);
        return this;
    }

    public OpenCartRegistrationPage clickOnContinueBtn(){
        PageActionHelpers.waitAndClick(CONTINUE_BTN);
        return this;
    }

    public OpenCartRegistrationPage registerWithDetails(String firstName, String lastName, String email, String password){
        new OpenCartRegistrationPage().setFirstname(firstName).setLastName(lastName).setEmail(email).setPassword(password).clickOnNewLetterYesRadioButton().clickOnAgreeCheckbox().clickOnContinueBtn();
        return this;
    }







}
