package appTest;

import org.junit.Assert;
import org.junit.Test;

public class RemoveItemsTest extends BaseTest{
    @Test
    public void removeItemsTestFromCart() {
        logInPage.successfulLogIn();
        Assert.assertTrue("Nije uspesno logovanje", homePage.addToCartButtonPresent());
        Assert.assertTrue("Nije uspesno logovanje", homePage.productImagePresent());
        homePage.clickAddToCartButton();
        Assert.assertTrue("Nije uspesno dodato",homePage.redRemoveButtonPresent());
        homePage.clickAddToCartBikeLightButton();
        Assert.assertTrue("Nije uspesno dodato",homePage.redRemoveButtonPresent());
        homePage.clickAddToCartTshirtButton();
        Assert.assertTrue("Nije uspesno dodato",homePage.redRemoveButtonPresent());
        homePage.clickCartButton();
        Assert.assertTrue("Nismo u Cart.", cartPage.descriptionCheckoutInfoPresent());
        cartPage.clickRemoveBackpack();
        cartPage.clickRemoveBikeLight();
        cartPage.clickRemoveTshirt();
        driver.navigate().back();
        Assert.assertTrue("Nije uklonjen ranac.", homePage.addToCartButtonPresent());
        Assert.assertTrue("Nije uklonjeno svetlo za biciklu.", homePage.addToCartBikeLightPresent());
        Assert.assertTrue("Nije uklonjena majica.", homePage.addToCartTshirtPresent());
    }
}
