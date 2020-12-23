package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DonesiRestaurantsResultPage extends BaseHelper
{

    @FindBy(id = "italijanska-hrana")
    WebElement italianFoodCheckBoxFilter;

    public int numberOfItalianRestaurantsInHeader = 0;
    public int numberOfItalianRestaurantsInResults = 0;

    public DonesiRestaurantsResultPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void clickOnItalianFoodCheckBoxFilter()
    {
        wdWait.until(ExpectedConditions.invisibilityOfElementWithText(By.className("shops-listing-counter"),""));
        js.executeScript("arguments[0].click();", italianFoodCheckBoxFilter);
    }

    private void findNumberOfItalianRestaurantsInHeader()
    {
        WebElement allRestaurants = driver.findElement(By.className("shops-listing-counter"));
        System.out.println("Number of all restaurants is "+allRestaurants.getText());
        wdWait.until(ExpectedConditions.invisibilityOfElementWithText(By.className("shops-listing-counter"),allRestaurants.getText()));
        WebElement italianRestaurantsInHeader = driver.findElement(By.className("shops-listing-counter"));
        numberOfItalianRestaurantsInHeader = Integer.parseInt(italianRestaurantsInHeader.getText());
        System.out.println("Number of Italian restaurants is "+italianRestaurantsInHeader.getText());
    }

    private void findNumberOfItalianRestaurantsInResults()
    {
        List<WebElement> italianRestaurantsInResultPage = driver.findElements(By.className("shops-listings-shops-list-item"));
        numberOfItalianRestaurantsInResults = italianRestaurantsInResultPage.size();
        System.out.println("Number of Italian restaurants in results is "+italianRestaurantsInResultPage.size());
    }


    private void getNumberOfRestaurants()
    {
        wdWait.until(ExpectedConditions.invisibilityOfElementWithText(By.className("shops-listing-counter"),""));
        WebElement numberOfRestaurants = driver.findElement(By.className("shops-listing-counter"));
        System.out.println("Broj restorana "+numberOfRestaurants.getText());
    }

    public void donesiRestaurantsResult()
    {
        getNumberOfRestaurants();
        clickOnItalianFoodCheckBoxFilter();
        findNumberOfItalianRestaurantsInHeader();
        findNumberOfItalianRestaurantsInResults();
    }
}
