package appTest;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginTests extends BaseTest{


    @Test
    public void validLogIn() {
        logInPage.successfulLogIn();
        Assert.assertTrue("Nije uspesno logovanje", homePage.addToCartButtonPresent());
        Assert.assertTrue("Nije uspesno logovanje", homePage.productImagePresent());
    }

    @Test
    public void validUserInvalidPass() {
        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("aslfho1512");
        logInPage.clickLogInButton();
        Assert.assertTrue("Nije izasla ERROR poruka", logInPage.errorMessagePresent());
    }

    @Test
    public void invalidUserValidPass() {
        logInPage.enterUserName("askhfpahg");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickLogInButton();
        Assert.assertTrue("Nije izasla ERROR poruka", logInPage.errorMessagePresent());
    }

    @Test
    public void validUserNoPass() {
        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("");
        logInPage.clickLogInButton();
        Assert.assertTrue("Nije izasla ERROR poruka", logInPage.errorMessageNoPassPresent());
    }

    @Test
    public void noUserValidPass() {
        logInPage.enterUserName("");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickLogInButton();
        Assert.assertTrue("Nije izasla ERROR poruka", logInPage.errorMessageNoUserPresent());
    }

    @Test
    public void noUserNoPass() {
        logInPage.enterUserName("");
        logInPage.enterPassword("");
        logInPage.clickLogInButton();
        Assert.assertTrue("Nije izasla ERROR poruka", logInPage.errorMessageNoUserPresent());
    }
}
    
