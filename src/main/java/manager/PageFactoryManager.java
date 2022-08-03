package manager;

import businesslogic.BusinessLogicLayer;
import dataProvider.ConfigFileReader;
import pages.HomePage;
import pages.SearchPage;
import utils.DriverSingleton;


public class PageFactoryManager {

    public static final HomePage homePage = new HomePage(DriverSingleton.getDriver());
    public static final SearchPage searchPage = new SearchPage(DriverSingleton.getDriver());
    public static final BusinessLogicLayer businessLogicLayer = new BusinessLogicLayer(DriverSingleton.getDriver());
    public static final ConfigFileReader configFileReader = new ConfigFileReader();

}
