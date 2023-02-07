package com.sgx.tests.web;

import com.sgx.pages.OpenCartAddToCartPage;
import com.sgx.pages.OpenCartHomePage;
import com.sgx.pages.OpenCartSubItemPage;
import com.sgx.pages.enums.hamburgermenutype.HamburgerMenuType;
import com.sgx.pages.enums.hamburgermenutype.HamburgerSubMenuType;
import com.sgx.pages.enums.refinementbrand.RefinementBrandName;
import com.sgx.pages.validator.OpenCartSubItemPageValidator;
import com.sgx.pages.validator.OpenCartSubItemResultPageValidator;
import com.sgx.tests.web.asserts.OpenCartSubItemPageAssert;
import com.sgx.tests.web.asserts.OpenCartSubItemResultPageAssert;
import com.sgx.utils.PageActionHelpers;
import org.testng.annotations.Test;

public class SGXOpenCartAddToCartTestApple extends Base{

    @Test
    public void addProductToCart_Apple(){

        OpenCartSubItemPageValidator openCartSubItemPageValidator = new OpenCartHomePage().clickOnOpenCartLink().getHamburgerComponent()
                .clickHamburgerMenuItem(HamburgerMenuType.COMPONENTS)
                .clickHamburgerSubMenuItem(HamburgerSubMenuType.MONITORS).getCartOpenSubItemPageValidator();

        OpenCartSubItemPageAssert.assertThat(openCartSubItemPageValidator)
                .monitorHeaderNameEquals("Monitors");


        PageActionHelpers.jsWaitForLoad(120);

        OpenCartSubItemResultPageValidator openCartSubItemResultPageValidator = new OpenCartSubItemPage().getRefinementComponent().clickRefinementBrandLink(RefinementBrandName.APPLE).getOpenCartSubItemResultPageValidator();

        new OpenCartAddToCartPage().clickOnSizeRadio().clickOnPriceCheckbox().selectColor().enterTextInTextArea("TextToBeFilled").uploadFile("C:\\Users\\rakes\\Downloads\\SGX-OpenCart\\SGXOpenCart.txt").clickOnAddToCart();

    }
}
