package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1_KatalonAppointment23Dec {

    @Test

    public void TaskKatalonAppointment() {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(co);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("btn-make-appointment")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        assertThat(driver.getTitle()).contains("CURA Healthcare Service");
        assertThat(driver.getCurrentUrl().equals("https://katalon-demo-cura.herokuapp.com/profile.php#login"));


        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login"));
        assertThat(driver.getCurrentUrl().equals("https://katalon-demo-cura.herokuapp.com/#appointment"));

        System.out.println(driver.getTitle());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());




        driver.quit();
    }
}

