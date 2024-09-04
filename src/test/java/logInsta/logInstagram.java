package logInsta;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logInstagram {
	public static void main(String arg[]) {	
		WebDriver driver;
		Properties props = new Properties();
		WebDriverWait wait;
		driver = new ChromeDriver();
		try {
            // Navigate to Instagram login page
            driver.get("https://www.instagram.com/accounts/login/");

            // Wait for the page to load
            Thread.sleep(2000);

            // Locate the username and password fields
            WebElement usernameField = driver.findElement(By.name("username"));
            WebElement passwordField = driver.findElement(By.name("password"));

            // Enter your username and password
            usernameField.sendKeys("your_username");
            passwordField.sendKeys("your_password");

            // Locate and click the login button
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
            loginButton.click();

            // Wait for some time to see the result (for demo purposes)
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the WebDriver
            driver.quit();
        }
	}
}
