Feature: Automating automation Exercise
@sixth
Scenario: user check contact us form
Given Verify that home page is visible successfully
When user click on Contact Us button
And user verify GET IN TOUCH is visible
And user enter name, email, subject and message
And user upload file
And user click Submit button
Then user click OK button
And user verify success message Success! Your details have been submitted successfully. is visible
And user click Home button and verify that landed to home page successfully
