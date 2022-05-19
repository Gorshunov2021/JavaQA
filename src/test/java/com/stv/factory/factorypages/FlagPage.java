package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlagPage extends FactoryPage {
    @FindBy(xpath = "//div[@class='container'][1]")
    private WebElement flagContainer;

    public boolean isFlagContainerDisplayed(){
        return flagContainer.isDisplayed();
    }
}
