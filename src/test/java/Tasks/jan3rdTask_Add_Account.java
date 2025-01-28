package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class jan3rdTask_Add_Account {

    @Test
    public void createaccount() throws InterruptedException {
        EdgeOptions options=new EdgeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        WebDriver driver=new EdgeDriver(options);
        driver.get("https://demo.us.espocrm.com/?l=en_US#Account");
        Thread.sleep(3000);
        WebElement LoginButton=driver.findElement(By.xpath("//button[@id='btn-login']"));
        LoginButton.click();
        Thread.sleep(4000);
        WebElement CreateAccountButton=driver.findElement(By.xpath("//span[normalize-space()='Create Account']"));
        CreateAccountButton.click();
        Thread.sleep(4000);
        WebElement InputName=driver.findElement(By.xpath("//input[@data-name='name']"));
        InputName.sendKeys("shiva");
        driver.findElement(By.xpath("//input[@data-name='website']")).sendKeys("shiva.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siddudarling21@gmail.com");
        Thread.sleep(3000);

//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath("//div[text()='Office']"))).click().perform();
//        action.moveToElement(driver.findElement(By.xpath("(//div[@class='option'])[3]"))).click().perform();

        driver.findElement(By.xpath("//input[@autocomplete='espo-phoneNumber']")).sendKeys("9885246845");
        Thread.sleep(3000);
        WebElement SaveButton=driver.findElement(By.xpath("//button[@data-action='save']"));
        SaveButton.click();
        Thread.sleep(3000);

        driver.quit();

    }
}
