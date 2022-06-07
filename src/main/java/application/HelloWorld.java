package application;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HelloWorld {


    public static void main(String args[]){
        WebDriver driver=null;
        try {
            System.setProperty("webdriver.chrome.driver", "/Users/sanjaydutt/Downloads/chromedriver");
            driver = new ChromeDriver();
            driver.navigate().to("http://www.google.com");

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
