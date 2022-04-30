package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends FactoryPage {
    @FindBy(xpath = "//a[@id='wishlistLink']")  //@FindBy(className = "bem-header__list-link") или
    private WebElement wishListLink;

    public boolean isWishlistContainerDisplayed(){
        return wishListLink.isDisplayed();
    }

    public WishlistPage clickOnWishListButton() {
        wishListLink.click();
        return this;
    }
}


