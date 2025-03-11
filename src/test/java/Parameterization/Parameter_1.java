package Parameterization;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_1 {

    public WebDriver d;


    @Parameters("BrowserName")

    @BeforeMethod


    public void setup( String BrowserName){
        if(BrowserName.equalsIgnoreCase("Chrome")) {
            d = new ChromeDriver();
            d.get("https://www.google.com/");

        } else if (BrowserName.equalsIgnoreCase("Firefox")) {

            d = new FirefoxDriver();
            d.get("https://www.google.com/");
            
        }else if (BrowserName.equalsIgnoreCase("Edge")) {

            d = new EdgeDriver();
            d.get("https://www.google.com/");

        }else{

            throw new RuntimeException("Please select the correct browser");
        }
    }
    @Test
    public void main(){

         d = new ChromeDriver();
        d.get("https://www.google.com/");

        d.manage().window().maximize();

         WebElement W =d.findElement(By.name("q"));

        W.sendKeys("Java");

        W.sendKeys(Keys.ENTER);


    }
}
