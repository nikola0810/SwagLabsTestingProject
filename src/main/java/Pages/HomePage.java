package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;
    public By productImage=By.className("inventory_item_img");
    public By addToCartBackpackButton=By.id("add-to-cart-sauce-labs-backpack");
    public By addToCartBikeLightButton=By.id("add-to-cart-sauce-labs-bike-light");
    public By addToCartTshirtButton=By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    public By cartButton=By.className("shopping_cart_link");
    public By redRemoveButton= By.id("remove-sauce-labs-backpack");
    public By twitterButton=By.xpath("//*[text()='Twitter']");
    public By facebookButton=By.xpath("//*[text()='Facebook']");
    public By linkedInButton=By.xpath("//*[text()='LinkedIn']");



    public HomePage(WebDriver driver) {

        this.driver = driver;
    }
    public void clickAddToCartButton(){

        driver.findElement(addToCartBackpackButton).click();
    }
    public void clickAddToCartBikeLightButton(){

        driver.findElement(addToCartBikeLightButton).click();
    }
    public void clickAddToCartTshirtButton(){

        driver.findElement(addToCartTshirtButton).click();
    }
    public void clickCartButton(){

        driver.findElement(cartButton).click();
    }
    public boolean productImagePresent(){
        return driver.findElement(productImage).isDisplayed();
    }
    public boolean addToCartButtonPresent(){
        return driver.findElement(addToCartBackpackButton).isDisplayed();
    }
    public boolean addToCartBikeLightPresent(){
        return driver.findElement(addToCartBikeLightButton).isDisplayed();
    }
    public boolean addToCartTshirtPresent(){
        return driver.findElement(addToCartTshirtButton).isDisplayed();
    }
    public boolean redRemoveButtonPresent(){
        return driver.findElement(redRemoveButton).isDisplayed();
    }
    public void clickTwitterButton(){
        driver.findElement(twitterButton).click();
    }
    public void clickFacebookButton(){
        driver.findElement(facebookButton).click();
    }
    public void clickLinkedInButton(){
        driver.findElement(linkedInButton).click();
    }

}
