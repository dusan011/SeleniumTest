package tests;

import helpers.HerokuAppHelper;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BrowserTest extends BaseTest
{
    @Test
    public void googleSearchTest() throws InterruptedException
    {
            
    }

    @Test
    public void positiveLoginTest()
    {
        navigateToUrl("http://the-internet.herokuapp.com/login");
        HerokuAppHelper.logIn("tomsmith","SuperSecretPassword!");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash-messages")));
        WebElement message = driver.findElement(By.id("flash-messages"));
        Assert.assertTrue("Message is not shown",message.getText().contains("You logged into a secure"));
        WebElement logOutButton = driver.findElement(By.className("button"));
        Assert.assertTrue("Logout button is not shown", logOutButton.isDisplayed());
    }

    @Test
    public void negativeLoginTest()
    {
        navigateToUrl("http://the-internet.herokuapp.com/login");
        HerokuAppHelper.logIn("asdfasdfa","fgdsfgsdfg");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash-messages")));
        WebElement message = driver.findElement(By.id("flash-messages"));
        Assert.assertTrue("Message is not shown",message.getText().contains("Your  username is invalid!"));

    }
}
