package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends FactoryPage {
    @FindBy(className = "bem-header__basket--empty")
    private WebElement basketLink;

    public boolean isBasketlistContainerDisplayed(){
        return basketLink.isDisplayed();

    }
}
