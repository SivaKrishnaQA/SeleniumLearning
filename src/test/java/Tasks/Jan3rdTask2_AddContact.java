package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Jan3rdTask2_AddContact {

    @Test
    public void Jan3_Task2() throws InterruptedException {
        // Test case to validate that the website has a valid URL
        // Write your code here
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--start-maximized");
       // options.addArguments("--incognito");
        // Initialize the Chrome driver and open the URL
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.us.espocrm.com/?l=en_US#Contact");
        Thread.sleep(3000);
        WebElement LoginBtn = driver.findElement(By.xpath("//button[@id='btn-login']"));
        LoginBtn.click();
        Thread.sleep(4000);
        WebElement CreateContactButton =driver.findElement(By.xpath("//span[text()='Create Contact']"));
        CreateContactButton.click();
        //Thread.sleep(4000);


//        WebElement optionvalue=driver.findElement(By.xpath("//div[@class='selectize-dropdown-content']//div[@class='option' and text()='Mr.']"));
//
//        optionvalue.click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@data-name='firstName']")).sendKeys("Shiva");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//input[@data-name='lastName']")).sendKeys("krishna");
        Thread.sleep(4000);

        //driver.findElement(By.xpath("//div[@data-name='accounts']//input[@placeholder='Select']")).sendKeys();
        driver.findElement(By.xpath("//input[@class='form-control email-address']")).sendKeys("siddudarling21@gmail.com");
        driver.findElement(By.xpath("//span[@class='input-group-item']/following-sibling::span/input[@type='text']")).sendKeys("9884561321");
        driver.findElement(By.xpath("//div[@data-name='address']/textarea")).sendKeys("India, 532201");



        Thread.sleep(5000);

        driver.quit();
    }
}
