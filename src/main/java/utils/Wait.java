package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {
    /*
    static WebDriver driver;

    private static final int DEFAULT_TIME = 20;
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
*/
}
