package hu.masterfield.steps;

import com.codeborne.selenide.Configuration;
import hu.masterfield.pages.HomePage;
import hu.masterfield.pages.RegistrationPage1;
import hu.masterfield.pages.RegistrationPage2;
import hu.masterfield.pages.RegistrationPage3;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;


public class TescoSteps {

    @Given("open main page")
    public void openMainPage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        Configuration.browserCapabilities = options;

        open("https://bevasarlas.tesco.hu/groceries/hu-HU");
    }

    @And("language is set to {string}")
    public void languageIsSetTo() {
        HomePage homePage = new HomePage();
        homePage.isSetToHungarian();
    }

    @When("clicking on {string}")
    public void clickingOn() {
        HomePage homePage = new HomePage();
        homePage.acceptCookies();
    }

    @Then("the cookie panel closes.")
    public void theCookiePanelCloses() {
        HomePage homePage = new HomePage();
        homePage.cookiePanelNotVisible();
    }

    @Then("the user is on the sign up page")
    public void theUserIsOnTheSignUpPage() {
        HomePage homePage = new HomePage();
        homePage.clickRegistrationBtn();
    }

    @When("the user registers")
    public void theUserRegisters() {
        RegistrationPage1 registrationPage1 = new RegistrationPage1();
        RegistrationPage2 registrationPage2 = registrationPage1.setRegStage1();
        RegistrationPage3 registrationPage3 = registrationPage2.setRegStage2();
        registrationPage3.setRegStage3();
    }

    @Then("the user will have a profile")
    public void theUserWillHaveAProfile() {
        assertTrue($("#utility-header-orders-link").isDisplayed());
    }
}
