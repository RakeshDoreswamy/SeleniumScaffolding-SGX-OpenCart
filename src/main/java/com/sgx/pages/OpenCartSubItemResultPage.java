package com.sgx.pages;

import com.sgx.driver.DriverManager;
import com.sgx.pages.validator.OpenCartSubItemResultPageValidator;
import com.sgx.utils.PageActionHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class OpenCartSubItemResultPage {

   private static final By RESULT_HEADER = By.xpath("//div[@class='col-sm']/h1");

    public static String getResultHeader(){
        return PageActionHelpers.getTextFromElement(RESULT_HEADER, WebElement::getText);

    }

    public OpenCartSubItemResultPageValidator getOpenCartSubItemResultPageValidator(){
        PageActionHelpers.jsWaitForLoad(120);
        return OpenCartSubItemResultPageValidator.builder().resultsHeader(OpenCartSubItemResultPage.getResultHeader()).build();
    }

}
