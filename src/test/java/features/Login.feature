Feature: Login functionality

Scenario: Login with positive set of data

#Given Launch the browser
Given Load the url
Given Enter the username as demosalesmanager
And Enter the password
When Click on the login button
Then Verify the login is successful


Scenario Outline: Login with positive set of data

#Given Launch the browser
Given Load the url
Given Enter the username as <username>
And Enter the password
When Click on the login button
Then Verify the login is successful

Examples:
|username|
|demosalesmanager|
|demoCSR|
