Feature: As user I should be able to Verify Simple form Demo



Scenario: Verify Single Input Filed
    Given User Navigate to SeleniumEasy Test Home Page
	When User Click on Input Forms hyperlink tab
	Then User Click on  Simple form Demo Hyperlink Test
	Then User Enter a message in the Enter message text box
	And User Click on Show Message Button
	Then User Validate the Message is been displayed in the Your Message section