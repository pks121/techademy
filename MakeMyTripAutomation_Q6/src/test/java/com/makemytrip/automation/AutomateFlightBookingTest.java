package com.makemytrip.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomateFlightBookingTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
    }

    @Test
    public void flightSearchAutomation() throws InterruptedException {
        Thread.sleep(5000);
        try {
            driver.findElement(By.cssSelector("span[data-cy='closeModal']")).click();
        } catch (Exception ignored) {
        }
        driver.findElement(By.xpath("//li[@data-cy='menu_Flights']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='fromCity']")).click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(text(),'New Delhi')]")).click();
        driver.findElement(By.xpath("//label[@for='toCity']")).click();
        driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Mumbai");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(text(),'Mumbai')]")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
