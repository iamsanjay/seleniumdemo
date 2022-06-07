package application;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _GoogleSearchPageTest {

    WebDriver driver;


    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/sanjaydutt/Downloads/chromedriver");
        driver = new ChromeDriver();
    }


    public void tearDown(){
        if(driver!=null){
            driver.close();
            driver.quit();
        }
    }
}
