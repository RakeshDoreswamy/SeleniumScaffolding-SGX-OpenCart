package com.cbh.pages;

import com.cbh.driver.DriverManager;
import com.cbh.pages.validator.AmazonSubItemResultPageValidator;
import com.cbh.utils.PageActionHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class AmazonSubItemResultPage {

    private static final By POPOVER_DROPDOWN = By.xpath("//select[@data-action='a-dropdown-select']");
    private static final By DATACOMPONENT_ITEM_2 = By.xpath("//div[@data-component-type='s-search-result'][position()=2]");
    private static final By ABOUTTHISITEM_SECTION = By.xpath("//h1[normalize-space(text())='About this item']");
    private static final By RESULT_HEADER = By.xpath("//span[@class='a-size-medium-plus a-color-base a-text-normal']");

    public AmazonSubItemResultPage clickOnPopOverItem(String popoverSelectionValue){
        PageActionHelpers.select(POPOVER_DROPDOWN,e->e.selectByVisibleText(popoverSelectionValue));
        return this;
    }

    public AmazonSubItemResultPage clickOnItem(String nthItemToBeClicked){
        PageActionHelpers.waitAndClick(By.xpath("//div[@data-component-type='s-search-result'][position()="+nthItemToBeClicked+"]//child::h2/a"));
        return this;
    }

    public static String getResultHeader(){
        return PageActionHelpers.getTextFromElement(RESULT_HEADER, WebElement::getText);

    }

    public AmazonSubItemResultPageValidator getAmazonSubItemResultPageValidator(){
        PageActionHelpers.jsWaitForLoad(120);
        return AmazonSubItemResultPageValidator.builder().resultsHeader(AmazonSubItemResultPage.getResultHeader()).build();
    }

    public AmazonSubItemResultPage switchToProductWindow(){
        String parentWindow = DriverManager.getDriver().getWindowHandle();
        System.out.println("Parent Window is : "+parentWindow);
        new WebDriverWait(DriverManager.getDriver(),10).until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> allWindows = DriverManager.getDriver().getWindowHandles();
        System.out.println("Window Handles are : "+allWindows);
        for(String window : allWindows){
            if(!parentWindow.equals(window)){
                DriverManager.getDriver().switchTo().window(window);
                System.out.println("Title Of the Page is : "+DriverManager.getDriver().switchTo().window(window).getTitle());
            }
        }
        return this;
    }


    public String assertAboutThisItemSection(){
       return PageActionHelpers.getTextFromElement(ABOUTTHISITEM_SECTION, WebElement::getText);
    }

}
