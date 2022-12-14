package hu.masterfield.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage3 {
    public void setRegStage3() {

        SelenideElement firstName = $("#firstName");
        SelenideElement lastName = $("#lastName");
        SelenideElement primaryPhone = $("#primaryPhone");
        SelenideElement consentCheckBox = $(byXpath("//*[@id=\"personalDetails\"]/ul[4]/li/div/label"));
        SelenideElement regFinalizeBtn = $(byText("Igen, regisztrálok"));

        firstName.setValue("Elek");
        lastName.click();
        lastName.sendKeys("Teszt");
        primaryPhone.setValue("00000000000");

        consentCheckBox.click();
        regFinalizeBtn.click();
    }
}
