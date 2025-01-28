package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class practiceOnLocators {
    @Test
    public void EbayLoginTest() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys(("minimac"));
        WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Search']"));
        searchBtn.click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(5000);

        assertThat(driver.getCurrentUrl().contains("minimac"));
        //assertThat(pageTitle).isEqualTo("Minimac for sale | eBay");

        List<WebElement> itemTitle = driver.findElements(By.xpath("//span[@role='heading']"));
        List<WebElement> itemPrice  = driver.findElements(By.xpath("//span[@class='s-item__price']"));

        //this will compare the sizes of two elements i.e title and price of each product.
        //here we are doing this becasue in some situations price of the product will not be given.
        //so we will take the smaller size of two list as our final size.

        //if price is not available, it will print "Price is : Not Available"

        //if both lists are empty, it will print "No products found"

        //if both lists are not empty, it will print the product details of both

        //if one of the list is empty, it will print the product details of non-empty list

        //if one of the list is empty, it will print "No products found"

        //if one of the list is empty, it will print the product details of non-empty list

        //if one of the list is empty, it will print "No products found"

        //if one of the list is empty, it will print the product details of non-empty list

        //if one of the list is empty, it will print "No products found"

        //if one of the list is empty, it will print the product details of non-empty list

        //for loop to print the title and price of each product.

        //if the price is not given for any product, it will not print the price.

        //if the size of two lists are not equal, it will print the product details of smaller size.

        //if both lists are equal, it will print the product details of both.

        //this loop will print the details of all the products.

        //if you want to print only the details of products which have price, you can use this loop.

        //if you want to print only the details of products which do not have price, you can use this loop.

        //if you want to print only the details of products which have price and are sold, you can use this loop.
        int minSize = Math.min(itemTitle.size(), itemPrice.size());

        for (int i=0; i<minSize;i++){
            System.out.println("title is : "+ itemTitle.get(i).getText());
            System.out.println("price is : "+ itemPrice.get(i).getText());

        }
        driver.quit();

    }
}

/*          System.out.println("title is : "+ itemTitle.get(i).getText().isEmpty());
            System.out.println("price is : "+ itemPrice.get(i).getText().isEmpty());    */
/*output*/
/*title is : true
price is : true
title is : true
price is : true
title is : false
price is : false
title is : false
price is : false*/