package org.mytests.uiobjects.example.rozetka.pages;

import org.mytests.uiobjects.example.rozetka.utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'test')]")
    private WebElement visibleText;

    public String displayOfEnteredText() {
        Wait.waitForPageLoadComplete();
        Wait.waitVisibilityOfElement(visibleText);
        return visibleText.getText();
    }

}
