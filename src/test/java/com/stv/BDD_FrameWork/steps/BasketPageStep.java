package com.stv.BDD_FrameWork.steps;

import com.stv.factory.factorypages.BasketPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.WishlistPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class BasketPageStep extends BasicFactoryTest {
    BasketPage basketPage = new BasketPage();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Given("the user is on the homepage")
    public void openHomePage() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @When("the user click on Cookie button")
    public void theUserClickOnCookieButton() {
        mainFactoryPage.clickOnTrustButton();
    }

    @When("the user click on Basket button")
    public void clickOnBasketButton() {
        mainFactoryPage.clickOnBASKETlist();
    }

//    @Then("the page should display");
}
