Feature: Sign-In



Scenario: Successful Sign-In with Valid Credentials
Given user launch Chrome browser & user opens URL "https://www.amazon.com" 
Then double click on Signin
Then user enters Email on Sign-In box and click on continue
Then user enters Password on password box and click Sign-In button
Then user should successfully Signin 
Then browser close and quit

