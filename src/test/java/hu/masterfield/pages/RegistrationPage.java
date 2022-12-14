package hu.masterfield.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.UUID;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

public class RegistrationPage {
    public SelenideElement stageNumber = $(".progress-bar__stage-number");
    SelenideElement inputEmail = $("#email");
    SelenideElement inputPass = $("#password");
    SelenideElement inputPassConf = $("#confirm-password");
    SelenideElement regSubBtn = $(byText("Következő"));
    SelenideElement countyDrop = $("#county");
    SelenideElement municipality = $("#municipality");
    SelenideElement postalCode = $("#postcode");
    SelenideElement street = $("#street");
    SelenideElement houseNumber = $("#housenumber");
    SelenideElement addressName = $("#nickname");
    SelenideElement firstName = $("#firstName");
    SelenideElement lastName = $("#lastName");
    SelenideElement primaryPhone = $("#primaryPhone");
    SelenideElement consentCheckBox = $(byXpath("//*[@id=\"personalDetails\"]/ul[4]/li/div/label"));
    SelenideElement regFinalizeBtn = $(byText("Igen, regisztrálok"));


    public void setEmailPass() {
        UUID emailUUID = UUID.randomUUID();
        String randMail = emailUUID + "@example.com";

        inputEmail.setValue(randMail);
        inputPass.setValue("Nagyonbiztonsagosjelszo1");
        inputPassConf.setValue("Nagyonbiztonsagosjelszo1");

    }

    public void clickSubmit() {
        regSubBtn.click();

    }

    public void setRegStage2()  {
        countyDrop.click();
        countyDrop.sendKeys("G");
        countyDrop.sendKeys(Keys.TAB);

        municipality.click();
        municipality.sendKeys("G", Keys.DOWN, Keys.DOWN, Keys.DOWN);
        municipality.sendKeys(Keys.TAB);

        postalCode.shouldBe(enabled, Duration.ofSeconds(30));
        postalCode.sendKeys(Keys.DOWN);
        postalCode.sendKeys(Keys.TAB);

        street.shouldBe(enabled, Duration.ofSeconds(30));
        street.sendKeys(Keys.DOWN);
        street.sendKeys(Keys.TAB);

        houseNumber.shouldBe(enabled, Duration.ofSeconds(30));
        houseNumber.sendKeys(Keys.DOWN);

        addressName.shouldBe(enabled, Duration.ofSeconds(30)).click();
        addressName.sendKeys("Tesztlak");
    }

    public void setRegStage3() {
        firstName.setValue("Elek");
        lastName.click();
        lastName.sendKeys("Teszt");
        primaryPhone.setValue("00000000000");
    }

    public void regConstCheckBox() {
        consentCheckBox.click();
    }

    public void finalizeReg() {
        regFinalizeBtn.click();
    }

    public void validateRegSuccess() {
        assertTrue($("#utility-header-orders-link").isDisplayed());
    }

}