package practice;

import io.qameta.allure.internal.shadowed.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.testng.annotations.Test;


public class Hartford_Practice {


    @Test

    public void Hartford_PracticeTest() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.thehartford.com/");
        Thread.sleep(3000);

        WebElement inputZipCode = driver.findElement(By.xpath("//input[@class='form-control'][1]"));
        //inputZipCode.sendKeys("06001");
        //Thread.sleep(3000);
        System.out.println(inputZipCode.getText());
        WebElement input_box = driver.findElement(By.xpath("//div[@class='form-group']/following-sibling::button"));
        input_box.click();
        System.out.println(input_box.getText());
        WebElement error_text = driver.findElement(By.xpath("//div[@class='help-block with-errors']/child::ul/li"));
        System.out.println(error_text.getText());
        assertThat(error_text.equals("Enter five-digit zip code"));

        Thread.sleep((3000));


        WebElement ActionMessageAuto = driver.findElement(By.xpath("//div[@class='cqb3-action-message']"));
        ActionMessageAuto.click();
        System.out.println(ActionMessageAuto.getText());
        String actionMessageAuto = ("55,000+ drivers started a quote in the last week");
        assertThat(ActionMessageAuto.getText().contains(actionMessageAuto));
        System.out.println("test1 complete");
        Thread.sleep(3000);

        System.out.println("test 2");
        WebElement AutoHomeIcon = driver.findElement(By.xpath("//a[contains(text(),'Auto + Home')]"));
        AutoHomeIcon.click();
        WebElement AutoHomeMessage = driver.findElement(By.xpath("//div[@class='cqb3-tab active']/div/div"));
        System.out.println(AutoHomeMessage.getText());
        String AutoHomeMessageText = ("The only auto and home insurance program ");
        assertThat(AutoHomeIcon.getText().contains(AutoHomeMessageText));
        System.out.println("test2 end");
        Thread.sleep(3000);

        System.out.println("test3 start");

        driver.findElement(By.xpath("//a[@data-dl-cat='Quote - Home']")).click();
        WebElement HomeActionMessage = driver.findElement(By.xpath("//div[contains(text(),' benefits and discounts for AARP members')]"));
        System.out.println(HomeActionMessage.getText());
        String HomeActionMessageText = (" benefits and discounts for AARP members");
        assertThat(HomeActionMessage.getText().contains(HomeActionMessageText));
        System.out.println("Test3 end");
        Thread.sleep(3000);

        System.out.println("test4 start");
        driver.findElement(By.xpath("//div[@id='cqb-nav-1']/child::ul/li[4]")).click();
        Thread.sleep(3000);
        WebElement BusinessActionMessage = driver.findElement(By.xpath("//div[contains(text(),' business owners started a quote in the last week')]"));
        System.out.println(BusinessActionMessage.getText());
        String BusinessActionMessageText = (" business owners started a quote in the last week");

        assertThat(BusinessActionMessage.getText().contains(BusinessActionMessageText));
        System.out.println("Test4 end");

        //footerNavigation




        driver.quit();
    }


}
