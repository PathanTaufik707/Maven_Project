package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsON_Method {

@Test
    public void LoginFunctionality(){

    WebDriver A = new ChromeDriver();

    A.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox/FMfcgzQZSjjrKZxDcbVzVdGSWsvBZhxF");

    A.close();

    Assert.assertTrue(true);



    }

    @Test(dependsOnMethods = "LoginFunctionality",groups = {"UAT"} )
    public void HomePageFunctionality() {

        WebDriver A = new ChromeDriver();

        A.get("https://www.amdocs.com/");
    }

    @Test
    public void Onbording() {
        System.out.println("Onbording");
    }


}
