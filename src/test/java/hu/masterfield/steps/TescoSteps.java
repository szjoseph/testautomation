package hu.masterfield.steps;

import hu.masterfield.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class TescoSteps {
    @Given("open main page")
    public void openMainPage() {
        open("https://bevasarlas.tesco.hu/groceries/hu-HU");
    }

    @And("language is set to {string}")
    public void languageIsSetTo(String arg0) {
        HomePage homePage = new HomePage();
        homePage.isSetToHungarian();

    }

    @When("clicking on {string}")
    public void clickingOn(String arg0) {
        HomePage homePage = new HomePage();
        homePage.acceptCookies();
    }

    @Then("the cookie panel closes.")
    public void theCookiePanelCloses() {
        HomePage homePage = new HomePage();
        homePage.cookiePanelNotVisible();
    }
}
