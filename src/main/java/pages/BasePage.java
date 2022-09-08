package pages;

import dataProvider.ConfigFileReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    static WebDriver driver;
    ConfigFileReader configFileReader;

    private static final int DEFAULT_TIME = 20;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        configFileReader= new ConfigFileReader();
    }

    public static void waitForPageLoadComplete() {
        new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIME)).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public static void waitVisibilityOfElement(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIME));
        wait.until(ExpectedConditions.visibilityOf(locator));
    }

    public static void waitForTheElementToClick(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIME));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DEFAULT_TIME));
    }

    public static void threadSleep() throws InterruptedException {
        Thread.sleep(4000);
    }

}
