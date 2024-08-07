Feature: Categories and Brands automation
@eighteenth
Scenario: view categories products
Given Verify that home page is visible successfully
When user verify that categories are visible on left side bar
And Click on Women category
And Click on any category link under Women category, for example: Dress
And Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
And On left side bar, click on any sub-category link of Men category
Then Verify that user is navigated to that category page

@ninteenth
Scenario: view and cart brand products
Given Verify that home page is visible successfully
When user click Products button
And verify that Brands are visible on left side bar
And click on any brand name
Then Verify that user is navigated to brand page and brand products are displayed
And On left side bar, click on any other brand link
And Verify that user is navigated to that brand page and can see products






