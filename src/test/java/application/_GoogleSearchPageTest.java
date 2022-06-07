package application;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Optional;

public class _GoogleSearchPageTest {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/sanjaydutt/Downloads/chromedriver4");
        driver = new ChromeDriver();
    }

    @Test
    public void test() throws  Exception{
        driver.navigate().to("http://www.google.com");
        driver.manage().window().maximize();
        WebElement search_input = driver.findElement(By.className("gLFyf"));
        search_input.sendKeys("University of Victoria");
        //WebElement search_button = driver.findElement(By.cssSelector("input.submit[name = 'btnK']"));
        WebElement search_button = driver.findElement(By.className("gNO89b"));
        search_button.submit();
    //Thread.sleep(3000);

        WebElement nav_bar = driver.findElement(By.xpath("//*[@id=\"rso\"]"));
        List<WebElement> nav_elements = nav_bar.findElements(By.className("g"));

        System.out.println(nav_elements.size());


        /*if(images_div.isPresent()){
            System.out.println("Entered into images div");
            images_div.get().findElement(By.className("hide-focus-ring")).click();
        }*/
        //image_nav.click()/

        Thread.sleep(1000);
    }
    

    @After
    public void tearDown(){
        System.out.println("");
        if(driver!=null){
            driver.close();
            driver.quit();
        }
    }

}
