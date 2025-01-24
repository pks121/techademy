package com.makemytrip.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyMakeMyTripLogoTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
    }

    @Test
    public void verifyLogoPresence() throws InterruptedException {
        Thread.sleep(5000);
        By logoLocator = By.cssSelector("a[data-cy='mmtLogo']");
        WebElement logo = driver.findElement(logoLocator);
        Assert.assertTrue(logo.isDisplayed(), "MakeMyTrip logo is not displayed!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
