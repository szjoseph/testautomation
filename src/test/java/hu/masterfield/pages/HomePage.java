package hu.masterfield.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    SelenideElement cookieAcceptBtn = $(byText("Minden Cookie elfogadása"));
    //    SelenideElement cookieRejectBtn = $(byText("Minden Cookie elutasítása"));
    SelenideElement switchLangFromHuBtn = $(byText("English"));

    public void acceptCookies() {
        cookieAcceptBtn.click();
        cookieAcceptBtn.shouldNot(visible);
    }

    public void isSetToHungarian() {
        switchLangFromHuBtn.should(Condition.matchText("English"));
    }

}
