Feature: Login Page 
Scenario: verify get connectivity of Login Page 
	Given a valid Login URL 
	When a user calls the Login URL using get method 
	Then verify status code 200

