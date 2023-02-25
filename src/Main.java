import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PracticeFormPage;

import java.time.Duration;

public class Main{

    public WebDriver driver;
    PracticeFormPage practiceFormPage;

    @BeforeMethod
    public void beforeEveryMethod(){
        System.setProperty("webdriver.chrome.driver", "/Users/oriyomiagbomeji/Downloads/msedgedriver");
        driver=new EdgeDriver();
        driver.manage().window().maximize();
    }


@Test
    public void fillPracticeForm(){

    driver.get("https://demoqa.com/automation-practice-form");
    practiceFormPage.enterUserName();
    practiceFormPage.enterUserEmail();


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    WebElement firstName= driver.findElement(By.id("firstName")); //locator
    firstName.sendKeys("Oriyomi");//action
    WebElement lastName= driver.findElement(By.id("lastName"));
    lastName.sendKeys("Agbomeji");
    WebElement userEmail= driver.findElement(By.id("userEmail"));
    userEmail.sendKeys("abc@gmail.com");
    WebElement gender= driver.findElement(By.xpath("//*[@id='gender-radio-1']"));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();", gender);

    WebElement userNumber= driver.findElement(By.id("userNumber"));
    userNumber.sendKeys("2402599222");
    userNumber.clear();
    WebElement dateofbirth= driver.findElement(By.id("dateOfBirthInput"));
    dateofbirth.click();
    dateofbirth.clear();
    dateofbirth.sendKeys("12 Feb 2015");

    WebElement sportHobbies= driver.findElement(By.xpath("//*//*[@id='hobbies-checkbox-1']"));
    js.executeScript("arguments[0].click();", sportHobbies);









    //JavascriptExecutor js = (JavascriptExecutor)driver;
    //js.executeScript("arguments[0].click();", hobbies);


}

@Test
    public void fillTextBoxForm() throws Exception{

    driver.get("https://demoqa.com/text-box");


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    //WebElement userName= driver.findElement(By.id("userName"));
    //userName.sendKeys("Oriyomi Agbomeji");
   // WebElement userEmail= driver.findElement(By.id("userEmail"));
    //userEmail.sendKeys("abc@gmail.com");
    WebElement currentAddress= driver.findElement(By.id("currentAddress"));
    //currentAddress.sendKeys("85 Garner Ave Waldorf MD 20602");
    WebElement permanentAddress= driver.findElement(By.id("permanentAddress"));
    permanentAddress.sendKeys("85 Garner Ave Waldorf MD 20602");
    WebElement submit= driver.findElement(By.xpath("//*[@id='submit']"));
    wait.until (ExpectedConditions.visibilityOf(submit));
    wait.until(ExpectedConditions.elementToBeClickable(submit));





}

@Test
    public void fillCheckBoxForm(){
    driver.get("https://demoqa.com/checkbox");



}

@AfterMethod
    public void tearDown(){
        driver.quit();
}

        //WebElement gender= driver.findElement(By.xpath("//*[@id='gender-radio-1']"));
        //wait.until(ExpectedConditions.visibilityOf(gender));
        //wait.until(ExpectedConditions.elementToBeClickable(gender));
        //gender.click();
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("arguments[0].click();", gender);
        //WebElement hobbies= driver.findElements(By.xpath("//*[@id='hobbies-checkbox-1']"));

//all web elements + actions
    //test case






}
