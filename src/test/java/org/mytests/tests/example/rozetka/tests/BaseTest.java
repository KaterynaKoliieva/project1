package org.mytests.tests.example.rozetka.tests;


import org.mytests.uiobjects.example.rozetka.utils.DriverSingleton;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    private static final String ROZETKA_URL = "https://rozetka.com.ua/";

    @BeforeTest
    public void profileSetUp() {
        DriverSingleton.getDriver();
    }

    @BeforeMethod
    public void testsSetUp() {
        DriverSingleton.openUrl(ROZETKA_URL);
    }

    @AfterTest
    public void tearDown() {
        DriverSingleton.quitDriver();
    }
}
