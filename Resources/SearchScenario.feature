Feature: Amazon

Background: Open browser and Nevigate to Amazon
	Given I nevigate to "http://www.amazon.com/"

		Scenario: Search for product and verify Product Detail page
			Given I enter search key "Nikon" and press Enter
			And Choose Price: Hight to Low from sort dropdown   
			When I choose second option from sorted result 
			Then selected product should contains "Nikon AF-S"
			
		Scenario: Search for product and verify Product Detail page failed
			Given I enter search key "Nikon" and press Enter
			And Choose Price: Hight to Low from sort dropdown   
			When I choose second option from sorted result 
			Then selected product should contains "sfskdh"