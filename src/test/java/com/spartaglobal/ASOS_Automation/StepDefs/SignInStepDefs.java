package com.spartaglobal.ASOS_Automation.StepDefs;

import com.spartaglobal.ASOS_Automation.ASOSSite;
import com.spartaglobal.ASOS_Automation.SeleniumConfig.SeleniumConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;

public class SignInStepDefs {

    private static ASOSSite asosSite;

    @Before
    public static void setup(){

        SeleniumConfig chromeDriverConfig = new SeleniumConfig("chrome", "C:\\Users\\danaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
        asosSite = new ASOSSite(chromeDriverConfig.getDriver());
    }

    @Given("I am on the sign in page")
    public void iAmOnTheSignInPage() {
        asosSite.asosSignIn().goToLogInPage();
    }

    @When("I enter a valid email")
    public void iEnterAValidEmail() {
        asosSite.asosSignIn().inputEmail("test@test.com");
    }

    @And("I input a invalid <password>")
    public void iInputAInvalidPassword() {
        asosSite.asosSignIn().inputPassword(" ");
    }

    @Then("I get receive an  <error> message")
    public void iGetReceiveAnErrorMessage() {
        asosSite.asosSignIn().clickSignInButton();
        System.out.println(asosSite.asosSignIn().getPasswordErrorMessageText());
    }

    @When("I enter a invalid <email>")
    public void iEnterAInvalidEmail() {
        asosSite.asosSignIn().inputEmail("test@t");
    }

    @And("I input a valid password")
    public void iInputAValidPassword() {
        asosSite.asosSignIn().inputPassword("test123");
    }


}
