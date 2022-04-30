package com.stv.factory.factorytests;

import com.stv.factory.factorypages.BasketPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.WishlistPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Test(description = "Assert the basket page is loaded")
    public void assertBasketOpened() {
        mainFactoryPage.clickStart();
        mainFactoryPage.clickOnBASKETlist();
        Assert.assertEquals(new BasketPage().isBasketlistContainerDisplayed(), true, "Basket page isn't loaded properly");
    }
}
