package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainSuperPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainSeperTest extends BasicFactoryTest {

    MainSuperPage mainSuperPage = new MainSuperPage();

    @Test(description = "Assert the main page https://www.wiggle.co.uk is loaded British Flag is visible")
    public void assertAccountIconIsDisplayed() {
        boolean actualResult = mainSuperPage.isAccountLinkDisplayed2();
        Assert.assertEquals(actualResult, true, "British Flag isn't visible!!!");
    }
}
