package com.spartaglobal.ASOS_Automation.StepDefs;

import com.spartaglobal.ASOS_Automation.ASOSSite;
import com.spartaglobal.ASOS_Automation.SeleniumConfig.SeleniumConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;

public class DressStepDefs {


    private SeleniumConfig chromeDriverConfig = new SeleniumConfig("chrome", "C:\\Users\\danaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
    private ASOSSite asosSite = new ASOSSite(chromeDriverConfig.getDriver());


    @Given("I am on the homepage")
    public void iAmOnTheHomePage(){
        asosSite.asosHomepage().goToHomepage();
    }


    @When("I click on clothing")
    public void iClickOnClothing() {
        asosSite.asosDresses().clickOnClothing();
    }


    @And("I should click on th dresses button")
    public void iShouldClickOnThDressesButton() {
        asosSite.asosDresses().clickOnClothing().selectDress();
    }


    @Then("I am taken to the dresses page")
    public void iAmTakenToTheDressesPage() {
        asosSite.asosHomepage().goToHomepage();
        asosSite.asosDresses().clickOnClothing().selectDress();
}


    @Given("I am on the dresses page")
    public void iAmOnTheDressesPage() {
        String currUrl = chromeDriverConfig.getDriver().getCurrentUrl();
        asosSite.asosDresses().clickOnClothing().selectDress();
        Assert.assertEquals("https://www.asos.com/women/dresses/cat/?cid=8799&nlid=ww|clothing|shop+by+product", currUrl);
    }

    @When("I click on evening dress")
    public void iClickOnEveningDress() {
        asosSite.asosHomepage().goToHomepage();
        asosSite.asosDresses().clickOnClothing().selectDress().goToEveningDresses();

    }

    @And("I am taken to the page with evening dresses")
    public void iAmTakenToThePageWithEveningDresses() {
        asosSite.asosHomepage().goToHomepage();
        asosSite.asosDresses().clickOnClothing().selectDress().goToEveningDresses();
        String currUrl = chromeDriverConfig.getDriver().getCurrentUrl();
        Assert.assertEquals("https://www.asos.com/women/dresses/evening-dresses/cat/?cid=8857&ctaref=cat_header", currUrl);
    }

    @Then("I select a dress that I wish to purchase")
    public void iSelectADressThatIWishToPurchase() {
        asosSite.asosHomepage().goToHomepage();
        asosSite.asosDresses().clickOnClothing().goToDresses().goToEveningDresses().selectDress();
    }

    @Given("I am on the dress product page")
    public void iAmOnTheDressProductPage() {
        String currUrl = chromeDriverConfig.getDriver().getCurrentUrl();
        Assert.assertEquals("https://www.asos.com/asos-design/asos-design-one-shoulder-tulle-wired-hem-maxi-dress/prd/13024454?clr=forest-green&colourWayId=16526780&SearchQuery=&cid=8857", currUrl);
    }

    @When("I select a size")
    public void iSelectASize() {
        asosSite.asosHomepage().goToHomepage();
        asosSite.asosDresses().clickOnClothing().goToDresses().goToEveningDresses().selectDress().selectSize();
    }

    @And("click add to basket")
    public void clickAddToBasket() {
        asosSite.asosHomepage().goToHomepage();
        asosSite.asosDresses().clickOnClothing().goToDresses().goToEveningDresses().selectDress().selectSize().addToBagButton();
    }

    @Then("my item should be in the basket")
    public void myItemShouldBeInTheBasket() {
    }
}
