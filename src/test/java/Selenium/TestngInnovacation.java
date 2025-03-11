package Selenium;

import org.testng.annotations.Test;

public class TestngInnovacation {

    @Test(invocationCount = 5, invocationTimeOut = 2)
    public static void RepaetedTestEx(){

        System.out.println("Repet Test Example");
    }


}

