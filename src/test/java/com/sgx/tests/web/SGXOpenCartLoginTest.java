package com.sgx.tests.web;

import com.sgx.pages.OpenCartHomePage;
import com.sgx.pages.OpenCartLoginPage;
import com.sgx.pages.OpenCartRegistrationPage;
import com.sgx.utils.PageActionHelpers;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SGXOpenCartLoginTest extends Base{

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"tomrosenthal@gmail.com","password"}
        };
    }

    @Test  (dataProvider = "getData")
    public void UserLogin(String email,String password){
        new OpenCartHomePage().navigateToLoginPage();
        PageActionHelpers.jsWaitForLoad(120);
        new OpenCartLoginPage().setEmail(email).setPassword(password).clickOnLoginBtn();
    }
}
