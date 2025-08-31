package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MortgageLoanBreakdownPage;
import pages.MortgageRepaymentPage;
import utilities.PropertyReaders;

import java.io.IOException;
import java.util.List;

import static StepDefinition.Hook.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;



public class MortgageCalStepDefs {
    MortgageLoanBreakdownPage mortgageLoanBreakdownPage = new MortgageLoanBreakdownPage(driver);
    MortgageRepaymentPage mortgageRepaymentPage = new MortgageRepaymentPage(driver);
    @Given("I am on the Mortgage calculator website")
    public void i_am_on_the_mortgage_calculator_website() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        PropertyReaders proReader = new PropertyReaders();
        driver.get(proReader.getMortgageCal_Url());



    }
    @When("I enter the following")
    public void i_enter_the_following(List<List<String>> dataTable) {
        // Write code here that turns the phrase above into concrete actions
       mortgageLoanBreakdownPage.setHomeValue(dataTable.get(1).get(1));
       mortgageLoanBreakdownPage.setDownpayment(dataTable.get(2).get(1));
       mortgageLoanBreakdownPage.setIntrestRate(dataTable.get(3).get(1));
       mortgageLoanBreakdownPage.setLoanTerm(dataTable.get(4).get(1));
       mortgageLoanBreakdownPage.setStartMonth(dataTable.get(5).get(1));
       mortgageLoanBreakdownPage.setStartYear(dataTable.get(6).get(1));



    }
    @When("accept default value for all the remaining values")
    public void accept_default_value_for_all_the_remaining_values() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("I click on calculate link")
    public void i_click_on_calculate_link() {
        // Write code here that turns the phrase above into concrete actions
        mortgageLoanBreakdownPage.clickOnCalculatorBtn();
    }
    @Then("I should get mortgage offer with {string}, {string}, {string}, {string}, {string} and {string}")
    public void i_should_get_mortgage_offer_with_and(String toMonPmt, String dPmt, String dPmtPer, String lPayoff, String tIntPd, String mTaxpd) {
        // Write code here that turns the phrase above into concrete actions
        assertThat(mortgageRepaymentPage.getTotalMonthlyPayment(),is(equalTo(toMonPmt)));
        System.out.println(toMonPmt);
        assertThat(mortgageRepaymentPage.getDownPaymentAmount(),is(equalTo(dPmt)));
        System.out.println(dPmt);
        assertThat(mortgageRepaymentPage.getDownPaymentPercentage(),is(equalTo(dPmtPer)));
        System.out.println(dPmtPer);
        assertThat(mortgageRepaymentPage.getLoanPayoffDate(),is(equalTo(lPayoff)));
        System.out.println(lPayoff);
        assertThat(mortgageRepaymentPage.getTotalIntrestPaid(),is(equalTo(tIntPd)));
        System.out.println(tIntPd);
        assertThat(mortgageRepaymentPage.getMonthlyTaxPaid(),is(equalTo(mTaxpd)));
        System.out.println(mTaxpd);



    }
//    @When("I enter the following data")
//    public void i_enter_the_following_data(List<String> dataTable) {
//        mortgageLoanBreakdownPage.setPropertyTax();
//        mortgageLoanBreakdownPage.setPMI();
//        mortgageLoanBreakdownPage.setHomeIsurance();
//        mortgageLoanBreakdownPage.setMonthlyHoa();
//        mortgageLoanBreakdownPage.setLoanType();


//        @When("I enter the following")
//        public void i_enter_the_following(List<List<String>> dataTable) {
//        mortgageLoanBreakdownPage.(dataEntries);
//            String[] dataEntries = {
//                    dataTable.get(1).get(1),
//                    dataTable.get(2).get(1),
//                    dataTable.get(3).get(1),
//                    dataTable.get(4).get(1),
//                    dataTable.get(5).get(1),
//                    dataTable.get(6).get(1)





        // Write code here that turns the phrase above into concrete actions
    @When("I enter the following data")
    public void i_enter_the_following_data(List<List<String>> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        mortgageLoanBreakdownPage.setPropertyTax(dataTable.get(1).get(1));
        mortgageLoanBreakdownPage.setPMI(dataTable.get(2).get(1));
        mortgageLoanBreakdownPage.setHomeIsurance(dataTable.get(3).get(1));
        mortgageLoanBreakdownPage.setMonthlyHoa(dataTable.get(4).get(1));
        mortgageLoanBreakdownPage.setLoanType(dataTable.get(5).get(1));

    }
    @Then("I should get mortgage offer with {string}, {string}, {string}, {string} and {string}")
    public void i_should_get_mortgage_offer_with_and(String tTaxpd, String mHomIns, String tHomeIns, String aPayAmnt, String t360) {
        // Write code here that turns the phrase above into concrete actions
        assertThat(mortgageRepaymentPage.getTotalTaxPaid(),is(equalTo(tTaxpd)));
        assertThat(mortgageRepaymentPage.getMonthlyHomeInsurance(),is(equalTo(mHomIns)));
        assertThat(mortgageRepaymentPage.getTotalHomeInsurance(),is(equalTo(tHomeIns)));
        assertThat(mortgageRepaymentPage.getAnnualPaymentAmount(),is(equalTo(aPayAmnt)));
        assertThat(mortgageRepaymentPage.getTotalOf360Pmt(),is(equalTo(t360)));

    }

}
