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
    Select drpSize = new Select(driver.findElement(By.xpath("//*[@id=\"main-size-select-0\"]")));
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
        drpSize.selectByVisibleText("UK 14");
        return this;
    }

    public ASOSDresses addToBagButton(){
        driver.findElement(addToCartButton).click();
        return this;
    }
}
