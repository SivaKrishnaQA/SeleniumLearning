package SeleniumPracticeCode;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class WebPageInteraction {

    @Test
    public void Interactions(){
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--window-size=1920*1080");
        chromeoptions.addArguments("--incognito");
        chromeoptions.addArguments("--start maximized");
        ChromeDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://vwo.com");
}
}



