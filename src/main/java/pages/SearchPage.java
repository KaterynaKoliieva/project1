package pages;

import utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'test')]")
    private WebElement visibleText;

    private String text;

    public String displayOfEnteredText() {
        Wait.waitForPageLoadComplete();
        Wait.waitVisibilityOfElement(visibleText);
        if(visibleText.getText().contains("«") && visibleText.getText().contains("»"))
            text=visibleText.getText().replace("«","<<").replace("»",">>");
        return text;
    }

}
