package com.spartaglobal.ASOS_Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ASOSDresses {

    private WebDriver driver;

    private By clothingPage = By.xpath("//*[@id=\"chrome-sticky-header\"]/div[2]/div[1]/nav/div/div[1]/button[2]/span/span");
    private By dressLink = By.linkText("Dresses");

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
}
