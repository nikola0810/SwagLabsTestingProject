package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    public WebDriver driver;
    public By checkoutButton=By.id("checkout");
    public By removeBikeLightButton=By.id("remove-sauce-labs-bike-light");
    public By removeTshirtButton=By.id("remove-sauce-labs-bolt-t-shirt");
    public By removeBackpackButton=By.id("remove-sauce-labs-backpack");
    public By descriptionCheckoutInfo=By.xpath("//*[text()='Description']");
    public By backpackItem=By.id("item_4_title_link");
    public By bikeLightItem=By.id("item_0_title_link");
    public By tshirtItem=By.id("item_1_title_link");
    public CartPage(WebDriver driver) {

        this.driver = driver;
    }
    public void clickCheckoutButton(){

        driver.findElement(checkoutButton).click();
    }

    public boolean descriptionCheckoutInfoPresent(){
        return driver.findElement(descriptionCheckoutInfo).isDisplayed();
    }
    public void clickRemoveBikeLight(){
        driver.findElement(removeBikeLightButton).click();
    }
    public void clickRemoveBackpack(){
        driver.findElement(removeBackpackButton).click();
    }
    public void clickRemoveTshirt(){
        driver.findElement(removeTshirtButton).click();
    }
    public boolean backpackPresent(){
        return driver.findElement(backpackItem).isDisplayed();
    }
    public boolean bikeLightPresent(){
        return driver.findElement(bikeLightItem).isDisplayed();
    }
    public boolean tshirtPresent(){
        return driver.findElement(tshirtItem).isDisplayed();
    }

}
