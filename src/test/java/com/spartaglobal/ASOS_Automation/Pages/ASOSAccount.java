package com.spartaglobal.ASOS_Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ASOSAccount {

    private WebDriver driver;

    private By myAccountDropDown = By.id("myAccountDropdown");
    private By signIn = By.linkText("My Account");
    private String accountURL = "https://my.asos.com/identity/login?signin=860786b85c025e7a7bfa6bc5c2bcdb76";

    public ASOSAccount(WebDriver driver) {
        this.driver = driver;
    }

    public ASOSAccount goToLogInPage(){
        driver.navigate().to(accountURL);
        return this;
    }

//    public ASOSAccount clickAccountDropDown(){
//        driver.findElement(myAccountDropDown).click();
//        return this;
//    }
//
//    public ASOSAccount clickMyAccount(){
//        driver.findElement(signIn).click();
//        return this;
//    }
}
