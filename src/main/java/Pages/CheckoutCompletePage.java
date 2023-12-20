package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {
    public WebDriver driver;

    public By thankYouMessage=By.xpath("//*[text()='Thank you for your order!']");

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean thankYouMessagePresent(){
        return driver.findElement(thankYouMessage).isDisplayed();
    }
}
