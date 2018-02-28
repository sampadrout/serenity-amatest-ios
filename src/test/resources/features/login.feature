Feature: Login for an existing user
	As an user
	I want to login to BM app
	So that i can manage my meetings

@android @ios @regression

	@issue:IOSTRA-3532
	Scenario: FTUX - Existing User login
		Given User is on login page
		When Enter valid credentials
		#Then User is shown calendar page
		#Then Select Local Calendar
		#Then Accept calendar Alert
		#Then Select EWS Calendar
		#Then Tap Done
		#Then Display EWS page to enter details
		#Then Enter Exchange Account details