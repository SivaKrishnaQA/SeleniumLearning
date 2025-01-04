package SeleniumPracticeCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Assertions {
    // basically assertions are used to match the actual result with expected result.
    // TODO: Implement AssertJ assertions for Selenium WebDriver
    // https://github.com/joel-costigan/assertj-core/wiki/AssertJ-for-Selenium- WebDriver

    @Test
    public void AssertjExample(){
        // Example usage of AssertJ for Selenium WebDriver
        // Assuming driver is an instance of WebDriver

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--start-maximized");


        WebDriver driver = new ChromeDriver(co);

        //AssertJ example
        driver.get("https://www.google.com/");
        assertThat(driver.getTitle()).contains("Google").isNotBlank();
        assertThat(driver.getCurrentUrl()).contains("https://www.google.com/").isNotBlank().isEqualTo("https://www.google.com/");
        System.out.println("Assertion done in AssertJ");
        //VS TestNG

        Assert.assertEquals(driver.getTitle(),"Google");
        System.out.println("Assertion done in TestNG");
        driver.quit();
    }
}
