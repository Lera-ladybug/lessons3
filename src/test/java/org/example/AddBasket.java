package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AddBasket {
    @Test
    public void shouldAnswerWithTrue1() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://pudra.by/catalog/face/klapp/bb-krem-spf-gk-cuvee-prestige-klapp");

        WebElement wekElement = driver.findElement(By.cssSelector("body > div:nth-child(1) > div.wrapper-page > main > section.section.section-card-product > div > div > div:nth-child(2) > div.col-md-12.col-sm-13 > div > div > div.card-product-content-inner > table > tbody > tr:nth-child(2) > td:nth-child(2) > div > div.col-sm-8.col-xs-7.col-btn-pay > button"));
        wekElement.click();

    }
}