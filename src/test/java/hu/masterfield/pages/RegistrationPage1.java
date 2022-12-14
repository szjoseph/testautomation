package hu.masterfield.pages;

import com.codeborne.selenide.SelenideElement;

import java.util.UUID;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;

public class RegistrationPage1 {
    SelenideElement stageNumber = $(".progress-bar__stage-number");
    SelenideElement regSubBtn = $(byText("Következő"));

    public RegistrationPage2 setRegStage1() {
        SelenideElement inputEmail = $("#email");
        SelenideElement inputPass = $("#password");
        SelenideElement inputPassConf = $("#confirm-password");

        assertEquals("1", stageNumber.getText());
        UUID emailUUID = UUID.randomUUID();
        String randMail = emailUUID + "@example.com";

        inputEmail.setValue(randMail);
        inputPass.setValue("Nagyonbiztonsagosjelszo1");
        inputPassConf.setValue("Nagyonbiztonsagosjelszo1");
        regSubBtn.click();
        return new RegistrationPage2();




    }

}