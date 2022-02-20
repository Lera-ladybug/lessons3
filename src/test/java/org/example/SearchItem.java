package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SearchItem {

    @Test
    public void shouldAnswerWithTrue() throws StaleElementReferenceException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://automationpractice.com/");

        WebElement search = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
        search.sendKeys ("Blouse");
        WebElement poshook= driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
        poshook.click();
        ThreadSleep.sleep(3);
    }
}

