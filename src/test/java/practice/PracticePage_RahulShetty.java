package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class PracticePage_RahulShetty {

    @Test
    public void PracticeLocators() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incoginito");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.getCurrentUrl().contains("rahulshettyacademy");

         //Locators

        driver.findElement(By.xpath("//input[@value='radio1']"));
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");
        driver.findElement(By.xpath("//input[@id='autocomplete']")).getText().contains("India");
        Thread.sleep(3000);
        driver.quit();

    }
}
