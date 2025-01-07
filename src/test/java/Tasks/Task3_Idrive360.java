package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Task3_Idrive360 {

    @Test
    public void Tast3() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--incognito");
        options.addArguments("--start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(3000);
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("augtest_040823@idrive.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");
        WebElement RememberMe = driver.findElement(By.className("id-checkmark"));
        RememberMe.click();
        WebElement submit_btn = driver.findElement(By.id("frm-btn"));
        submit_btn.click();
        Thread.sleep(6000);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Thread.sleep(8000);

        //Assertion done here.
        WebElement errormsg = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        System.out.println( errormsg.getText());
        assertThat(errormsg.getText()).isEqualTo("Your free trial has expired");


        System.out.println("success");
        driver.quit();
    }
}
