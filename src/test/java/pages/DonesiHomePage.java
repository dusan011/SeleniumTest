package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DonesiHomePage extends BaseHelper
{
    public DonesiHomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void navigateToDonesi(String url)
    {
        driver.get(url);
    }

    private void insertTextInsideSearchBox(String text)
    {
        WebElement searchBox = driver.findElement(By.className("address-form-component-search-input"));
        searchBox.sendKeys(text);
    }

    public void donesiRestaurantsResults(String url, String text)
    {
        navigateToDonesi(url);
        insertTextInsideSearchBox(text);
    }


}
