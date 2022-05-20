package com.stv.factory.factorypages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainSuperPage extends FactoryPage {
    //SUPER TEST - 8 STEPS !!!
    // 1. Найем элемент на главной странице. В моем случае - это TR FLAG! Locator - (//span[@class='flag flag-TR'])
    @FindBy(xpath = "//span[@class='flag flag-GB']")
    private WebElement Flag;

    public boolean isFlagLinkDisplayed() {
        return Flag.isDisplayed();
    }

    // Кликнем и уберем cookie
    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;

    public void clickOnTrustButton() {
        try {
            trustButton.click();
        } catch (NoSuchElementException e){
            return;
        }
    }

    //SUPER TEST - 2 STEPS !
    // 2. Кликнем на button Flag! Locator CSS - (.bem-header__language-selector)

    @FindBy(xpath = "//a[@class='bem-header__language-selector']")
    private WebElement FlagLink;

    public void clickOnFLagLink() {
        FlagLink.click();
    }


    // 3. Убедиться, что что button <Close> есть.
    @FindBy(xpath = "//button[@class=\"bem-language-selector__button--secondary\"]")
    private WebElement ButtonClose;

    public boolean isButtonCloseDisplayed() {
        return ButtonClose.isDisplayed();
    }

    // 4. Кликнуть на button <Close> и панель должна исчезнуть .
    public boolean clickOnButtonClose() {
        ButtonClose.click();
        return true;
    }

    // 5. Убедиться, что на главной странице есть иконка <Need help?>
    @FindBy(xpath = "//a[@id='egain-live-chat']")
    private WebElement IconChatNow;

    public boolean isIconChatDisplayed() {
        return IconChatNow.isDisplayed();
    }

    // 6. В поле <Search> втайпать Cycle
    @FindBy(className = "bem-header__search")
    private WebElement Input;

    public boolean isTextCycleDisplayed() {
        return Input.isDisplayed();
    }

}
