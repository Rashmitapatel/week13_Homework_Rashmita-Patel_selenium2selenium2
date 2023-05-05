package com.saucedemo.testsuite;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductPage productsPage = new ProductPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedText = "PRODUCTS";
        Assert.assertEquals(productsPage.getErrorText(), expectedText, "Products not displayed" );

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        int expectedNumber = 6;
        Assert.assertEquals(productsPage.getProductsError(), expectedNumber, "Products number is wrong");
    }

}
