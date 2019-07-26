package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {

        super(driver);
    }

    @FindBy(css =".m-btn.front-banner__btn" )
    private List<WebElement> applyButton;

    public ApplyPage clickApplyButton() {
        applyButton.get(1).click();
        return new ApplyPage(driver);
    }

    @FindBy(css = ".main-menu__item")
    List<WebElement> menuItems;

    public CareersPage clickCareersButton() {

        menuItems.get(4).click();
        return new CareersPage(driver);
    }

}
