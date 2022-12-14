package hu.masterfield.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductDetailsPage {
    public void clickProduct() {
        $("#tile-2004120331802").shouldBe(visible).click();
    }

    public void validateDetailsPage() {
        $(".product-details-tile").shouldBe(visible);
    }
}
