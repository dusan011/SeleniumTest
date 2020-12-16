package tests;

import org.junit.Test;
import pages.DonesiHomePage;

public class DonesiTest extends BaseTest
{
   @Test
    public void donesiTest() throws InterruptedException {
       DonesiHomePage donesi = new DonesiHomePage(driver);
       donesi.donesiRestaurantsResults("http://www.donesi.com", "Balkanska 5");
       Thread.sleep(5000);
   }
}
