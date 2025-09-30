package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import utilities.PropertyReaders;

import java.awt.*;
import java.io.IOException;

import static StepDefs.Hook.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AutoExerStepDefs {
    AutoExerHomePage autoExerHomePage = new AutoExerHomePage(driver);
    AutoExerNewUserSignUpPage autoExerNewUserSignUpPage = new AutoExerNewUserSignUpPage(driver);
    AutoExerAcctInformationPage autoExerAcctInformationPage = new AutoExerAcctInformationPage(driver);
    AutoExerLoginPage autoExerLoginPage = new AutoExerLoginPage(driver);
    AutoExerGetInTouchPage autoExerGetInTouchPage =new AutoExerGetInTouchPage(driver);
    @Given("I am on autoexercise home page")
    public void i_am_on_autoexercise_home_page() throws IOException, InterruptedException {
        PropertyReaders pro = new PropertyReaders();
        driver.get(pro.getAutoExercise_Url());

        try {
            autoExerHomePage.clickOnCookies();
        } catch (Exception e) {
            System.out.println("No cookie prompt displayed.");
        }

        if (autoExerHomePage.logoIsVisible()) {
            System.out.println("Logo is visible on the homepage");
        } else {
            System.out.println("Logo is NOT visible on the homepage");

            assertThat(autoExerHomePage.logoIsVisible(), is(equalTo(true)));
        }
    }
    @Then("I Verify that home page is visible")
    public void i_verify_that_home_page_is_visible() {
        assertThat(autoExerHomePage.homePageIsVisible(),is(equalTo(true)));

    }
    @Then("Click on {string} button")
    public void click_on_button(String string) {
        autoExerHomePage.clickOnSignUpBtn();

    }
    @Then("I Verify {string} is visible")
    public void i_verify_is_visible(String string) {
        assertThat(autoExerNewUserSignUpPage.signUpPageIsVisible(),is(equalTo(true)));

    }
    @Then("I Enter {string} and {string}")
    public void i_enter_and(String nme, String eMl) {
        autoExerNewUserSignUpPage.setName(nme);
        autoExerNewUserSignUpPage.setEmail(eMl);
    }
    @Then("Click {string} button")
    public void click_button(String string) {
        autoExerNewUserSignUpPage.clickOnSignUpBtn();

    }
    @Then("I Verify that {string} is visible")
    public void i_verify_that_is_visible(String string) {
        assertThat(autoExerAcctInformationPage.acctInfoPageIsVisible(),is(equalTo(true)));

    }
    @When("Fill details: Title, {string} and I Select {string}, {string} and {string} as follows")
    public void fill_details_title_and_i_select_and_as_follows(String pWd, String day, String month, String yesr) {

        autoExerAcctInformationPage.clickOnTitleRadioBtn();
        autoExerAcctInformationPage.setPassword(pWd);
        autoExerAcctInformationPage.setDay(day);
        autoExerAcctInformationPage.setMonth(month);
        autoExerAcctInformationPage.setYear(yesr);

    }
    @When("Select checkbox {string}")
    public void select_checkbox(String string) {
        autoExerAcctInformationPage.clickOnNewsLetterBnt();
        autoExerAcctInformationPage.clickOnSpecialOffer();

    }
    @When("Fill details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fill_details(String fName, String lNmae, String com, String addr, String count, String state, String city, String zipCd, String mNumbe) {
        autoExerAcctInformationPage.setFirstName(fName);
        autoExerAcctInformationPage.setLastName(lNmae);
        autoExerAcctInformationPage.setCompany(com);
        autoExerAcctInformationPage.setAddress(addr);
        autoExerAcctInformationPage.setCounty(count);
        autoExerAcctInformationPage.setState(state);
        autoExerAcctInformationPage.setCity(city);
        autoExerAcctInformationPage.setZipCode(zipCd);
        autoExerAcctInformationPage.setMobileNumber(mNumbe);

    }
    @When("Click {string}")
    public void click(String string) {
        autoExerAcctInformationPage.clickCreateAcctBnt();

    }
    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        assertThat(autoExerAcctInformationPage.accountCreatedIsDisplay(),is(equalTo(true)));


    }
    @Then("Click Continue button")
    public void click_continue_button() {
        autoExerAcctInformationPage.clickOnContinueBtn();

    }
    @Then("Verify that Logged as {string} is visible")
    public void verifyThatLoggedasIsVisible(String uName) {
        assertThat(autoExerHomePage.loggedInAsUserIsVisible().contains(uName),is(equalTo(true)));

    }

    @And("I Click LogOut button")
    public void iClickLogOutButton() {
        autoExerHomePage.clickOnLogoutBtn();
    }

    @And("I Enter correct {string} and {string}")
    public void iEnterCorrectAnd(String eml, String pWrd) {
        autoExerLoginPage.setEmail(eml);
        autoExerLoginPage.setPassWord(pWrd);
    }
    @And("I Click login button")
    public void iClickLoginButton() {
        autoExerLoginPage.clickOnLoginBtn();
    }

    @When("Enter incorrect {string} and {string}")
    public void enterIncorrectAnd(String invEmail, String invPswd) {
        autoExerLoginPage.setEmail(invEmail);
        autoExerLoginPage.setPassWord(invPswd);
    }
    @Then("Verify error respond {string} is visible")
    public void verifyErrorRespondIsVisible(String errorMsge) {
        assertThat(autoExerLoginPage.getErrorMessage().contains(errorMsge),is(equalTo(true)));
    }

    @And("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        assertThat(autoExerGetInTouchPage.GetInTouchPageIsDisplayed(),is(equalTo(true)));
    }
    @And("Click on Contact Us button")
    public void clickOnContactUsButton() {
        autoExerGetInTouchPage.clickOnContactUsBtn();
    }
    @Then("Enter {string}, {string}, {string} and {string}")
    public void enter_and(String nMe, String eMl, String suB, String mSg) {
        autoExerGetInTouchPage.EnterName(nMe);
        autoExerGetInTouchPage.EnterEmailaddress(eMl);
        autoExerGetInTouchPage.EnterSubject(suB);
        autoExerGetInTouchPage.EnterMessages(mSg);

    }
    @And("I Scroll Down to the target element")
    public void iScrollDownToTheTargetElement() {
        autoExerGetInTouchPage.scrollBarToTarget();
    }
//    @When("I click choose {string} to upload")
//    public void iClickChooseToUpload(String filePth) throws AWTException {
//        autoExerGetInTouchPage.enterUploadFile(filePth);
//    }
    @Then("I click on choose file to upload document")
    public void i_click_on_choose_file_to_upload_document() throws AWTException {
        autoExerGetInTouchPage.enterUploadFile();
    }
    @And("Click Submit button")
    public void click_submit_button() {
        autoExerGetInTouchPage.ClickOnSubmitButton();
    }

    @And("Click OK to accept the Alert button")
        public void clickOKToAcceptTheAlertButton() {
        driver.switchTo().alert().accept();

    }
    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
        assertThat(autoExerGetInTouchPage.IsSuccessDetailDisplayed(),is(equalTo(true)));

    }
    @Then("Click Home button")
    public void click_home_button() {
        autoExerGetInTouchPage.ClickOnHomeButton();

    }


}
