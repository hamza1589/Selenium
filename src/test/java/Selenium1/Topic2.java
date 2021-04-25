package Selenium1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Topic2 extends TestBase {
    @Test
    public void validateFrame(){
        setUpDriver("chrome");
        driver.get("https://demoqa.com/frames");
        sleepFor(2);
        driver.switchTo().frame("frame2");
        driver.switchTo().defaultContent();


    }
    @Test
    public void validateAlert(){
        // this is alert handling
        setUpDriver("chrome");
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        sleepFor(2);
        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert().accept();

    }
}
