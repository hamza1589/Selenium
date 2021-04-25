package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestBase {
    public static WebDriver driver;
    @Test

    public static void setUpDriver(String browserName){
        if(browserName.equalsIgnoreCase( "firefox")){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\hamza\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        }else{
            System.setProperty("webdriver.chrome.driver","C:\\Users\\hamza\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
            driver = new ChromeDriver();}
        //driver.get("https://www.ebay.com");
        }
        public void setupUrl(String url){
        driver.get(url);

        }


    @Test

    public static void sleepFor(int second){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
@Test
    public static void closeDriver(){
        driver.close();
    }


}
