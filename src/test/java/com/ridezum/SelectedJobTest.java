package com.ridezum;

import org.junit.Assert;
import org.junit.Test;

public class SelectedJobTest extends BaseTest {

    public HomePage homePage;
    public CareersPage careersPage;
    public JobsPage jobsPage;


    @Test
    public void testSelectedJob() throws InterruptedException {

        homePage = new HomePage(driver);
        careersPage = homePage.clickCareersButton();
        jobsPage = careersPage.clickViewJobsButton();
        for (String newTab: driver.getWindowHandles()) {
            driver.switchTo().window(newTab);
        }
        jobsPage.clickApply();
        jobsPage.clickApplyForThisJob();
        jobsPage.fillName("Jack Jack");
        jobsPage.fillEmail("some@mail.com");
        jobsPage.fillPhone("1234567890");
        jobsPage.selectGender(3);
        jobsPage.selectRace(5);
        jobsPage.selectVeteran(3);
        jobsPage.clickSubmit();
        String errortxt = jobsPage.getErrMsg();
        Assert.assertEquals("✱ Please attach a resume",errortxt);
    }
}
