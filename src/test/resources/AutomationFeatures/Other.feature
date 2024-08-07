Feature: Automating the extra features
@twentyfirst
Scenario: user add review on products
Given  Verify that home page is visible successfully
When user click Products button
And user click View Product for any product on home page
And verify product detail is opened
And verify Write Your Review is visible
And enter name, email and review
And click Submit button
Then verify success message Thank you for your review

@twentysecond
Scenario: user check recommended items in cart
Given  Verify that home page is visible successfully
When  user scroll to bottom of page
And verify RECOMMENDED ITEMS are visible
And click on Add To Cart on Recommended product
And click on View Cart button
Then Verify that product is displayed in cart page

@twentythired
Scenario: user verifies adress details in checkout page
Given  Verify that home page is visible successfully
When user click on Signup / Login button
And Fill all details in Signup and create account
And verify ACCOUNT CREATED and click Continue button
And verify Logged in as username at top
And add products to cart
And click Cart button
And verify that cart page is displayed
And click Proceed To Checkout
Then verify that the delivery address is same address filled at the time registration of account
And verify that the billing address is same address filled at the time registration of account
And click Delete Account button
And Verify ACCOUNT DELETED! and click Continue button

@twentyfourth
Scenario: user download invoice after purchase order
Given Verify that home page is visible successfully
When add products to cart
And click Cart button
And verify that cart page is displayed
And click Proceed To Checkout
And click Register / Login button
And Fill all details in Signup and create account
And verify ACCOUNT CREATED and click Continue button
And verify Logged in as username at top
And click Cart button
And click Proceed To Checkout button
And Address Details and Review Your Order
And description in comment text area and click Place Order
And payment details: Name on Card Card Number CVC Expiration date
Then Pay and Confirm Order button
And success message Your order has been placed successfully!
And click Download Invoice button and verify invoice is downloaded successfully.
And click Continue button
And click Delete Account button
And Verify ACCOUNT DELETED! and click Continue button

@twentyfifth
Scenario: user verify scroll up using arrow button and scroll down functionality
Given Verify that home page is visible successfully
When user Scroll down page to bottom
And verify SUBSCRIPTION is visible
And click on arrow at bottom right side to move upward
Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen

@twentysixth
Scenario: user verify scroll up without using arrow button and scroll down functionality
Given Verify that home page is visible successfully
When user Scroll down page to bottom
And verify SUBSCRIPTION is visible
And Scroll up page to top
Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen





