package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(id = "accountLink")
    private WebElement accountLink;

    public boolean isAccountLinkDisplayed() {
        return accountLink.isDisplayed();
    }

    public void clickOnAccountLink() {
        accountLink.click();
    }

    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;

    public void clickOnTrustButton() {
        trustButton.click();
    }

    @FindBy(xpath = "//a[@id='wishlistLink']") //id="wishlistLink"
    private WebElement wishListLink;

    public WishlistPage clickOnWISHlist() {
        wishListLink.click();
        return new WishlistPage();
    }

    @FindBy(id = "truste-consent-button")
    private WebElement acceptClick;

    public MainFactoryPage clickStart() {
        acceptClick.click();
        return this;
    }

    @FindBy(className = "bem-header__basket--empty")
    private WebElement basketLink;

    public BasketPage clickOnBASKETlist() {
        basketLink.click();
        return new BasketPage();
    }


}


