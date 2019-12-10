package com.spartaglobal.ASOS_Automation;

import static org.junit.Assert.assertTrue;

import com.spartaglobal.ASOS_Automation.SeleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ASOSSiteTest {

    private static ASOSSite asosSite;

    @BeforeClass
    public static void setup(){
        SeleniumConfig chromeDriverConfig = new SeleniumConfig("chrome", "C:\\Users\\danaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
        asosSite = new ASOSSite(chromeDriverConfig.getDriver());

        asosSite.asosHomepage().goToHomepage();
       // asosSite.asosDresses().clickOnClothing().goToDresses();
        asosSite.asosAccount().clickMyAccount();


    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}