package org.mytests.tests.example.rozetka.businesslogic;

import org.mytests.tests.example.rozetka.pages.BasePage;
import org.openqa.selenium.WebDriver;
import static org.mytests.tests.example.rozetka.manager.PageFactoryManager.homePage;

public class BusinessLogicLayer extends BasePage {

    public BusinessLogicLayer(WebDriver driver) {
        super(driver);
    }

    public String isTheEnteredTextDisplayed () {
        return homePage.enterTextInTheSearchField()
                       .displayOfEnteredText();
    }
}
