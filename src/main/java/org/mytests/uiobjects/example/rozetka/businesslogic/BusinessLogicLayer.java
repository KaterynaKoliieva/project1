package org.mytests.uiobjects.example.rozetka.businesslogic;

import org.mytests.uiobjects.example.rozetka.pages.BasePage;
import org.mytests.uiobjects.example.rozetka.manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;

public class BusinessLogicLayer extends BasePage {

    public BusinessLogicLayer(WebDriver driver) {
        super(driver);
    }

    public String isTheEnteredTextDisplayed () {
        return PageFactoryManager.homePage.enterTextInTheSearchField()
                       .displayOfEnteredText();
    }
}
