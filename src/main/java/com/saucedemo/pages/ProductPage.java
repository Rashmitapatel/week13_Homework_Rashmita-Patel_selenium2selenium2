package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {
    By errorProductsText = By.xpath("//div/span[text()='Products']");
    By errorProductNumber = By.className("inventory_item");
    public String getErrorText(){
        return getTextFromElement(errorProductsText);
    }

    public int getProductsError(){
        List<WebElement> list = driver.findElements(errorProductNumber);
        int actualNumber = list.size();
        return actualNumber;
    }
}
