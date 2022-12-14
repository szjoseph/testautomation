package hu.masterfield.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage2 {
    public RegistrationPage3 setRegStage2() {
        SelenideElement regSubBtn = $(byText("Következő"));

        SelenideElement countyDrop = $("#county");
        SelenideElement municipality = $("#municipality");
        SelenideElement postalCode = $("#postcode");
        SelenideElement street = $("#street");
        SelenideElement houseNumber = $("#housenumber");
        SelenideElement addressName = $("#nickname");


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
        regSubBtn.click();
        return new RegistrationPage3();
    }

}
