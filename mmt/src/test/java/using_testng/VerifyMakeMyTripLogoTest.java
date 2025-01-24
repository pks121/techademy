package using_testng;

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
        // Wait for the page to load
        Thread.sleep(5000); // Replace with explicit waits if needed

        // Locate the logo element
        By logoLocator = By.cssSelector("a[data-cy='mmtLogo']");
        WebElement logo = driver.findElement(logoLocator);

        // Assert that the logo is displayed
        Assert.assertTrue(logo.isDisplayed(), "MakeMyTrip logo is not displayed!");
        System.out.println("MakeMyTrip logo is displayed.");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
