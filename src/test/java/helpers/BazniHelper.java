package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BazniHelper {
    protected static WebDriver driver = new ChromeDriver();
    protected  static WebDriverWait wdWait = new WebDriverWait(driver, 10);

    protected static void nagivigateToUrl(String url)
    {
        driver.get(url);
    }
    protected static void logIn(String username, String password)
    {
        WebElement usernameBox = driver.findElement(By.id("username"));
        usernameBox.sendKeys(username);
        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys(password);
        WebElement logInButton = driver.findElement(By.className("radius"));
        logInButton.click();

    }
}
