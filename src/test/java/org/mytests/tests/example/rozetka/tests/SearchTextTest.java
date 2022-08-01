package org.mytests.tests.example.rozetka.tests;

import org.mytests.tests.example.rozetka.manager.PageFactoryManager;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchTextTest extends BaseTest{

    @Test
    public void checkTheEnteredText() {
        Assert.assertEquals(PageFactoryManager.businessLogicLayer.isTheEnteredTextDisplayed(), "«test»");
    }

}
