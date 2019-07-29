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

    public JobDescriptionPage clickApply() {
        jobsList.get(0).click();
        return new JobDescriptionPage(driver);
    }

    @FindBy(css = ".postings-btn.template-btn-submit.hex-color")
    private List<WebElement> applybtns;

    public SelectedJobPage clickApplyForThisJob() {
        applybtns.get(0).click();
        return new SelectedJobPage(driver);
    }

}
