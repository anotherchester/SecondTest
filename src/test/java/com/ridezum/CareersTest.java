package com.ridezum;

import org.junit.Test;

import java.util.ArrayList;

public class CareersTest extends BaseTest {

    public HomePage homePage;
    public CareersPage careersPage;
    public JobsPage jobsPage;


    @Test
    public void testCareersPage() {

        homePage = new HomePage(driver);
        careersPage = homePage.clickCareersButton();
        jobsPage = careersPage.clickViewJobsButton();
        //remembers window tab before switch to another
        //String previousWindow = driver.getWindowHandle();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        jobsPage.clickApply();
        jobsPage.clickApplyButton();
        /*for (String winHandle: driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }*/
        // how to close tab
        //driver.close();
        // how to switch back
        //driver.switchTo().window(previousWindow);
    }
}
