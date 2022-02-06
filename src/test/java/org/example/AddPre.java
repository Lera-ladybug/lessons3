package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AddPre {
    @Test
    public void shouldAnswerWithTrue1() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://pudra.by/gift-card");

//r
        WebElement limitImputField = driver.findElement(By.cssSelector("#formPresentCard > div.form-group > input"));
        limitImputField.click();
        limitImputField.sendKeys("1000");
        WebElement welElement = driver.findElement(By.cssSelector("#formPresentCard > button"));
        welElement.click();


    }
}
