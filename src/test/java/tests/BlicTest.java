package tests;

import helpers.BlicHelper;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BlicTest extends BaseTest
{
    @Test
    public void blicSearchTest() throws InterruptedException {
        String term = "Comtrade";
        BlicHelper.blicSearch(term);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("search__results")));
        WebElement results = driver.findElement(By.className("search__results"));
        List<WebElement> articleLists = results.findElements(By.tagName("article"));
        System.out.println("Broj artikala je "+articleLists.size());

        int i = 0;
        for (WebElement article:articleLists)
        {
            i++;
            System.out.println(i);
            System.out.println(article.getText());
        }

        Assert.assertTrue("Result is not found", results.getText().contains(term));
        Thread.sleep(4000);
    }
}
