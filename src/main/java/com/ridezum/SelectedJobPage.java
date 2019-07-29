package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectedJobPage extends BasePage {

    public SelectedJobPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".application-field")
    private List<WebElement> applicationFields;

    public void fillName(String name) {

        applicationFields.get(2).sendKeys(name);
    }
}
