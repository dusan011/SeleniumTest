package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DonesiHomePage extends BaseHelper
{
    @FindBy(className = "address-form-component-search-input")
    WebElement searchBox;

    @FindBy(className = "btn-primary")
    WebElement orderButton;

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
        searchBox.sendKeys(text);
    }

    private void chooseAddressFromDropDown()
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'address-form-component\']/div[2]/div[1]/ul/li[1]/span[3]/span[2]")));
        WebElement dropDownList = driver.findElement(By.xpath("//*[@id=\'address-form-component\']/div[2]/div[1]/ul/li[1]/span[3]/span[2]"));
        dropDownList.click();
    }

    private void clickOnOrderButton()
    {
        orderButton.click();
    }

    private void clickOnContinueButton()
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("button-map-submit")));
        WebElement continueButton = driver.findElement(By.className("button-map-submit"));
        continueButton.click();
    }

    public void donesiRestaurantsResults(String url, String text)
    {
        navigateToDonesi(url);
        insertTextInsideSearchBox(text);
        chooseAddressFromDropDown();
        clickOnOrderButton();
        clickOnContinueButton();
    }


}
