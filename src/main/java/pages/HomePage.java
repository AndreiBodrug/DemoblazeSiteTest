package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public SelenideElement laptopFld = $(By.xpath("//*/a[contains(@onclick, 'notebook')]"));
    public SelenideElement phoneFld = $(By.xpath("//*/a[contains(@onclick, 'phone')]"));
    public SelenideElement monitorFld = $(By.xpath("//*/a[contains(@onclick, 'monitor')]"));
    public SelenideElement itemToBeAdded;

    public void selectTypeOfItem(String typeOfItem){

        if(typeOfItem.equals("Laptop")){
            laptopFld.should(Condition.appear).click();
        }else if(typeOfItem.equals("Phone")){
            phoneFld.should(Condition.appear).click();
        }else{
            monitorFld.should(Condition.appear).click();
        }
    }

    public void selectItem(String nameOfItem){

        String pathOfItem = "//*/a[contains(text(), '" + nameOfItem + "')]";

        itemToBeAdded = $(By.xpath(pathOfItem));
        itemToBeAdded.should(Condition.appear).click();


    }



}