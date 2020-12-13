package tests;

import helpers.BazniHelper;
import org.junit.After;
import org.junit.Before;

public class BazniTest extends BazniHelper {
    @Before
    public void testInit()
    {
        driver.manage().window().maximize();
    }
    @After
    public void testTearDown()
    {
        driver.close();
        driver.quit();
    }
}
