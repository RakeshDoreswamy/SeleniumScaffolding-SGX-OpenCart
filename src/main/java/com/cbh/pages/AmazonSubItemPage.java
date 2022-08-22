package com.cbh.pages;

import com.cbh.pages.enums.refinementbrand.RefinementBrandName;
import com.cbh.pages.pagecomponents.submenuitempage.RefinementComponent;
import com.cbh.pages.validator.AmazonSubItemPageValidator;
import com.cbh.utils.PageActionHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonSubItemPage {

    private static final By TOP_TV_BRAND_HEADER = By.xpath("//div[@class='sl-sobe-carousel-header']/h2");
    private RefinementComponent refinementComponent;

    public RefinementComponent getRefinementComponent(){
        return refinementComponent;
    }

    public AmazonSubItemPage(){
        this.refinementComponent = new RefinementComponent();
    }

    public AmazonSubItemResultPage navigateToHamburgerSubMenuResultPage(){
        new AmazonSubItemPage()
                .getRefinementComponent()
                .checkRefinementBrandCheckbox(RefinementBrandName.SAMSUNG);

        return new AmazonSubItemResultPage();
    }

    public static String getTopTVBrandsHeader(){
       return PageActionHelpers.getTextFromElement(TOP_TV_BRAND_HEADER, WebElement::getText);

    }

    public AmazonSubItemPageValidator getAmazonSubItemPageValidator(){
         PageActionHelpers.jsWaitForLoad(120);
         return AmazonSubItemPageValidator.builder().topTVBrandsHeader(AmazonSubItemPage.getTopTVBrandsHeader()).build();
    }



}
