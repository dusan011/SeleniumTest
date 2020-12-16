package tests;

import org.junit.Test;
import pages.DonesiHomePage;
import pages.DonesiRestaurantsResultPage;

public class DonesiTest extends BaseTest
{
   @Test
    public void donesiTest() throws InterruptedException {
       DonesiHomePage donesi = new DonesiHomePage(driver);
       donesi.donesiRestaurantsResults("http://www.donesi.com", "Balkanska 1");
       DonesiRestaurantsResultPage restaurantsPage = new DonesiRestaurantsResultPage();
       restaurantsPage.donesiRestaurantsResult();
       Thread.sleep(5000);
   }
}
