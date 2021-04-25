package Selenium1;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;

public class Topic2 extends TestBase {
    private static Logger LOGGER = Logger.getLogger(Topic2.class);

    @Test
    public void validateFrame() {
        setUpDriver("chrome");
        // driver.get("https://demoqa.com/frames");
        setupUrl("https://demoqa.com/frames");
        sleepFor(2);
        driver.switchTo().frame("frame2");
        driver.switchTo().defaultContent();


    }

    @Test
    public void validateAlert() {
        // this is alert handling
        setUpDriver("chrome");
        setupUrl("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        sleepFor(2);
        driver.findElement(By.id("alertButton")).click();
        String txt = driver.switchTo().alert().getText();
        LOGGER.info(txt);
        driver.switchTo().alert().accept();

    }

    @Test
    public void dropDown() {
        setUpDriver("chrome");
        setupUrl("https://www.ebay.com");
        sleepFor(2);
        WebElement element = driver.findElement(By.cssSelector("#gh-cat"));
        Select slct = new Select(element);
        slct.selectByValue("11233");
        sleepFor(2);
        closeDriver();

    }

    @Test
    public void mouseHover() {
        setUpDriver("chrome");
        setupUrl("https://www.ebay.com");
        sleepFor(2);
        WebElement motor = driver.findElement(By.linkText("Motors"));
        Actions act = new Actions(driver);
        act.moveToElement(motor).build().perform();
        sleepFor(2);
        driver.findElement(By.linkText("Cars & Trucks")).click();

    }

    @Test
    public void validateScrollDown() {
        setUpDriver("chrome");
        setupUrl("https://www.ebay.com");
        driver.manage().window().maximize();
        sleepFor(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    @Test
    public void validateScroll2() {
        setUpDriver("chrome");
        setupUrl("https://www.ebay.com");
        driver.manage().window().maximize();
        sleepFor(2);
        WebElement element1 = driver.findElement(By.linkText("Announcements"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element1);
    }
}
