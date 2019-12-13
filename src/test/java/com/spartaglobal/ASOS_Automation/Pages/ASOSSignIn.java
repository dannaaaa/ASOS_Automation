package com.spartaglobal.ASOS_Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ASOSSignIn {

    private WebDriver driver;

    private By myAccountDropDown = By.cssSelector("#myAccountDropdown > button");
    private By signIn = By.linkText("My Account");
    private String accountURL = "https://my.asos.com/identity/login?signin=860786b85c025e7a7bfa6bc5c2bcdb76";
    private By passwordBox = By.className("qa-password-textbox");
    private By emailBox = By.className("qa-email-textbox");
    private By signInButton = By.id("signin");
    private By emailErroriD = By.id("EmailAddress-error");
    private By passwordErrorId = By.id("Password-error");

    public ASOSSignIn(WebDriver driver) {
        this.driver = driver;
    }

    public ASOSSignIn goToLogInPage(){
        driver.navigate().to(accountURL);
        return this;
    }

    public ASOSSignIn clickAccountDropDown(){
        driver.findElement(myAccountDropDown).click();
        return this;
    }

    public ASOSSignIn clickMyAccount(){
        driver.findElement(signIn).click();
        return this;
    }

    public ASOSSignIn inputPassword(String password){
        driver.findElement(passwordBox).sendKeys(password);
        return this;
    }

    public ASOSSignIn inputEmail(String email){
        driver.findElement(emailBox).sendKeys(email);
        return this;
    }

    public ASOSSignIn clickSignInButton(){
        driver.findElement(signInButton).click();
        return this;
    }

    public String getEmailAddrressErrorMessageText(){
        return driver.findElement(emailErroriD).getText();
    }

    public String getPasswordErrorMessageText(){
        return driver.findElement(passwordErrorId).getText();
    }



}
