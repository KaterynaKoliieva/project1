package businesslogic;

import manager.PageFactoryManager;
import pages.BasePage;
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
