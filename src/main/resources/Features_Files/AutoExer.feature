#@AutoExer
Feature:
  Background:
    Given I am on autoexercise home page
    Then I Verify that home page is visible
    And Click on 'Signup / Login' button
    Then I Verify 'New User Signup!' is visible


  Scenario Outline:  Test Case 1: Register User
#    Given I am on autoexercise home page
#    Then I Verify that home page is visible
#    And Click on 'Signup / Login' button
#    Then I Verify 'New User Signup!' is visible
    And  I Enter "<name>" and "<email address>"
    And  Click 'Signup' button
    Then I Verify that 'ENTER ACCOUNT INFORMATION' is visible
    When Fill details: Title, "<Password>" and I Select "<Days>", "<Months>" and "<Years>" as follows
    And Select checkbox 'Sign up for our newsletter!'
    And Select checkbox 'Receive special offers from our partners!'
    And Fill details: "<First name>", "<Last name>", "<Company>", "<Address>", "<Country>", "<State>", "<City>", "<Zipcode>", "<Mobile Number>"
    And Click 'Create Account button'
    Then Verify that 'ACCOUNT CREATED!' is visible
    And Click Continue button
    Then Verify that Logged as "<name>" is visible
    And I Click LogOut button

    Examples:
      | name | email address        | Password | Days | Months   | Years | First name | Last name | Company    | Address  | Country | State  | City       | Zipcode | Mobile Number |
      | solo | odexsolo77@gmail.com | Yahoo77  | 17   | February | 1990  | solomon    | odele     | eledavibes | 60 brega | Canada  | Dublin | Balbriggan | k32     | 0899736888    |
#      | Alice   | alicesofware@gmail.com | Alijexo   | 24   | September    | 1983  | Ali        | odele     | eledavibes | 60 brega | Canada  | Dublin | Balbriggan | k32     | 0899736888    |
#      | Yomi    | yomexboss@gmail.com    | Yorrybx   | 25   | January    | 1974  | Yorex      | odele     | eledavibes | 60 brega | Canada  | Dublin | Balbriggan | k32     | 0899736888    |
#      | Micheal | mixqa70@gmail.com      | Mickohjay | 19   | November    | 1960  | Mickplo    | odele     | eledavibes | 60 brega | Canada  | Dublin | Balbriggan | k32     | 0899736888    |

#  @AutoExer1
  Scenario Outline: Test Case 2: Login User with correct email and password
#    Given I am on autoexercise home page
#    Then I Verify that home page is visible
#    And Click on 'Signup / Login' button
#    Then I Verify 'Login to your account' is visible
    And I Enter correct "<email address>" and "<password>"
    And I Click login button
    Examples:
      | email address         | password |
      | odex7@gmail.com | Yahoo777 |



#  @AUTOEXE1
  Scenario Outline: Test Case 3: Login User with incorrect email and password
#    Given I am on autoexercise home page
#    Then I Verify that home page is visible
#    And Click on 'Signup / Login' button
#    Then I Verify 'Login to your account' is visible
    When Enter incorrect "<email address>" and "<password>"
    And I Click login button
    Then Verify error respond "<Message>" is visible
    Examples:
      | email address | password | Message |
      | odex90@gmail.com |Yah70 |Your email or password is incorrect! |


    @AutoExer
  Scenario Outline: TEST CASES 4: Verify Documents Uploaded Successful
#    Given I am on autoexercise home page
#    Then I Verify that home page is visible successfully
    And Click on Contact Us button
    And Verify GET IN TOUCH is visible
    And Enter "<name>", "<email>", "<subject>" and "<message>"
      And I Scroll Down to the target element
#    When I click choose "<File>" to upload
      And I click on choose file to upload document
    And Click Submit button
    And Click OK to accept the Alert button
    Then Verify success message 'Success! Your details have been submitted successfully.' is visible
    And Click Home button
    Then I Verify that home page is visible
    Examples:
      | name  | email                 | subject        | message                                                  | File                                                      |
      | solo  | odexsolo007@gmail.com | Order Issues   | Please unable to place my order with the payment gateway | C:\Users\samod\Downloads\OLUWASHEYI_CV.pdf                |
      | faith | moshood007@gmail.com  | Payment Issues | Please unable to place my order with the payment gateway | C:\Users\samod\Downloads\SHEYI_ODELEYE_UPDATED.CV_PEN.pdf |