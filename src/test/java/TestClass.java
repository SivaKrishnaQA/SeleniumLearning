import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestClass {

    @Test
    public void testOnIDrive() throws InterruptedException {


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.ebay.com/");
        Thread.sleep(3000);

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("minimac");
        WebElement searchBtn = driver.findElement(By.id("gh-btn"));
        searchBtn.click();
        List<WebElement> title = driver.findElements(By.className("s-item__title"));
        List<WebElement> price = driver.findElements(By.className("s-item__price"));

        int size = Math.min(price.size(), title.size());
        for (int i = 0; i < size; i++) {


            System.out.println("Title is "+ title.get(i).getText() + "||" + "Price is" +price.get(i).getText()) ;
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
