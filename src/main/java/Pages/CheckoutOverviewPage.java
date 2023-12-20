package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
    public WebDriver driver;
    public By finishButton= By.id("finish");
    public By checkoutOverview=By.xpath("//*[text()='Checkout: Overview']");

    public CheckoutOverviewPage(WebDriver driver) {

        this.driver = driver;
    }
    public void clickFinishButton(){

        driver.findElement(finishButton).click();
    }
    public boolean checkoutOverviewPresent(){
        return driver.findElement(checkoutOverview).isDisplayed();
    }
}
