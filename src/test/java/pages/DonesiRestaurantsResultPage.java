package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DonesiRestaurantsResultPage extends BaseHelper
{

    @FindBy(id = "italijanska-hrana")
    WebElement italianFoodCheckBoxFilter;

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
    }
}
