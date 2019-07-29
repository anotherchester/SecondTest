package com.ridezum;

import org.junit.Test;

public class SelectedJobTest extends BaseTest {

    public HomePage homePage;
    public CareersPage careersPage;
    public JobsPage jobsPage;
    public JobDescriptionPage jobDescriptionPage;
    public SelectedJobPage selectedJobPage;

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
       // Thread.sleep(4000);
        //selectedJobPage.fillName("Jack Jack");
    }
}
