package pages.rozetka;


import manager.PageFactoryManager;
import pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Wait.waitForPageLoadComplete;
import static utils.Wait.waitForTheElementToClick;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='search']")
    private WebElement searchField;
    @FindBy(xpath = "//button[contains(@class,'button_color_green')]")
    private WebElement searchButton;

    public SearchPage enterTextInTheSearchField(){
        waitForPageLoadComplete();
        searchField.click();
        searchField.sendKeys(PageFactoryManager.configFileReader.enteredText());
        waitForTheElementToClick(searchButton);
        searchButton.click();
        return new SearchPage(driver);
    }

}
