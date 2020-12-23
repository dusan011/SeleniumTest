package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.DonesiHomePage;
import pages.DonesiRestaurantsResultPage;

public class DonesiTest extends BaseTest
{
   @Test
    public void donesiTest() throws InterruptedException {
       DonesiHomePage donesi = new DonesiHomePage(driver);
       donesi.donesiRestaurantsResults("http://www.donesi.com", "Beogradska 10");
       DonesiRestaurantsResultPage restaurantsPage = new DonesiRestaurantsResultPage(driver);
       restaurantsPage.donesiRestaurantsResult();
       Assert.assertTrue("Number of restaurants in header and result page is not the same", restaurantsPage.numberOfItalianRestaurantsInHeader == restaurantsPage.numberOfItalianRestaurantsInResults);
       Thread.sleep(5000);
   }
}
