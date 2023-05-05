package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By emaiField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By errorProductsText = By.xpath("//div/span[text()='Products']");


    public void enterUserName(String userName) {
        sendTextToElement(emaiField, userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void getErrorText(){
        clickOnElement(errorProductsText);
    }
}
