package com.spartaglobal.ASOS_Automation;

import com.spartaglobal.ASOS_Automation.Pages.ASOSAccount;
import com.spartaglobal.ASOS_Automation.Pages.ASOSDresses;
import com.spartaglobal.ASOS_Automation.Pages.ASOSHomepage;
import org.openqa.selenium.WebDriver;

public class ASOSSite {

    private WebDriver driver;
    private ASOSHomepage asosHomepage;
    private ASOSDresses asosDresses;

    public ASOSSite(WebDriver driver) {
        this.driver = driver;
        //driver.manage().window().maximize();

        this.asosHomepage = new ASOSHomepage(driver);
        this.asosDresses = new ASOSDresses(driver);
    }

    public ASOSHomepage asosHomepage(){
        return asosHomepage;
    }

    public ASOSDresses asosDresses(){
        return asosDresses;
    }

    public ASOSAccount asosAccount(){
        return asosAccount();
    }
}
