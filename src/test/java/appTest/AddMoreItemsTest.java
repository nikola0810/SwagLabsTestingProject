package appTest;

import org.junit.Assert;
import org.junit.Test;

public class AddMoreItemsTest extends BaseTest {
    @Test
    public void addingItemsToCart() {
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
        Assert.assertTrue("Uspesno dodate stvari",cartPage.backpackPresent());
        Assert.assertTrue("Uspesno dodate stvari",cartPage.bikeLightPresent());
        Assert.assertTrue("Uspesno dodate stvari",cartPage.tshirtPresent());
    }
}
