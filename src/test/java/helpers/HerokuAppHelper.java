package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HerokuAppHelper extends  BaseHelper
{
   public static void logIn(String username, String password)
   {
       wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
       WebElement usernameBox = driver.findElement(By.id("username"));
       usernameBox.sendKeys(username);
       WebElement passwordBox = driver.findElement(By.id("password"));
       passwordBox.sendKeys(password);
       WebElement loginButton = driver.findElement(By.className("radius"));
       loginButton.click();
   }
}
