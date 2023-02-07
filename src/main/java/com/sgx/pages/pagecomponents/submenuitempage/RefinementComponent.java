package com.sgx.pages.pagecomponents.submenuitempage;

import com.sgx.driver.DriverManager;
import com.sgx.pages.OpenCartSubItemResultPage;
import com.sgx.pages.enums.refinementbrand.RefinementBrandName;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class RefinementComponent {

    private static final String REFINEMENT_BRANDS_LINK = "//a[contains(text(),'%s')]";


    public OpenCartSubItemResultPage clickRefinementBrandLink(RefinementBrandName refinementBrandName){
        String xpath = String.format(REFINEMENT_BRANDS_LINK, refinementBrandName.getName());
        JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver();
        js.executeScript("arguments[0].click();",DriverManager.getDriver().findElement(By.xpath(xpath)));


        return new OpenCartSubItemResultPage();
    }
}
