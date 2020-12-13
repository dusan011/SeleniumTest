package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HerokuAppTest extends BazniTest{
    @Test
    public void positiveLogIn() throws InterruptedException {
        nagivigateToUrl("http://the-internet.herokuapp.com/login");
        logIn("tomsmith","SuperSecretPassword!");
        Thread.sleep(4000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("success")));
        WebElement successMessage = driver.findElement(By.className("success"));
        WebElement logoutButton = driver.findElement(By.className("radius"));
        Assert.assertTrue("Message is not shown",successMessage.isDisplayed());
        Assert.assertTrue("Logout button is not displayed",logoutButton.isDisplayed());
        Thread.sleep(4000);
    }
    @Test
    public void negativeLogIn() throws InterruptedException {
        nagivigateToUrl("http://the-internet.herokuapp.com/login");
        logIn("asdfasdf","asdfa");
        Thread.sleep(4000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash-messages")));
        WebElement message = driver.findElement(By.id("flash-messages"));
        Assert.assertTrue("Message is not shown", message.getText().contains("Your username is invalid!") );

    }
}
