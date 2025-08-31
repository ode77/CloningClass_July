package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoExerLoginPage {
    WebDriver driver;
    @FindBy(css = "input[data-qa='login-email']")
    WebElement emailLocator;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement passwordLocator;
    @FindBy(xpath = "//*[@data-qa='login-button']")
    WebElement loginButtonLocator;
    @FindBy(xpath = "//p[@style='color: red;']")
    WebElement errorMessageLocator;


    public AutoExerLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setEmail(String eml){
        emailLocator.sendKeys(eml);
    }
    public void setPassWord(String pwd){
        passwordLocator.sendKeys(pwd);
    }
    public void clickOnLoginBtn(){
        loginButtonLocator.click();
    }
    public String getErrorMessage() {
        return errorMessageLocator.getText();

    }
}
