package org.mytests.tests.example.rozetka.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {

    private static final int DEFAULT_TIME = 10;

    public static void waitForPageLoadComplete() {
        new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(DEFAULT_TIME)).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public static void waitVisibilityOfElement(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(DEFAULT_TIME));
        wait.until(ExpectedConditions.visibilityOf(locator));
    }

    public static void waitForTheElementToClick(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(DEFAULT_TIME));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void implicitWait() {
        DriverSingleton.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(DEFAULT_TIME));
    }
}
