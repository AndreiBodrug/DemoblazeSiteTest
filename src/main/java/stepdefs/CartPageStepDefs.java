package stepdefs;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.HomePage;

public class CartPageStepDefs {

    CartPage cartPage = new CartPage();

    @Then("add item to cart")
    public void addToCart(){
        cartPage.addToCart();
    }
}
