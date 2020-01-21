package com.spartaglobal.ASOS_Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ASOSDresses {

    private WebDriver driver;

    private By clothingPage = By.xpath("//*[@id=\"chrome-sticky-header\"]/div[2]/div[1]/nav/div/div[1]/button[2]/span/span");
    private By dressLink = By.linkText("Dresses");
    private By eveningDresses = By.xpath("//*[@id=\"category-banner-wrapper\"]/div/div/div[2]/div/div/a[1]");
    private By selectDress = By.xpath("//*[@id=\"product-13024454\"]/a/div[1]/img");
    private By sizeDrpDown = By.xpath("/html/body/main/div[1]/section[1]/div/div[2]/div[4]/div[1]/section/div/div[1]/div[2]/select");
    private By getSize = By.linkText("UK 12");
    private By addToCartButton = By.xpath("//*[@id=\"product-add\"]/div/a/span[2]");

    public ASOSDresses(WebDriver driver) {
        this.driver = driver;
    }

    public ASOSDresses clickOnClothing(){
        driver.findElement(clothingPage).click();
        return this;
    }

    public ASOSDresses goToDresses(){
        driver.findElement(dressLink).click();
        return this;
    }

    public ASOSDresses goToEveningDresses (){
        driver.findElement(eveningDresses).click();
        return this;
    }

    public ASOSDresses selectDress(){
        driver.findElement(selectDress).click();
        return this;
    }

    public ASOSDresses selectSize(){
        driver.findElement(sizeDrpDown).click();
        return this;
    }

    public ASOSDresses clickOnSize (){
        driver.findElement(getSize).click();
        return this;
    }

    public ASOSDresses addToBagButton(){
        driver.findElement(addToCartButton).click();
        return this;
    }
}
