package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(id = "accountLink")
    private WebElement accountLink;

    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;

    @FindBy(xpath = "//a[@id='wishlistLink']") //id="wishlistLink"
    private WebElement wishListLink;

    @FindBy(id="truste-consent-button")
    private WebElement acceptClick;

    @FindBy(className = "bem-header__basket--empty")
    private WebElement basketLink;

    public boolean isAccountLinkDisplayed(){
        return accountLink.isDisplayed();
    }

    public void clickOnAccountLink(){
        accountLink.click();
    }

    public void clickOnTrustButton(){
        trustButton.click();
    }

    public MainFactoryPage  clickStart() {
        acceptClick.click();
        return this;
    }

    public WishlistPage clickOnWISHlist() {
        wishListLink.click();
        return new WishlistPage();
    }

    public BasketPage clickOnBASKETlist() {
        basketLink.click();
        return  new BasketPage();
    }

}


