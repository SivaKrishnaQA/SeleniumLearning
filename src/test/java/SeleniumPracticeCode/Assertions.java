package SeleniumPracticeCode;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertJ {
    // TODO: Implement AssertJ assertions for Selenium WebDriver
    // https://github.com/joel-costigan/assertj-core/wiki/AssertJ-for-Selenium- WebDriver

    @Test
    public void AssertjExample(){
        // Example usage of AssertJ for Selenium WebDriver
        // Assuming driver is an instance of WebDriver
        ChromeDriver driver = new ChromeDriver();

        //AssertJ example
        driver.get("https://www.google.com/");
        assertThat(driver.getTitle()).contains("Google").isNotBlank();
        System.out.println("Assertion done in AssertJ");
        //VS TestNG

        Assert.assertEquals(driver.getTitle(),"Google");
        System.out.println("Assertion done in TestNG");
        driver.quit();
    }
}
