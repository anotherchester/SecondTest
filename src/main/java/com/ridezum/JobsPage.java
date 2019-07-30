package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
    private List<WebElement> applybtns;

    public  void clickApplyForThisJob() {
        applybtns.get(0).click();

    }

    @FindBy(css = "[name=\"name\"]")
    private WebElement fullName;

    public void fillName(String name) {

        fullName.sendKeys(name);
    }

    @FindBy(css = "[name=\"email\"]")
    private WebElement emailField;

    public void fillEmail(String email) {

       emailField.sendKeys(email);
    }

    @FindBy(css = "[name=\"phone\"]")
    private WebElement phoneField;

    public void fillPhone(String phone) {

        phoneField.sendKeys(phone);
    }

    @FindBy(css = "[name=\"eeo[gender]\"]")
    private WebElement genderField;

    @FindBy(css = "[name=\"eeo[race]\"]")
    private WebElement raceField;

    @FindBy(css = "[name=\"eeo[veteran]\"]")
    private WebElement veteranField;

    public void selectGender(int i) {

        Select select = new Select(genderField);
        select.selectByIndex(i);
    }

    public void selectRace(int i) {

        Select select = new Select(raceField);
        select.selectByIndex(i);
    }

    public void selectVeteran(int i) {

        Select select = new Select(veteranField);
        select.selectByIndex(i);
    }

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/form/div[5]/button")
    private WebElement submitButton;

    public void clickSubmit() {

        submitButton.click();
    }

    @FindBy(css = ".error-message")
    private List<WebElement> errorsList;

    public String getErrMsg() {

        String errmsg = errorsList.get(0).getText();
        return errmsg;
    }
}
