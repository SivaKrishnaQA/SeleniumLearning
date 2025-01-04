package SeleniumPracticeCode;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class XPathLocatorss {
    // TODO: Implement XPath locators for Selenium WebDriver
    /*There are several different types of locators that can be used, including:

- ID: This locator type uses the **unique ID attribute** of an element to locate it on the page.
- Name: This locator type uses the name attribute of an element to locate it on the page.
- Class name: This locator type uses the class attribute of an element to locate it on the page.
- Tag name: This locator type uses the HTML tag name of an element to locate it on the page.
- Link text: This locator type uses the text of a link to locate it on the page.
- Partial link text: This locator type uses part of the text of a link to locate it on the page.


**Preference Rule**  ->

- unique ID -> name -> class Name -> TagName -> Link Text/ Partial  - CSS Selector -> XPath(95%).
- If it dynamic or changes( we try to avoid the Locator ) or multiple classes.
- If it is not unique we will avoid it.
- Try to **find the shortest Locator and easy to remember**, which doesn't change much.






### Locators in Selenium
1. Default Locators ->** id, name, class name, tag name**
2. anchor Tag -> link text, partial link text.
3. Advance Locators - XPath(Axes, Functions), CSS Selector
*/


@Test
public void Locators() throws InterruptedException {
    ChromeOptions co = new ChromeOptions();
    co.addArguments("--start-maximized");

    WebDriver driver =new ChromeDriver(co);
    driver.get("https://app.vwo.com");
    driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
    driver.findElement(By.id("login-password")).sendKeys("password");
    driver.findElement(By.className("checkbox-radio-icon")).click();
    Thread.sleep(3000);

    driver.findElement(By.id("js-login-btn"));
//    List<WebElement> buttons_list = (List<WebElement>) driver.findElement(By.tagName("button"));
//    buttons_list.get(6).click();
//driver.findElement(By)





    driver.quit();
}

}
