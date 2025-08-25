package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoExerNewUserSignUpPage {
    WebDriver driver;
    private By signupVisible = By.xpath("//div[@class='signup-form']");
    private By nameLocator = By.xpath("//input[@data-qa='signup-name']");
    private By emailLocator = By.xpath("//input[@data-qa='signup-email']");
    private By signUpLocator = By.xpath("//button[@data-qa='signup-button']");


    public AutoExerNewUserSignUpPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean signUpPageIsVisible(){
        return driver.findElement(signupVisible).isDisplayed();
    }
    public void setName(String nam){
        driver.findElement(nameLocator).sendKeys(nam);
    }
    public void setEmail(String eMl){
        driver.findElement(emailLocator).sendKeys(generateRamdonEmail());
    }
    private String generateRamdonEmail(){
        return RandomStringUtils.random(4, true, true)+ "@GMAIL.COM";
    }
    public void clickOnSignUpBtn(){
        driver.findElement(signUpLocator).click();
    }
}
