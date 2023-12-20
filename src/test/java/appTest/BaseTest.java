package appTest;

import Pages.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass() throws Exception {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

    }

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        driver.quit();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
    }

    HomePage homePage=new HomePage(driver);
    LogInPage logInPage=new LogInPage(driver);
    CartPage cartPage=new CartPage(driver);
    CheckoutOverviewPage checkoutOverviewPage=new CheckoutOverviewPage(driver);
    CheckoutInfoPage checkoutInfoPage=new CheckoutInfoPage(driver);
    CheckoutCompletePage checkoutCompletePage=new CheckoutCompletePage(driver);


}
