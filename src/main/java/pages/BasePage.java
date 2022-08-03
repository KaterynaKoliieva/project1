package pages;

import dataProvider.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    ConfigFileReader configFileReader;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        configFileReader= new ConfigFileReader();
    }
}
