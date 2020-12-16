package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DonesiRestaurantsResultPage extends BaseHelper
{
    private void getNumberOfRestaurants()
    {
        wdWait.until(ExpectedConditions.invisibilityOfElementWithText(By.className("shops-listing-counter"),""));
        WebElement numberOfRestaurants = driver.findElement(By.className("shops-listing-counter"));
        System.out.println("Broj restorana "+numberOfRestaurants.getText());
    }

    public void donesiRestaurantsResult()
    {
        getNumberOfRestaurants();
    }
}
