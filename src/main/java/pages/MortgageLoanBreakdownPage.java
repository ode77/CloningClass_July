package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MortgageLoanBreakdownPage {
    WebDriver driver;
        @FindBy(id = "homeval")
        private WebElement homeValue;

        @FindBy(id = "downpayment")
        WebElement downPayment;

        @FindBy(id = "intrstsrate")
        WebElement intrestRate;

        @FindBy(id = "loanterm")
        WebElement loanTerm;

        @FindBy(xpath = "//select[@name='param[start_month]']")
        WebElement startMonth;

        @FindBy(id = "start_year")
        WebElement startYear;

        @FindBy(xpath = "//*[@value='Calculate']")
        WebElement clickOnCalculator;

        @FindBy(id = "pptytax")
        WebElement propertyTax;

        @FindBy(id = "pmi")
        WebElement pMi;

        @FindBy(id = "hoi")
        WebElement homeIsurance;

        @FindBy(id = "hoa")
        WebElement monthlyHoa;

        @FindBy(xpath = "//*[@name='param[milserve]']")
        WebElement loanType;

        public MortgageLoanBreakdownPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
    }
    public void setHomeValue(String value) {
        homeValue.clear();
        homeValue.sendKeys(value);
    }

    // Method to set the down payment
    public void setDownPayment(String value) {
        downPayment.clear();
        downPayment.sendKeys(value);
    }

    // Method to set the interest rate
    public void setInterestRate(String value) {
        intrestRate.clear();
        intrestRate.sendKeys(value);
    }

    // Method to set the loan term
    public void setLoanTerm(String value) {
        loanTerm.clear();
        loanTerm.sendKeys(value);
    }

    // Method to select the start month
    public void selectStartMonth(String month) {
        Select months = new Select(startMonth);
        months.selectByVisibleText(month);
    }

    // Method to set the start year
    public void setStartYear(String year) {
        startYear.clear();
        startYear.sendKeys(year);
    }

    // Method to set the property tax
    public void setPropertyTax(String value) {
        propertyTax.clear();
        propertyTax.sendKeys(value);
    }

    // Method to set PMI
    public void setPMI(String value) {
        pMi.clear();
        pMi.sendKeys(value);
    }

    // Method to set home insurance
    public void setHomeInsurance(String value) {
        homeIsurance.clear();
        homeIsurance.sendKeys(value);
    }

    // Method to set monthly HOA
    public void setMonthlyHOA(String value) {
        monthlyHoa.clear();
        monthlyHoa.sendKeys(value);
    }

    // Method to select the loan type
    public void selectLoanType(String loanTypeOption) {
        Select loanTypes = new Select(loanType);
        loanTypes.selectByVisibleText(loanTypeOption);
    }

    // Method to click the calculate button
    public void clickCalculate() {
        clickOnCalculator.click();
    }

}
