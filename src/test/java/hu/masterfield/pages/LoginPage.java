package hu.masterfield.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public void login(String email, String password) {
        SelenideElement emailField = $("#email");
        SelenideElement passwordField = $("#password");

        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        passwordField.sendKeys(Keys.ENTER);
    }

}
