Feature: Automating cart test cases
@twelth
Scenario: add products in cart
Given Verify that home page is visible successfully
When user click Products button
And Hover over first product and click Add to cart
And click Continue Shopping button
And hover over second product and click Add to cart
And click View Cart button
Then verify both products are added to Cart
And verify their prices quantity and total price

@thirteenth
Scenario: verify product quantity in cart
Given  Verify that home page is visible successfully
When user click Products button
And user click View Product for any product on home page
And verify product detail is opened
And increase quantity to 4
And click Add to cart button
And click View Cart button
Then verify that product is displayed in cart page with exact quantity

@fourteenth
Scenario: verify product quantity in cart
Given  Verify that home page is visible successfully
When user click Products button
And Hover over first product and click Add to cart
And click Continue Shopping button
And hover over second product and click Add to cart
And click View Cart button
And verify both products are added to Cart
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
And click Delete Account button
And Verify ACCOUNT DELETED! and click Continue button

@fifteenth
Scenario: user register before checkout
Given  Verify that home page is visible successfully
When user click on Signup / Login button
And Fill all details in Signup and create account
And verify ACCOUNT CREATED and click Continue button
And user click Products button
And hover over second product and click Add to cart
And click View Cart button
And verify both products are added to Cart
And click Proceed To Checkout
And Address Details and Review Your Order
And description in comment text area and click Place Order
And payment details: Name on Card Card Number CVC Expiration date
Then Pay and Confirm Order button
And success message Your order has been placed successfully!
And click Delete Account button
And Verify ACCOUNT DELETED! and click Continue button

@sixteenth
Scenario: user login before checkout
Given Verify that home page is visible successfully
When user click on Signup / Login button
And verify Login to your account is visible
And enter correct email address and password
And click login button
And verify that Logged in as username is visible
And user click Products button
And hover over second product and click Add to cart
And click View Cart button
And verify both products are added to Cart
And click Proceed To Checkout
And Address Details and Review Your Order
And description in comment text area and click Place Order
And payment details: Name on Card Card Number CVC Expiration date
Then Pay and Confirm Order button
And success message Your order has been placed successfully!
And click Delete Account button
And Verify ACCOUNT DELETED! and click Continue button

@seventeenth
Scenario: remove products from cart
Given Verify that home page is visible successfully
When user click Products button
And hover over second product and click Add to cart
And click View Cart button
And verify both products are added to Cart
And Click X button corresponding to particular product
Then Verify that product is removed from the cart

@twentieth
Scenario: scearch products and verify cart after login
Given Verify that home page is visible successfully
When user click Products button
And verify all product page
And enter product name in search input and click search button
And verify SEARCHED PRODUCTS is visible
And verify all the products related to search are visible
And add searched product to cart
And click Cart button and verify that products are visible in cart
And click Signup / Login button and submit login details
Then go to Cart page
And verify that those products are visible in cart after login as well







