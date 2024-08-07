Feature: Automating the Automation Exercise page
@first
Scenario: user registration and deletion
Given user is on the home page
When  user click on Signup / Login Button
And user verify New User Signup is visible
And user enter name and email address
And user click Signup Button
And user verify that ENTER ACCOUNT INFORMATION is visible
And user fill Title Name Email Password Date of birth
And user select checkbox Sign up for our newsletter
And user select checkbox Receive special offers from our partners
And user fill First name Last name Company Address Address2 Country State City Zipcode  Mobile Number
And user click Create Account button
Then user Verify that ACCOUNT CREATED is visible
And user click Continue Button
And user Verify that Logged in as username is visible
And user vlick Delete Account Button
And user verify that ACCOUNT DELETED is visible and click Continue Button

@second
Scenario: user login and account deletion
Given Verify that home page is visible successfully
When user click on Signup / Login button
And verify Login to your account is visible
And enter correct email address and password
And click login button
Then verify that Logged in as username is visible
And click Delete Account button
And verify that ACCOUNT DELETED! is visible

@thired
Scenario: user login with wrong credentials
Given Verify that home page is visible successfully
When user click on Signup / Login button
And verify Login to your account is visible
And enter wrong email address and password
And click login button
Then verify that error message is shown

@fourth
Scenario: user logout check
Given Verify that home page is visible successfully
When user click on Signup / Login button
And verify Login to your account is visible
And enter correct email address and password
And click login button
Then verify that Logged in as username is visible
And user click Logout button
And verify Login to your account is visible

@fifth
Scenario: user register with already existing email
Given user is on the home page
When  user click on Signup / Login Button
And user verify New User Signup is visible
And user enter name and existing email address
And user click Signup Button
Then user is able to see error message 




