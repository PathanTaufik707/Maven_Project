import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IntroductionOfTestNG {

    @Test

    public static void TestNG(){

       
        driver.get("https://qualitykiosk.com/");

        driver.close();
    }

    @Test
    public void Amdocs(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://Amdocs.com/");

        driver.close();

    }

    @Test

    public void CT_Bank(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://CTBANK.com/");

        driver.close();


    }


}
