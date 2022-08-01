package org.mytests.tests.example.rozetka.manager;

import org.mytests.tests.example.rozetka.businesslogic.BusinessLogicLayer;
import org.mytests.tests.example.rozetka.utils.DriverSingleton;
import org.mytests.tests.example.rozetka.pages.HomePage;

public class PageFactoryManager {

    public static final HomePage homePage = new HomePage(DriverSingleton.getDriver());
    public static final HomePage searchPage = new HomePage(DriverSingleton.getDriver());
    public static final BusinessLogicLayer businessLogicLayer = new BusinessLogicLayer(DriverSingleton.getDriver());
}
