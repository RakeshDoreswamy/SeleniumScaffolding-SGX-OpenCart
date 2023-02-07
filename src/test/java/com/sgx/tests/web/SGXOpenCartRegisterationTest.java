package com.sgx.tests.web;

import com.sgx.pages.OpenCartHomePage;
import com.sgx.pages.OpenCartRegistrationPage;
import com.sgx.utils.PageActionHelpers;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SGXOpenCartRegisterationTest extends Base{

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"TOM" ,"ROSENTHAL","tomrosenthal@gmail.com","password"}
        };
    }

    @Test  (dataProvider = "getData")
    public void registerUser(String firstName,String lastName,String email,String password){
        new OpenCartHomePage().navigateToRegisterationPage();
        PageActionHelpers.jsWaitForLoad(120);
        new OpenCartRegistrationPage().setFirstname(firstName).setLastName(lastName).setEmail(email).setPassword(password).clickOnNewLetterYesRadioButton().clickOnAgreeCheckbox().clickOnContinueBtn();

    }
}
