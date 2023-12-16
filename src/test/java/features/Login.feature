Feature: Login functionality

Scenario: Login with positive set of data

Given Launch the browser
Given Load the url
Given Enter the username
And Enter the password
When Click on the login button
Then Verify the login is successful