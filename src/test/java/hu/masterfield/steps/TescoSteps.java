package hu.masterfield.steps;

import com.codeborne.selenide.Configuration;
import hu.masterfield.pages.HomePage;
import hu.masterfield.pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;


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

        RegistrationPage registrationPage = new RegistrationPage();
        assertEquals("1", registrationPage.stageNumber.getText());
    }


    @And("click on submit button")
    public void clickOnSubmitButton() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.clickSubmit();
    }

    @When("the user fills out the <email>, <password>, <password confirmation>")
    public void theUserFillsOutTheEmailPasswordPasswordConfirmation() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.setRegStage1();
    }

    @Then("the user should be able to access their new account")
    public void theUserShouldBeAbleToAccessTheirNewAccount() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.validateRegSuccess();
    }

    @And("selects <county>, <municipality>, <postal code>, <street>, <house number>, <address name>")
    public void selectsCountyMunicipalityPostalCodeStreetHouseNumberAddressName() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.setRegStage2();
    }

    @And("enter <first name>, <last name>, <phone number>")
    public void enterFirstNameLastNamePhoneNumber() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.setRegStage3();
    }

    @And("accept registration consent")
    public void acceptRegistrationConsent() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.regConstCheckBox();
    }

    @And("click on <registration submit> button")
    public void clickOnRegistrationSubmitButton() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.finalizeReg();
    }
}
