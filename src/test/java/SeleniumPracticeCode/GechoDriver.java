package SeleniumPracticeCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GechoDriver {


    @Test
    public void GeChoDriver(){
        System.out.println("GeckoDriver test");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.getTitle();
        driver.quit();

    }
}
