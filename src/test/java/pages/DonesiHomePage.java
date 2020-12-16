package pages;

import helpers.BaseHelper;
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


    public void donesiRestaurantsResults(String url)
    {
        navigateToDonesi(url);
    }


}
