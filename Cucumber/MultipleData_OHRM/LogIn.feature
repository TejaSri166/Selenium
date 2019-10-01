

Feature: OrangeHRM application logIn Functionality Testing
Scenario Outline: Validating logIn functionality
Given Open firefox browser and navigate to OrangeHrm application
When User enters valid "<UserName>" and "<Password>" and  click on SignIn button
Then User should be able to successfully login to OrangeHrm application and close the application
Examples:
			|UserName|   |Password|
			|Admin|      |admin123|
 			|Admin|      |admin   |