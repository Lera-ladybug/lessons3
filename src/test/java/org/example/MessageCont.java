package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MessageCont {
    @Test
    public void shouldAnswerWithTrue1() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://automationpractice.com/index.php?controller=contact");


        WebElement Subject  = driver.findElement(By.xpath("//*[@id=\"id_contact\"]"));
        //WebElement Subject1 = driver.findElement(By.xpath("//*[@id=\"id_contact\"]"));
        Subject.sendKeys ("Webmaster");
        Subject.click();
        WebElement emailInputField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailInputField.click();
        //emailInputField.click();
        emailInputField.sendKeys("valeria.penkovskaya@gmail.com");
        WebElement Order = driver.findElement(By.xpath("//*[@id=\"id_order\"]"));
        Order.click();
        Order.sendKeys("qwert1");
        WebElement Message = driver.findElement(By.xpath("//*[@id=\"message\"]"));
        Message.click();
        Message.sendKeys("qwert1");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"submitMessage\"]"));
        loginButton.click();
    }
}
