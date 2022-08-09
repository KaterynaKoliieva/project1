package utils;

import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class DriverSingleton {
    private static WebDriver driver;
    private DriverSingleton() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void openUrl(){
        driver.get(PageFactoryManager.configFileReader.getApplicationUrl());
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
