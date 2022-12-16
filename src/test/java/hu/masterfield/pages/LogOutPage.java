package hu.masterfield.pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LogOutPage {
    public void logout() {
        SelenideElement logoutBtn = $("#utility-header-logout-link").shouldBe(visible, Duration.ofSeconds(10));
        logoutBtn.click();
    }
}
