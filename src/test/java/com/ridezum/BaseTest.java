package com.ridezum;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void start() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CatKomp\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.get("https://ridezum.com/");

    }
}
