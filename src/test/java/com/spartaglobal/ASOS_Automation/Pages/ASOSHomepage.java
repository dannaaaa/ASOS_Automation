package com.spartaglobal.ASOS_Automation.Pages;

import org.openqa.selenium.WebDriver;

public class ASOSHomepage {

    private WebDriver driver;
    private String homepageURL = "https://www.asos.com/women/";

    public ASOSHomepage(WebDriver driver) {
        this.driver = driver;
    }

    public ASOSHomepage goToHomepage(){
        driver.navigate().to(homepageURL);
        return this;
    }

}
