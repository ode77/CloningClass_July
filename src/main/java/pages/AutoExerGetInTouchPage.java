package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class AutoExerGetInTouchPage {
    WebDriver driver;
    @FindBy(xpath = "//h2[contains(text(),'Get In Touch')]")
    WebElement getInTouchPageDisplayed;
    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement contactUsLocator;
    @FindBy(xpath = "//input[@data-qa='name']")
    WebElement enterNameLocator;
    @FindBy(xpath = "//input[@data-qa='email']")
    WebElement enterEmailAddressLocator;
    @FindBy(xpath = "//input[@data-qa='subject']")
    WebElement enterSubjectLocator;
    @FindBy(id = "message")
    WebElement enterMessageLocator;
    @FindBy(xpath = "//input[@data-qa='submit-button']")
    WebElement clickOnSubmitLocator;
    @FindBy(xpath = "//input[@data-qa='submit-button']")
    WebElement targetLocator;
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement getSuccessDetailPageIsDisplayed;

    @FindBy(xpath = "//a[@class='btn btn-success']")
    WebElement clickOnHomeLocator;

    @FindBy(xpath = "//*[@name='upload_file']")
    WebElement chooseFileLocator;



    public AutoExerGetInTouchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean GetInTouchPageIsDisplayed() {
        return getInTouchPageDisplayed.isDisplayed();

    }
    public void clickOnContactUsBtn(){
        contactUsLocator.click();
    }

    public void EnterName(String nme) {
        enterNameLocator.sendKeys(nme);
    }

    public void EnterEmailaddress(String eMail) {
        enterEmailAddressLocator.sendKeys(eMail);
    }

    public void EnterSubject(String suB) {
        enterSubjectLocator.sendKeys(suB);
    }

    public void EnterMessages(String Msg) {
        enterMessageLocator.sendKeys(Msg);

    }

    public void enterUploadFile() throws AWTException {
        chooseFileLocator.sendKeys("C:\\Users\\samod\\Downloads\\OLUWASHEYI_CV.pdf");




                     // ROBOT METHOD

//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", chooseFileLocator);
//
//        StringSelection fPath = new StringSelection(filePath);
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fPath, null);
//
//        Robot rb = new Robot();
//        rb.delay(2000);
//
//        rb.keyPress(KeyEvent.VK_CONTROL); // PRESS ON CTRL KEY ON KEYBOARD
//        rb.delay(2000);
//        rb.keyPress(KeyEvent.VK_V); // PRESS ON CTRL V KEY ON KEYBORD
//        rb.delay(2000);
//
//        rb.keyRelease(KeyEvent.VK_CONTROL);
//        rb.keyRelease(KeyEvent.VK_V);
//        rb.delay(2000);
//
//        rb.keyPress(KeyEvent.VK_ENTER);
//        rb.keyRelease(KeyEvent.VK_ENTER);
//        rb.delay(2000);

    }
    public void ClickOnSubmitButton() {
        clickOnSubmitLocator.click();
    }
    public void scrollBarToTarget(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(targetLocator).perform();
    }

    public boolean IsSuccessDetailDisplayed() {
        return getSuccessDetailPageIsDisplayed.isDisplayed();
    }

    public void ClickOnHomeButton() {
        clickOnHomeLocator.click();
    }
}