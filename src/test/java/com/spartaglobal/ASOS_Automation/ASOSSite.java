package com.spartaglobal.ASOS_Automation;

import com.spartaglobal.ASOS_Automation.Pages.ASOSSignIn;
import com.spartaglobal.ASOS_Automation.Pages.ASOSDresses;
import com.spartaglobal.ASOS_Automation.Pages.ASOSHomepage;
import org.openqa.selenium.WebDriver;

public class ASOSSite {

    private WebDriver driver;
    private ASOSHomepage asosHomepage;
    private ASOSDresses asosDresses;
    private ASOSSignIn asosSignIn;

    public ASOSSite(WebDriver driver) {
        this.driver = driver;
        //driver.manage().window().maximize();

        this.asosHomepage = new ASOSHomepage(driver);
        this.asosDresses = new ASOSDresses(driver);
        this.asosSignIn = new ASOSSignIn(driver);

    }

    public ASOSHomepage asosHomepage(){
        return asosHomepage;
    }

    public ASOSDresses asosDresses(){
        return asosDresses;
    }

    public ASOSSignIn asosSignIn(){
        return asosSignIn();
    }
}
