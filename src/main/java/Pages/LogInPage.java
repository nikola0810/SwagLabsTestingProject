package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    public WebDriver driver;
    public By userNameInputField=By.id("user-name");
    public By passwordInputField=By.id("password");
    public By loginButton=By.id("login-button");
    public By errorMessage=By.xpath("//*[text()='Epic sadface: Username and password do not match any user in this service']");
    public By errorMessageNoPass=By.xpath("//*[text()='Epic sadface: Password is required']");
    public By errorMessageNoUser=By.xpath("//*[text()='Epic sadface: Username is required']");
    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterUserName(String userName){
        driver.findElement(userNameInputField).sendKeys(userName);
    }
    public void enterPassword(String password){
        driver.findElement(passwordInputField).sendKeys(password);
    }
    public void clickLogInButton(){
        driver.findElement(loginButton).click();
    }
    public void successfulLogIn(){
        driver.findElement(userNameInputField).sendKeys("standard_user");
        driver.findElement(passwordInputField).sendKeys("secret_sauce");
        driver.findElement(loginButton).click();
    }
    public boolean errorMessagePresent(){
        return driver.findElement(errorMessage).isDisplayed();
    }
    public boolean errorMessageNoPassPresent(){
        return driver.findElement(errorMessageNoPass).isDisplayed();
    }
    public boolean errorMessageNoUserPresent(){
        return driver.findElement(errorMessageNoUser).isDisplayed();
    }

}
