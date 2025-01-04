package SeleniumPracticeCode;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Options {

    @Test
    public void testOptions() {


        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--start-maximized");
        //edgeOptions.addArguments("--window-size=1920,1080");

        ChromeDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://google.com");
        driver.get("https://www.orangehrm.com/");
        driver.quit();

//        similarly  if it is for testing in edge browser.
//        EdgeOptions edgeOptions = new EdgeOptions();
//        edgeOptions.addArguments("--start-maximized");
//        edgeOptions.addArguments("--window-size=1920,1080");
//
//        EdgeDriver driver = new EdgeDriver(edgeOptions);
//        driver.get("https://google.com");
    }
}
//[peter.sh/experiments/chromium-command-line-switches/](https://peter.sh/experiments/chromium-command-line-switches/)