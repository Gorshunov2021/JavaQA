package com.stv.factory.factorytests;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.WishlistPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WishListTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Test(description = "Assert the wishlist page is loaded")
    public void assertWishlistOpened() {
        mainFactoryPage.clickStart();
        mainFactoryPage.clickOnWISHlist();
        Assert.assertEquals(new WishlistPage().isWishlistContainerDisplayed(), true, "Wishlist page isn't loaded properly");
    }
}
