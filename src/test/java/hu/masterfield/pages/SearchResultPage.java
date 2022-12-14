package hu.masterfield.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {
    public void searchResult() {
        //$(".product-list--list-item first").shouldBe(visible);
        $("#tile-2004120331802").shouldBe(visible);
    }
}
