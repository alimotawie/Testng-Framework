Feature: User Registration
   I want to check that the user can register in our e-commerce website.
   
	Scenario Outline: User Registration
	Given the user in the home page
	When I click on register link
	And I entered user data
	Then The registration page displayed successfully