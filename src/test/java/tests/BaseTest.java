package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Herokuapp;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    Herokuapp elements;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        elements =new Herokuapp(driver);
    }
    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }
}
