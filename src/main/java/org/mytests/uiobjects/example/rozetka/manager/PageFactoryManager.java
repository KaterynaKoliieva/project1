package org.mytests.uiobjects.example.rozetka.manager;

import org.mytests.uiobjects.example.rozetka.businesslogic.BusinessLogicLayer;
import org.mytests.uiobjects.example.rozetka.pages.HomePage;
import org.mytests.uiobjects.example.rozetka.utils.DriverSingleton;


public class PageFactoryManager {

    public static final HomePage homePage = new HomePage(DriverSingleton.getDriver());
    public static final HomePage searchPage = new HomePage(DriverSingleton.getDriver());
    public static final BusinessLogicLayer businessLogicLayer = new BusinessLogicLayer(DriverSingleton.getDriver());
}
