package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;


public class Herokuapp extends BasePage {
    public Herokuapp(WebDriver driver) {
        super(driver);
    }
    public void openPage(String url){
        driver.get(url);
    }
    public void rightClickTest(){
        Actions actions= new Actions(driver);
        WebElement contextMenu=driver.findElement(By.id("hot-spot"));
        actions.contextClick(contextMenu).perform();
    }
    public void validationTextAndClose(){
        Alert alert = driver.switchTo().alert();
        String element=driver.switchTo().alert().getText();
        assertEquals(element,"You selected a context menu","Error");
        alert.accept();
    }
}
