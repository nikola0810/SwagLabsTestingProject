package appTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class FooterLinksTest extends BaseTest {
    @Test
    public void twitterTest() throws InterruptedException {
        logInPage.successfulLogIn();
        Assert.assertTrue("Nije uspesno logovanje", homePage.addToCartButtonPresent());
        Assert.assertTrue("Nije uspesno logovanje", homePage.productImagePresent());
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,7000)");
        homePage.clickTwitterButton();
        Thread.sleep(3000);
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        String currentUrl=driver.getCurrentUrl();
        Assert.assertEquals("https://twitter.com/saucelabs",currentUrl);
    }

    @Test
    public void facebookTest() throws InterruptedException {
        logInPage.successfulLogIn();
        Assert.assertTrue("Nije uspesno logovanje", homePage.addToCartButtonPresent());
        Assert.assertTrue("Nije uspesno logovanje", homePage.productImagePresent());
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,7000)");
        homePage.clickFacebookButton();
        Thread.sleep(3000);
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        String currentUrl=driver.getCurrentUrl();
        Assert.assertEquals("https://www.facebook.com/saucelabs",currentUrl);
    }

    @Test
    public void linkedInTest() throws InterruptedException {
        logInPage.successfulLogIn();
        Assert.assertTrue("Nije uspesno logovanje", homePage.addToCartButtonPresent());
        Assert.assertTrue("Nije uspesno logovanje", homePage.productImagePresent());
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,7000)");
        homePage.clickLinkedInButton();
        Thread.sleep(3000);
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        String currentUrl=driver.getCurrentUrl();
        Assert.assertEquals("https://www.linkedin.com/company/sauce-labs/",currentUrl);

    }
}
