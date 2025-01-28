package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PracticePage2 {

    @Test
    public void PracticeLocatorsPart2() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incoginito");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.getCurrentUrl().contains("rahulshettyacademy");

        // Locators
        WebElement DropdownExample = driver.findElement(By.id("dropdown-class-example"));
        Select DropdownOptions = new Select(DropdownExample);
        DropdownOptions.getOptions();
        DropdownOptions.selectByIndex(1);
        Thread.sleep(3000);
        driver.quit();
    }
}
