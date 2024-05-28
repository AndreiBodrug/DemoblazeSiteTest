package stepdefs;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class BaseStepDefs {

    @When("open site")
    public void openApp(){

    }

    @And("Sleep {int}")
    public void sleep(int milliseconds) {
        Selenide.sleep(milliseconds);
    }

}