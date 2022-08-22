package com.cbh.tests.web;

import com.cbh.extentreports.ExtentReport;
import com.cbh.pages.AmazonHomePage;
import com.cbh.pages.AmazonSubItemPage;
import com.cbh.pages.AmazonSubItemResultPage;
import com.cbh.pages.enums.hamburgermenutype.HamburgerMenuType;
import com.cbh.pages.enums.hamburgermenutype.HamburgerSubMenuType;
import com.cbh.pages.enums.refinementbrand.RefinementBrandName;
import com.cbh.pages.validator.AmazonSubItemPageValidator;
import com.cbh.pages.validator.AmazonSubItemResultPageValidator;
import com.cbh.tests.web.asserts.AmazonSubItemPageAssert;
import com.cbh.tests.web.asserts.AmazonSubItemResultPageAssert;
import com.cbh.utils.PageActionHelpers;
import org.testng.annotations.Test;

public class AmazonTest extends Base{

    @Test
    public void navigateToHamburgerSubMenuItem(){
        ExtentReport.createTest("navigateToHamburgerSubMenuItem");

        AmazonSubItemPageValidator amazonSubItemPageValidator = new AmazonHomePage().clickOnHamburgerLink().getHamburgerComponent()
                .clickHamburgerMenuItem(HamburgerMenuType.TVAPPLIANCESElECTRONICS)
                .clickHamburgerSubMenuItem(HamburgerSubMenuType.TELEVISIONS).getAmazonSubItemPageValidator();

        AmazonSubItemPageAssert.assertThat(amazonSubItemPageValidator)
                        .topTVBrandsHeaderNameEquals("Top TV brands");


        PageActionHelpers.jsWaitForLoad(120);

        AmazonSubItemResultPageValidator amazonSubItemResultPageValidator = new AmazonSubItemPage().getRefinementComponent().checkRefinementBrandCheckbox(RefinementBrandName.SAMSUNG).getAmazonSubItemResultPageValidator();

        AmazonSubItemResultPageAssert.assertThat(amazonSubItemResultPageValidator).resultHeaderNameEquals("RESULTS");
                new AmazonSubItemResultPage()
                .clickOnPopOverItem("Price: High to Low")
                .clickOnItem("2")
                .switchToProductWindow();


        AmazonSubItemResultPageAssert.assertThat(amazonSubItemResultPageValidator).aboutThisItemNameEquals(" About this item ");
        //Assertions.assertThat(isAboutThisItemDisplayed);

    }
}
