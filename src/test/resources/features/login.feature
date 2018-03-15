@android @ios @regression @issue:IOSTRA-3532
Feature: A registered user can log on to BM app
  As a registered user
  I want to login to BM app using my username and password
  So that i can manage my meetings

  Background:
    Given User is on login page
    		
  Scenario: Existing user Verification
    When user logs in using valid credentials as below
        | username 							| password		|	phonenumber	|
    		| traqatest2@gmail.com  | welcometr1	|	9546532543	|    
    Then he should be given access to the app

  Scenario: Logging on with an incorrect password
    When user logs on with wrong password as below
    		| username 							| password		|	phonenumber	|
    		| traqatest2@gmail.com  | wrong	|	9546532543	|
    Then he should be informed that his password was incorrect

  #Scenario: Logging on with an expired account
    #Given the account has expired
    #When user logs in using valid credentials as below
    #Then he should be informed that his account has expired
    #And he should be invited to renew his account
