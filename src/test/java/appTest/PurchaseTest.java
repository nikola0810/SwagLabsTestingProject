package appTest;

import org.junit.Assert;
import org.junit.Test;

public class PurchaseTest extends BaseTest{


    @Test
    public void successfulPurchase() throws InterruptedException {
        logInPage.successfulLogIn();
        Thread.sleep(3000);
        Assert.assertTrue("Nije uspesno logovanje", homePage.addToCartButtonPresent());
        Assert.assertTrue("Nije uspesno logovanje", homePage.productImagePresent());
        homePage.clickAddToCartButton();
        Thread.sleep(3000);
        Assert.assertTrue("Neuspesno dodato.", homePage.redRemoveButtonPresent());
        homePage.clickCartButton();
        Thread.sleep(3000);
        Assert.assertTrue("Nismo na stranici Korpa.",cartPage.descriptionCheckoutInfoPresent());
        cartPage.clickCheckoutButton();
        Thread.sleep(3000);
        Assert.assertTrue("Nismo na Checkout Info", checkoutInfoPage.checkoutInfoPresent());
        checkoutInfoPage.enterFirstName("Nikola");
        checkoutInfoPage.enterLastName("Nikolic");
        checkoutInfoPage.enterZipPostalCode("11000");
        checkoutInfoPage.clickContinueButton();
        Thread.sleep(3000);
        Assert.assertTrue("Neuspesno dodate informacije.",checkoutOverviewPage.checkoutOverviewPresent());
        checkoutOverviewPage.clickFinishButton();
        Thread.sleep(3000);
        Assert.assertTrue("Neuspesno finalizirana kupovina", checkoutCompletePage.thankYouMessagePresent());
    }



}
