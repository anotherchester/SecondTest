package com.ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class VerificationTest extends BaseTest {

    private HomePage homePage;
    private ApplyPage applyPage;

    @Test
    public void testVerify() {

        homePage = new HomePage(driver);
        applyPage = homePage.clickApplyButton();
        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));
        applyPage.fillFirstNameField("John");
        applyPage.fillLastNameField("Doe");
        applyPage.fillEmailField("johndoe.at.gmail.com");
        applyPage.fillPhoneNumber("2threesix567");
        String mailErrNote = applyPage.emailError();
        Assert.assertEquals("Please enter a valid email address",mailErrNote);
        String phoneErrNote = applyPage.phoneError();
        Assert.assertEquals("The phone number is not valid",phoneErrNote);
        applyPage.emailField.clear();
        applyPage.phoneField.clear();
        applyPage.fillEmailField("oleg@gmail.com");
        applyPage.fillPhoneNumber("2061234567");
        driver.switchTo().defaultContent();
        applyPage.clickCareer();





    }
}
