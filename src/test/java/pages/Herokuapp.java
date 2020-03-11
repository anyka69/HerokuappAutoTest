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

    public void openPage(String url) {
        driver.get(url);
    }

    public void rightClickTest() {
        Actions actions = new Actions(driver);
        WebElement contextMenu = driver.findElement(By.id("hot-spot"));
        actions.contextClick(contextMenu).perform();
    }

    public void validationTextAndClose() {
        Alert alert = driver.switchTo().alert();
        String element = driver.switchTo().alert().getText();
        assertEquals(element, "You selected a context menu", "Error");
        alert.accept();
    }

    public void findCheckBox() {
        driver.findElement(By.xpath("//*[@id=\"checkbox\"]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
    }

    public void verificationCheckBox() {
        String message = driver.findElement(By.id("message")).getText();
        assertEquals(message, "It's gone!", "Error");
    }

    public void writeText(String text) {
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).sendKeys(text);
    }

    public void checkEnable() {
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
        String enable = driver.findElement(By.id("message")).getText();
        assertEquals(enable, "It's enabled!", "Error");
    }

    public void checkDisable() {
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
        String disable = driver.findElement(By.id("message")).getText();
        assertEquals(disable, "It's disabled!", "Error!");
    }

    public void fileUpload(String url) {
        WebElement browse = driver.findElement(By.name("file"));
        browse.sendKeys(System.getProperty("user.dir") + url);
        driver.findElement(By.id("file-submit")).click();
    }

    public void verificationFileUpload() {
        String fileUpload = driver.findElement(By.id("uploaded-files")).getText();
        assertEquals(fileUpload, "Котик.jpg", "Error!");
    }
}
