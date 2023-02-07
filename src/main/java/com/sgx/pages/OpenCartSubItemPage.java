package com.sgx.pages;

import com.sgx.pages.enums.refinementbrand.RefinementBrandName;
import com.sgx.pages.pagecomponents.submenuitempage.RefinementComponent;
import com.sgx.pages.validator.OpenCartSubItemPageValidator;
import com.sgx.utils.PageActionHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OpenCartSubItemPage {

    private static final By MONITOR_HEADER = By.xpath("//div[@id='content']/h2");
    private RefinementComponent refinementComponent;

    public RefinementComponent getRefinementComponent(){
        return refinementComponent;
    }

    public OpenCartSubItemPage(){
        this.refinementComponent = new RefinementComponent();
    }

    public OpenCartSubItemResultPage navigateToHamburgerSubMenuResultPage(){
        new OpenCartSubItemPage()
                .getRefinementComponent()
                .clickRefinementBrandLink(RefinementBrandName.SAMSUNG);

        return new OpenCartSubItemResultPage();
    }

    public static String getMonitorHeader(){
       return PageActionHelpers.getTextFromElement(MONITOR_HEADER, WebElement::getText);

    }

    public OpenCartSubItemPageValidator getCartOpenSubItemPageValidator(){
         PageActionHelpers.jsWaitForLoad(120);
         return OpenCartSubItemPageValidator.builder().topTVBrandsHeader(OpenCartSubItemPage.getMonitorHeader()).build();
    }



}
