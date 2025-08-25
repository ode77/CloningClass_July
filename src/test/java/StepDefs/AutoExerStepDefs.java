package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AutoExerAcctInformationPage;
import pages.AutoExerHomePage;
import pages.AutoExerLoginPage;
import pages.AutoExerNewUserSignUpPage;
import utilities.PropertyReaders;

import java.io.IOException;

import static StepDefs.Hooks.driver;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class AutoExerStepDefs {
    AutoExerHomePage autoExerHomePage = new AutoExerHomePage(driver);
    AutoExerNewUserSignUpPage autoExerNewUserSignUpPage = new AutoExerNewUserSignUpPage(driver);
    AutoExerAcctInformationPage autoExerAcctInformationPage = new AutoExerAcctInformationPage(driver);
    AutoExerLoginPage autoExerLoginPage = new AutoExerLoginPage(driver);
    @Given("I am on autoexercise home page")
    public void i_am_on_autoexercise_home_page() throws IOException, InterruptedException {
        PropertyReaders pro = new PropertyReaders();
        driver.get(pro.getAutoExercise_Url());

        try {
            autoExerHomePage.clickOnCookies();
        } catch (Exception e) {
            System.out.println("No cookie prompt displayed.");
        }
        assertThat(autoExerHomePage.logoIsVisible(), is(equalTo(true)));

        if (autoExerHomePage.logoIsVisible()) {
            System.out.println("Logo is visible on the homepage");
        } else {
            System.out.println("Logo is NOT visible on the homepage");

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
    @Then("account created as username is visible")
    public void account_created_as_username_is_visible() {
        assertThat(autoExerHomePage.userNameIsVisible(),is(equalTo(true)));

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
}
