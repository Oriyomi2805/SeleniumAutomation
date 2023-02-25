package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest {

    public WebDriver driver;

    @BeforeMethod
    public void beforeEveryMethod(){
        System.setProperty("webdriver.chrome.driver", "/Users/oriyomiagbomeji/Downloads/msedgedriver");
        driver=new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void fillPracticeForm(){

    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
