package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2 F \n";
// Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the URL into Browser
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
        // Get the Title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Get the current Url
        driver.getCurrentUrl();
        System.out.println("Current Url : " + driver.getCurrentUrl() );
        // Get page source
        System.out.println("Page source : " + driver.getPageSource());
        // Find the Login link element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        // Find the Email field Element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys(("prime123@gmail.com"));
        // Find the password field element and type the password
        driver.findElement(By.name("Password")).sendKeys("prime123");
        // Close the browser
       driver.close();

    }



}
