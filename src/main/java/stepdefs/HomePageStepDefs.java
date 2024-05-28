package stepdefs;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageStepDefs {

    HomePage homePage = new HomePage();

    @And("select {string} tab")
    public void selectTypeOfItem(String typeOfItem){
        homePage.selectTypeOfItem(typeOfItem);
    }

    @And("select {string} item")
    public void selectItem(String nameOfItem) {
        homePage.selectItem(nameOfItem);
    }
}
