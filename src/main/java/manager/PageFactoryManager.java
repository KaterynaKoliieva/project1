package manager;

import businesslogic.BusinessLogicLayer;
import dataProvider.ConfigFileReader;
import pages.rozetka.HomePage;
import pages.screwfix.HomePageScrewfix;
import pages.screwfix.LogInPage;
import utils.DriverSingleton;


public class PageFactoryManager {

    public static final HomePage homePage = new HomePage(DriverSingleton.getDriver());

    public static final HomePageScrewfix homePageScrewfix = new HomePageScrewfix(DriverSingleton.getDriver());
    public static final BusinessLogicLayer businessLogicLayer = new BusinessLogicLayer(DriverSingleton.getDriver());
    public static final ConfigFileReader configFileReader = new ConfigFileReader();
    public static final LogInPage logInPage = new LogInPage(DriverSingleton.getDriver());
}
