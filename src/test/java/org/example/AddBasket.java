package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;


public class AddBasket {

    @Test
    public void shouldAnswerWithTrue() throws StaleElementReferenceException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://automationpractice.com/");

        //((JavascriptExecutor)driver).executeScript("window.focus();");
        List<WebElement> products = driver.findElements(By.xpath("//div[@class=\"product-container\"]"));

        System.out.println("Product elements: " + products.size());

        WebElement firstProduct = products.get(0);
        firstProduct.click();

        ThreadSleep.sleep(3);

        ///
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("document.getElementById('/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div').focus();");
        ///

        //WebElement btnAddCard = firstProduct.findElement(By.xpath("//a[@class=\"button\"]"));
        //btnAddCard.click();

        //products.get(0).findElement()
        //product.click();
        // //*[@id="center_column"]/ul/li[1]/div/div[2]/div[2]/a[1]/span

        //WebElement btnAddCard = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
        //btnAddCard.click();

        //WebElement checkOut = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        //checkOut.click();

        //WebElement passwordInputField = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
        //passwordInputField.sendKeys("qwerty123");
        //WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));
        //loginButton.click();
    }
}

