package com.cbh.pages.pagecomponents.submenuitempage;

import com.cbh.driver.DriverManager;
import com.cbh.pages.AmazonSubItemResultPage;
import com.cbh.pages.enums.refinementbrand.RefinementBrandName;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class RefinementComponent {

    private static final String REFINEMENT_BRANDS_CHECKBOX = "//span[text()='Brands']/../parent::div//li[contains(.,'%s')]//child::input";


    public AmazonSubItemResultPage checkRefinementBrandCheckbox(RefinementBrandName refinementBrandName){
        String xpath = String.format(REFINEMENT_BRANDS_CHECKBOX, refinementBrandName.getName());
        JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver();
        js.executeScript("arguments[0].click();",DriverManager.getDriver().findElement(By.xpath(xpath)));


        return new AmazonSubItemResultPage();
    }
}
