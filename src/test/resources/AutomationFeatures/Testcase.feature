Feature: Automating Automation Exercise page
@seventh
Scenario: user check the test case option
Given Verify that home page is visible successfully
When user clicks the Test case button
Then verify user is navigated to test cases page successfully

@eighth
Scenario: user verify all product and product details page
Given Verify that home page is visible successfully
When user clicks product option
And verify all product page
And verify list of products
And click first product 
Then verify the product name category price availability brand and conditiona

@nineth
Scenario: search product
Given Verify that home page is visible successfully
When user clicks product option
And verify all product page
And enter product name in search input and click search button
Then verify SEARCHED PRODUCTS is visible
And verify all the products related to search are visible

