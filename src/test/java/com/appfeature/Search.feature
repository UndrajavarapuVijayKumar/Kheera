Feature: Amazon Search 
	
Scenario: Search a product
	Given I have a search field on Amazon page
	When I search for a product with name "Apple 16" and price 120000
	Then Product with name "Apple 16" should be displayed

Scenario: Search a product
	Given I have a search field on Amazon page
	When I search for a product with name "Samsung Z fold" and price 120000
	Then Product with name "Samsung Z fold" should be displayed
