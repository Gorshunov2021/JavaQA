package com.stv.factory.factorytests;

import com.stv.factory.factorypages.FlagPage;
import com.stv.factory.factorypages.MainSuperPage;
import com.stv.factory.factorypages.WishlistPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainSeperTest extends BasicFactoryTest {

    MainSuperPage mainSuperPage = new MainSuperPage();

    @Test(description = "Assert the main page https://www.wiggle.co.uk is loaded British Flag is visible")
    public void assertFlagIconIsDisplayed() {
        boolean actualResult = mainSuperPage.isFlagLinkDisplayed();
        Assert.assertEquals(actualResult, true, "British Flag isn't visible!!!");
    }

    @Test(description = "Assert the Flag page is loaded", dependsOnMethods = "assertFlagIconIsDisplayed")
    public void assertFLagPageOpened() {
        mainSuperPage.clickOnTrustButton();
        mainSuperPage.clickOnFLagLink();
        Assert.assertEquals(new FlagPage().isFlagContainerDisplayed(), true, "Flag page isn't loaded properly");
    }

    @Test(description = "Assert the Button <Close> is visible", dependsOnMethods = "assertFLagPageOpened")
    public void assertButtonCLoseIsDisplayed() {
        boolean actualResult = mainSuperPage.isButtonCloseDisplayed();
        Assert.assertEquals(actualResult, true, "Button CLose isn't visible!!!");
    }

    @Test(description = "Assert the Button <Close> is hidden", dependsOnMethods = "assertButtonCLoseIsDisplayed")
    public void assertButtonCLoseIsHidden() {
        boolean actualResult = mainSuperPage.clickOnButtonClose();
        Assert.assertEquals(actualResult, true, "Button CLose isn't hidden!");
    }

    @Test(description = "Assert the Icon Chat Now is visible", dependsOnMethods = "assertButtonCLoseIsHidden")
    public void isIconChatDisplayed() {
        boolean actualResult = mainSuperPage.isIconChatDisplayed();
        Assert.assertEquals(actualResult, true, "Icon Chat isn't visible!!!");
    }

}
