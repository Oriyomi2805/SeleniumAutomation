package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PracticeFormPage {


    WebDriver driver;
    @CacheLookup
    @FindBy(how = How.ID, using = "userName")
    public WebElement userName;
    @CacheLookup
    @FindBy(how = How.XPATH, using = "//*[@id='userEmail']")
    public WebElement userEmail;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//*[@id='currentAddress']")
    public WebElement currentAddress;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//*[@id='permanentAddress']")
    public WebElement permanentAddress;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(){
        userName.sendKeys("Oriyomi");
    }
    public void enterUserEmail(){
        userEmail.sendKeys("abc@gmail.com");
    }

    public void enterCurrentAddress(){
        currentAddress.sendKeys("85 Garner Ave Waldorf MD 20602");
    }
    By lastName = By.id("lastName");
 //   By firstName = By.id("firstName");
 //   By firstName = By.id("firstName");
 //   By firstName = By.id("firstName");


}
