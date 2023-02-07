package com.sgx.pages;

import com.sgx.driver.DriverManager;
import com.sgx.utils.PageActionHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OpenCartAddToCartPage {

    public OpenCartAddToCartPage(){}

    private static final By ADD_TO_CART_BUTTON = By.xpath("//button[@id='button-cart']");
    private static final By QUANTITY_NUMBER = By.xpath("//input[@id='input-quantity']");
    private static final By SUCCESS_MESSAGE = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    private static final By SIZE_RADIO = By.xpath("//input[@id='input-option-value-7']");
    private static final By TEXTAREA = By.xpath("//textarea[@id='input-option-209']");

    private static final By PRICE_CHECK = By.xpath("//input[@id='input-option-value-8']");
    private static final By COLOR_DROPDOWN = By.xpath("//select[@id='input-option-217']");
    private static final By UPLOAD_BTN = By.xpath("//button[@id='button-upload-222']");


    public OpenCartAddToCartPage numberOfQuantity(String textToBeEntered){
        PageActionHelpers.waitAndClearText(QUANTITY_NUMBER);
        PageActionHelpers.waitAndSendkeys(QUANTITY_NUMBER,textToBeEntered);
        return this;
    }

    public String getSuccessMessage(){
        return PageActionHelpers.getTextFromElement(SUCCESS_MESSAGE, WebElement::getText);
    }

    public OpenCartAddToCartPage clickOnAddToCart(){
        PageActionHelpers.waitAndClick(ADD_TO_CART_BUTTON);
        return this;
    }

    public OpenCartAddToCartPage clickOnSizeRadio(){
        PageActionHelpers.waitAndClick(SIZE_RADIO);
        return this;
    }

    public OpenCartAddToCartPage clickOnPriceCheckbox(){
        PageActionHelpers.waitAndJSClick(PRICE_CHECK);
        return this;
    }

    public OpenCartAddToCartPage enterTextInTextArea(String textToBeEntered){
        PageActionHelpers.waitAndClearText(TEXTAREA);
        PageActionHelpers.waitAndSendkeys(TEXTAREA,textToBeEntered);
        return this;
    }

    public OpenCartAddToCartPage selectColor(){
        PageActionHelpers.select(COLOR_DROPDOWN,e->e.selectByValue("1"));
        return this;
    }

    public OpenCartAddToCartPage uploadFile(String filePath){
        PageActionHelpers.uploadFile(UPLOAD_BTN,filePath);
        return this;
    }



}
