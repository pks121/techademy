
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyMakeMyTripLogo {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {

            driver.get("https://www.makemytrip.com/");

            driver.manage().window().maximize();

            Thread.sleep(5000);

            By logoLocator = By.cssSelector("a[data-cy='mmtLogo']");
            WebElement logo = driver.findElement(logoLocator);

            if (logo.isDisplayed()) {
                System.out.println("MakeMyTrip logo is present on the page.");
            } else {
                System.out.println("MakeMyTrip logo is NOT present on the page.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
