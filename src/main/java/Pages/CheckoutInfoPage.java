package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInfoPage {
    public WebDriver driver;
    public By inputFirstName=By.id("first-name");
    public By inputLastName=By.id("last-name");
    public By inputZipPostalCode=By.id("postal-code");
    public By continueButton=By.id("continue");
    public By checkoutInfo=By.xpath("//*[text()='Checkout: Your Information']");

    public CheckoutInfoPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterFirstName(String firstName){
        driver.findElement(inputFirstName).sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        driver.findElement(inputLastName).sendKeys(lastName);
    }
    public void enterZipPostalCode(String zipPostalCode){
        driver.findElement(inputZipPostalCode).sendKeys(zipPostalCode);
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
    public boolean checkoutInfoPresent(){
        return driver.findElement(checkoutInfo).isDisplayed();
    }
}
