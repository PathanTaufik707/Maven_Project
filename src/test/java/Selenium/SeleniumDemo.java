package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDemo {

@Test
    public void Sel(){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.29.0");

        driver.close();
    }
}
