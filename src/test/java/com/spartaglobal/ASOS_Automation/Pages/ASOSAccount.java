package com.spartaglobal.ASOS_Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ASOSAccount {

    private WebDriver driver;

    private By myAccountDropDown = By.id("myAccountDropdown");
    private By signIn = By.linkText("My Account");

    public ASOSAccount(WebDriver driver) {
        this.driver = driver;
    }

    public ASOSAccount clickAccountDropDown(){
        driver.findElement(myAccountDropDown).click();
        return this;
    }

    public ASOSAccount clickMyAccount(){
        driver.findElement(signIn).click();
        return this;
    }
}
