package hu.masterfield.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LogOutPage {
    public void logout() {
        SelenideElement logoutBtn = $("#utility-header-logout-link");
        logoutBtn.click();
    }
}
