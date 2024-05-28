package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    public SelenideElement addToCartBtn = $(By.xpath("//*[text()='Add to cart']"));

    public void addToCart(){

        addToCartBtn.should(Condition.clickable).click();
    }

}
