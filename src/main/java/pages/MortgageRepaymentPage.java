package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MortgageRepaymentPage {
    WebDriver driver;

    @FindBy(xpath = "(//div[@class='repayment-block']/div/div/h3)[1]")
    WebElement totalMonthlyPayment;

    @FindBy(xpath = "(//div[@class='repayment-block']/div/div/h3)[3]")
    WebElement downPaymentAmount;

    @FindBy(xpath = "(//div[@class='repayment-block']/div/div/h3)[4]")
    WebElement downPaymentPercentage;

    @FindBy(xpath = "(//div[@class='repayment-block']/div/div/h3)[5]")
    WebElement loanPayoffDate;

    @FindBy(xpath = "(//div[@class='repayment-block']/div/div/h3)[6]")
    WebElement totalIntrestPaid;

    @FindBy(xpath = "(//div[@class='repayment-block']/div/div/h3)[7]")
    WebElement monthlyTaxPaid;

    @FindBy(xpath = "(//div[@class='repayment-block']/div/div/h3)[8]")
    WebElement totalTaxPaid;

    @FindBy(xpath = "(//div[@class='repayment-block']/div/div/h3)[9]")
    WebElement monthlyHomeInsurance;

    @FindBy(xpath = "(//div[@class='repayment-block']/div/div/h3)[10]")
    WebElement totalHomeIsurance;

    @FindBy(xpath = "(//div[@class='repayment-block']/div/div/h3)[11]")
    WebElement annualPaymentAmount;
    @FindBy(xpath = "(//div[@class='repayment-block']/div/div/h3)[12]")
    WebElement totalOf360;

    public MortgageRepaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getTotalMonthlyPayment(){
        return totalMonthlyPayment.getText();
    }
    public String getDownPaymentAmount() {
        return downPaymentAmount.getText();
    }
    public String getDownPaymentPercentage() {
        return downPaymentPercentage.getText();
    }
    public String getLoanPayoffDate() {
        return loanPayoffDate.getText();
    }
    public String getTotalIntrestPaid() {
        return totalIntrestPaid.getText();
    }
    public String getMonthlyTaxPaid() {
        return monthlyTaxPaid.getText();
    }
    public String getTotalTaxPaid() {
        return totalTaxPaid.getText();
    }
    public String getMonthlyHomeInsurance() {
        return monthlyHomeInsurance.getText();
    }
    public String getTotalHomeInsurance() {
        return totalHomeIsurance.getText();
    }
    public String getAnnualPaymentAmount() {
        return annualPaymentAmount.getText();
    }
    public String getTotalOf360Pmt() {
        return totalOf360.getText();
    }

}