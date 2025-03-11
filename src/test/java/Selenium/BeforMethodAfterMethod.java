package Selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforMethodAfterMethod {


    @BeforeMethod

    public void beforemethod(){

        System.out.println("beforemethod");
    }
    @Test

    public void Test_1(){
        System.out.println("Test_1 Pass");

    }

    @Test

    public void Test_2(){
        System.out.println("Test_2 Pass");

    }
    @Test(groups = {"UAT"})

    public void Test_3(){

        System.out.println("Test_3");
    }

    @AfterMethod

    public void Aftermethod(){

        System.out.println("aftermethod");
    }


}
