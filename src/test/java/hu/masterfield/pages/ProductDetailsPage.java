package hu.masterfield.pages;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductDetailsPage {
    public void clickProduct() {
        //   $("#tile-2004120331802").shouldBe(visible, Duration.ofSeconds(10)).click();
        $("#tile-2004120331802 > a > div > picture > img").shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void validateDetailsPage() {
        $(".product-details-tile").shouldBe(visible, Duration.ofSeconds(10));
    }
}
