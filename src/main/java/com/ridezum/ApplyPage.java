package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class ApplyPage extends BasePage {

    public ApplyPage (WebDriver driver) {

        super(driver);
    }

    @FindBy(css = "#application_form_first_name")
    WebElement firstNameField;

    public void fillFirstNameField(String firstname) {

        firstNameField.sendKeys(firstname);
    }

    @FindBy(css = "#application_form_last_name")
    WebElement lastNameField;

    public void fillLastNameField(String lastname) {

        lastNameField.sendKeys(lastname);
    }

    @FindBy(css = "#application_form_email")
    WebElement emailField;

    public void fillEmailField(String email) {

        emailField.sendKeys(email);
    }

    @FindBy(css = "#application_form_phone_number")
    WebElement phoneField;

    public void fillPhoneNumber(String phone) {

        phoneField.sendKeys(phone);
    }

    @FindBy(css = "#application_form_applicant_region")
    WebElement regionField;

    public void selectRegionField(int i) {

       Select select = new Select(regionField);
       select.selectByIndex(i);
    }

    @FindBy(css = "option")
    List<WebElement> locations;

    public void selectRegion (int i) {

        locations.get(i).click();
    }

    @FindBy(css = "#application_form_zipcode")
    WebElement zipcodeField;

    public void fillZipcode(String zipcode) {

        zipcodeField.sendKeys(zipcode);
    }

    public void selectRegionByName() {

        Select select = new Select(regionField);

        select.selectByValue("Dallas, Texas");

    }

    public void selectRegionByVisibleName() {

        Select select = new Select(regionField);

        select.selectByVisibleText("California");
    }

    @FindBy(css = ".btn-apply.js-submit.app-apply-button.application-form__submit-button")
    WebElement submitButton;

    public void clickSubmit() {

        submitButton.click();
    }

    @FindBy(css = ".main-menu__link")
    List<WebElement> topButtons;

    public void clickCareer() {

        topButtons.get(4).click();
    }

    @FindBy(css = ".help-block")
    List<WebElement> errorFields;



    public String emailError() {

        String mailError = errorFields.get(4).getText();
        return mailError;

    }

    public String phoneError() {

        String phoneError = errorFields.get(6).getText();
        return phoneError;
    }








}
