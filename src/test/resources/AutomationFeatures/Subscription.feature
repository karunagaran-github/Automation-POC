Feature: Automating the automation exercise page
@tenth
Scenario: verify subscription in Home page
Given Verify that home page is visible successfully
When Scroll down to footer
And Verify text SUBSCRIPTION
And Enter email address in input and click arrow button
Then Verify success message You have been successfully subscribed! is visible