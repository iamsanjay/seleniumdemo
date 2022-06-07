package application;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class CucumberGoogleUITest {

    WebDriver driver;

    /*@Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/sanjaydutt/Downloads/chromedriver4");
        driver = new ChromeDriver();
    }*/

    @Given("Navigate to Google homepage")
    public void navigateToGoogleHomePage(){
        System.setProperty("webdriver.chrome.driver", "/Users/sanjaydutt/Downloads/chromedriver4");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        driver.manage().window().maximize();
    }

    @When("A User enters a search term in the search bar")
    public void userPerformedSearch(){
        WebElement search_input = driver.findElement(By.className("gLFyf"));
        search_input.sendKeys("University of Victoria");
    }

    @And("A user clicks on Google Search button")
    public void clickGoogleSearchButton(){
        WebElement search_button = driver.findElement(By.className("gNO89b"));
        search_button.submit();
    }

    @Then("A list of search results will be returned")
    public void listOfSearchResults(){
        WebElement nav_bar = driver.findElement(By.xpath("//*[@id=\"rso\"]"));
        List<WebElement> nav_elements = nav_bar.findElements(By.className("g"));
        Assertions.assertTrue(nav_elements.size()>0);

        System.out.println("");
        if(driver!=null){
            driver.close();
            driver.quit();
        }
    }
}
