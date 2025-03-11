package Assertion_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {

    @Test

    public void SaucDemoApplication(){

        SoftAssert soft = new SoftAssert();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        WebElement SwagLabsElement = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

        soft.assertTrue(SwagLabsElement.isDisplayed(),"SwagLabsElement is displayed");

        WebElement ProductElement = driver.findElement(By.xpath("//span[text()='Products']"));

        soft.assertEquals(ProductElement.getText(),"Products");

        soft.assertAll();

        driver.close();

    }
}
