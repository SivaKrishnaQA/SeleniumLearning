package SeleniumPracticeCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SeleniumProgram1 {

    @Test
    public void SeleniumProgram1(){
        System.out.println("Executing Selenium Program 1");
        // Code for Selenium test goes here
        // For example, you can use Selenium WebDriver to automate web testing
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.getTitle();
        driver.manage().window().maximize();
     // driver.wait(3000)// ;}

        driver.quit();
}}
