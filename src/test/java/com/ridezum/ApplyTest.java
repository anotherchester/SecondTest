package com.ridezum;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class ApplyTest extends BaseTest {

    private HomePage homePage;
    private ApplyPage applyPage;

    @Test
    public void testApply() throws InterruptedException {

        homePage = new HomePage(driver);
        applyPage = homePage.clickApplyButton();
        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));
        applyPage.fillFirstNameField("John");
        applyPage.fillLastNameField("Doe");
        applyPage.fillEmailField("johndoe@gmail.com");
        applyPage.fillPhoneNumber("2061234567");
        //applyPage.selectRegion(2);
        //applyPage.selectRegionField(4);
        applyPage.fillZipcode("98105");
        //Random random = new Random();
        //int randomnumber = random.nextInt(6);
        //applyPage.selectRegionField(randomnumber);
        //applyPage.selectRegionByName();
        applyPage.selectRegionByVisibleName();
        driver.switchTo().defaultContent();
        //applyPage.clickSubmit();
        applyPage.clickCareer();

    }
}
