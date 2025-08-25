package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AutoExerAcctInformationPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='login-form']")
    WebElement acctInfoPageVisible;
    @FindBy(id = "id_gender1")
    WebElement titleLocator;
    @FindBy(id = "password")
    WebElement passwordLocator;
    @FindBy(id = "days")
    WebElement dayLocator;
    @FindBy(id = "months")
    WebElement monthLocator;
    @FindBy(id = "years")
    WebElement yearLocator;
    @FindBy(id = "newsletter")
    WebElement newslettersLocator;
    @FindBy(id = "optin")
    WebElement specialOfferLocator;
    @FindBy(id = "first_name")
    WebElement firstNameLocator;
    @FindBy(id = "last_name")
    WebElement lastNameLocator;
    @FindBy(id = "company")
    WebElement companyLocator;
    @FindBy(id = "address1")
    WebElement addressLocator;
    @FindBy(id = "country")
    WebElement countryLocator;
    @FindBy(id = "state")
    WebElement stateLocator;
    @FindBy(id = "city")
    WebElement cityLocator;
    @FindBy(id = "zipcode")
    WebElement zipcodeLocator;
    @FindBy(id = "mobile_number")
    WebElement mobileNumberLocator;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    WebElement createAccountLocator;
    @FindBy(xpath = "//h2[@data-qa='account-created']")
    WebElement successMessage;
    @FindBy(css = "a[data-qa='continue-button']")
    WebElement continueLocator;


    public AutoExerAcctInformationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public boolean acctInfoPageIsVisible(){
        return acctInfoPageVisible.isDisplayed();
    }
    public void clickOnTitleRadioBtn() {
        titleLocator.click();
    }
    public void setPassword(String pwd){
        passwordLocator.sendKeys(pwd);
    }
    public void setDay(String days){
        Select day= new Select(dayLocator);
        day.selectByVisibleText(days);
    }
    public void setMonth(String months){
        Select month = new Select(monthLocator);
        month.selectByVisibleText(months);
    }
    public void setYear(String years){
        Select year = new Select(yearLocator);
        year.selectByVisibleText(years);
    }
    public void clickOnNewsLetterBnt(){
        newslettersLocator.click();
    }
    public void clickOnSpecialOffer(){
        specialOfferLocator.click();
    }
    public void setFirstName(String fName){
        firstNameLocator.sendKeys(fName);
    }
    public void setLastName(String lName){
        lastNameLocator.sendKeys(lName);
    }
    public void setCompany(String comp){
        companyLocator.sendKeys(comp);
    }
    public void setAddress(String add){
        addressLocator.sendKeys(add);
    }
    public void setCounty(String coun){
        Select country = new Select(countryLocator);
        country.selectByVisibleText(coun);
    }
    public void setState(String sta){
        stateLocator.sendKeys(sta);
    }
    public void setCity(String cty){
        cityLocator.sendKeys(cty);
    }
    public void setZipCode(String zCode){
        zipcodeLocator.sendKeys(zCode);
    }
    public void setMobileNumber(String mNum){
        mobileNumberLocator.sendKeys(mNum);
    }
    public void clickCreateAcctBnt(){
        createAccountLocator.click();
    }
    public boolean accountCreatedIsDisplay(){
        return successMessage.isDisplayed();
    }
    public void clickOnContinueBtn(){
        continueLocator.click();

    }
}
