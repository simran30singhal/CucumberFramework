Feature: Seach and Place the order for Products

@SearchProduct
Scenario Outline: Search Experience for product in both home and offers page

Given User is on GreenKart landing page
When User searched with shortname <Name> and extracted the actual name of product
Then User searched for <Name> in offers page
And validate product name in offers page matches with Landing page

Examples:
| Name |
| Tom  |
| Beet |
