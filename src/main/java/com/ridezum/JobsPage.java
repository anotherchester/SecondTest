package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobsPage extends BasePage {
    public JobsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css=".posting-btn-submit.template-btn-submit.hex-color")
    List<WebElement> jobsList;

    public void clickApply() {
        jobsList.get(0).click();
    }

    @FindBy(css = ".postings-btn.template-btn-submit.hex-color")
    private List<WebElement> applyCurrentJob;

    public JobDescriptionPage clickApplyButton() {
        applyCurrentJob.get(0).click();
        return new JobDescriptionPage(driver);
    }



}
