package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainSuperPage extends FactoryPage {
    //SUPER TEST - 8 STEPS !!!
    // 1. Найем элемент на главной странице. В моем случае - это TR FLAG! Locator - (//span[@class='flag flag-TR'])
    @FindBy(xpath = "//span[@class='flag flag-GB']")
    private WebElement TRFlag;

    public boolean isAccountLinkDisplayed2(){
        return TRFlag.isDisplayed();
    }
}
