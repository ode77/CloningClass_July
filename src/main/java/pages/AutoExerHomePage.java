package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoExerHomePage {
    WebDriver driver;
    private By cookiesLocator = By.xpath("//p[contains(text(),'Consent')]");
private By homePageVisible = By.xpath("//header[@id='header']");
private By logoVisible = By.xpath("//div[@class='logo pull-left']");
private By signUplocator = By.xpath("//a[contains(text(),' Signup / Login')]");
private By userNameVisible = By.xpath("//a[contains(text(),' Logged in as ')]");
private By logoutLocator = By.xpath("//a[@href='/logout']");



public AutoExerHomePage( WebDriver driver){
    this.driver = driver;

}
public void clickOnCookies(){
    driver.findElement(cookiesLocator).click();
}

    public boolean homePageIsVisible() {
        return driver.findElement(homePageVisible).isDisplayed();

    }

    public boolean logoIsVisible() {
        return driver.findElement(logoVisible).isDisplayed();

    }
    public void clickOnSignUpBtn(){
        driver.findElement(signUplocator).click();
    }
    public boolean userNameIsVisible(){
    return driver.findElement(userNameVisible).isDisplayed();
    }
    public void clickOnLogoutBtn(){
    driver.findElement(logoutLocator).click();
    }

}
