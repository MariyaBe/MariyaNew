
@tag
Feature: Shopping in Amazon

  
  Scenario: Log in to Amazon
    Given User is Launching the browser
    And User Navigates to Amazon website
    When User clicks on username textbox
    And User enters valid username
    And User Clicks on password textbox
    And User enters valid password
    And User Clicks on signin button
    Then User should be able to verify the name of user in Account&List dropdown
  
  Scenario Outline: Search for items
    Given User Logged in to Amazon
    When User Clicks on search button
    And User search multiple <items> 
    Then User verify that all the items were avaiable for shopping

    Examples: 
      | items | 
      | Shoes |  
		  | Tshirt|
		  | Shirt |
		  
		  
	Scenario: Add to cart button
		Given User log in to Amazon
		And User Searched for Items
		When User clicks on search textbox
		And User type Tshirt then click on search button
		And User clicks on the first Tshirt
		Then User is able to verify the first Tshirt was showing with more details
		And User is able to verify add to cart button was showing
		  
		  
		  
		  