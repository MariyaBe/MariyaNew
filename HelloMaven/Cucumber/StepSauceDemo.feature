

Feature: Saucedemo

 @saucedemo
 
 
 Scenario: Find high end product
  Given User is Launching the browser
    And User Navigate to Saucedemo website 
  When User enters username as "standard_user" and password as "secret_sauce"    
 
  Scenario Outline: Sign in to Saucedemo
    Given User is Launching the browser
    And User Navigate to Saucedemo website 
    When User enters username as "<username>" and password as "<password>" 
    Then user verify the <status> in step

    Examples: 
      |  username   | password   |status  |
      |standard_user| secret_sauce  | success |
      |locked_out_user|secret_sauce | Fail    |
      
      
#	Scenario: Search for BackPack 
#		Given User logged into Saucedemo
#	  When User click on Sauce Labs Backpack
#		Then User verify the product detail is visible
#		
#	Scenario: Add to cart
#		Given User finds Sauce Labs Backpack 
#		When User clicks ob Add to cart button
#		Then User Clicks on cart icon to verify the product was added.
#		
   #
      #
        #
    