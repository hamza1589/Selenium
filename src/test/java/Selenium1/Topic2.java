package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;

public class Topic2 extends TestBase {
    @Test
    public void validateFrame(){
        setUpDriver("chrome");
       // driver.get("https://demoqa.com/frames");
        setupUrl("https://demoqa.com/frames");
        sleepFor(2);
        driver.switchTo().frame("frame2");
        driver.switchTo().defaultContent();


    }
    @Test
    public void validateAlert(){
        // this is alert handling
        setUpDriver("chrome");
        setupUrl("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        sleepFor(2);
        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert().accept();

    }
    @Test
    public void dropDown(){
        setUpDriver("chrome");
        setupUrl("https://www.ebay.com");
        sleepFor(2);
        WebElement element=driver.findElement(By.cssSelector("#gh-cat"));
        Select slct=new Select(element);
        slct.selectByValue("11233");
        sleepFor(2);
        closeDriver();

    }
    @Test
    public void mouseHover(){
        setUpDriver("chrome");
        setupUrl("https://www.ebay.com");
        sleepFor(2);
        WebElement motor=driver.findElement(By.linkText("Motors"));
        Actions act =new Actions(driver);
        act.moveToElement(motor).build().perform();
        sleepFor(2);
        driver.findElement(By.linkText("Cars & Trucks")).click();

    }
}
