Feature: Place the order for products

@PlaceOrder
Scenario Outline: Place the order and checkout 

Given User is on GreenKart landing page
When User searched with shortname <Name> and extracted the actual name of product
And Added "3" items of the selected product to cart
Then User proceed to Checkout
And Verify user has ability to enter promo code  and place the order
Examples:
| Name |
| Tom  |


