package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Task2AwesomeQa {

    @Test
    public void TestAwesomeQa() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");



        //initializing Chrome Browser
        WebDriver driver = new ChromeDriver(options);

        //Open AwesomeQa Website 20
        driver.get("https://awesomeqa.com/practice.html");
        driver.findElement(By.name("firstname")).sendKeys("Shiva");
        driver.findElement(By.name("lastname")).sendKeys("Krishna");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-4")).click();
        driver.findElement(By.id("datepicker")).sendKeys("21/01/1988");
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        driver.findElement(By.id("tool-2")).click();



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
