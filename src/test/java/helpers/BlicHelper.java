package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlicHelper extends BaseHelper
{
    private static void navigateToBlicHomePage()
    {
        driver.get("https://www.blic.rs");
    }

    private static void clickOnMagnifierIcon() {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("fa-search")));
        WebElement searchSection = driver.findElement(By.className("fa-search"));
        searchSection.click();
    }

    private static void enterTermInSearchBox(String term)
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("search-field-head")));
        WebElement searchBox = driver.findElement(By.id("search-field-head"));
        searchBox.sendKeys(term);
    }

    private static void clickOnSearchButton()
    {
        WebElement searchButton = driver.findElement(By.className("fa-angle-double-right"));
        searchButton.click();
    }


    public static void blicSearch(String term)
    {
        navigateToBlicHomePage();
        clickOnMagnifierIcon();
        enterTermInSearchBox(term);
        clickOnSearchButton();
    }
}
