package Selenium;

import Listner.Retry_Example;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class PriorityExample {

    @Test(priority =1, enabled = true,retryAnalyzer = Retry_Example.class)

    public void TestCaseA(){

        System.out.println("TestCaseA");
    }

    @Test(priority = 2, retryAnalyzer = Retry_Example.class )

    public void TestCaseD() {

        Assert.assertTrue(false);

        System.out.println("TestCaseD");

    }

    @Test(priority = 3,groups = {"UAT"},retryAnalyzer = Retry_Example.class)

    public void TestCaseV() {

        System.out.println("TestCaseV");

    }

    @Test(priority = 4,groups = {"UAT"},retryAnalyzer = Retry_Example.class )

    public void TestCaseB() {

        System.out.println("TestCaseB");

    }

    @Test(priority = '5',retryAnalyzer = Retry_Example.class)

    public void TestCaseZ() {

        System.out.println("TestCaseZ");
    }
    }
