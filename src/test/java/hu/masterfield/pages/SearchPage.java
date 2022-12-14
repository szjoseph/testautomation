package hu.masterfield.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public void searchItem(String item) {
        SelenideElement searchBox = $(".search-bar__input");
        searchBox.sendKeys(item);
        searchBox.sendKeys(Keys.ENTER);
    }
}
