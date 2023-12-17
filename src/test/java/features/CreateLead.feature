Feature: Create lead functionality
#Background:
#Given Launch the browser

Scenario: Create lead with positive set of data


Given Load the url
Given Enter the username as 'democsr'
And Enter the password
When Click on the login button
Then Verify the login is successful
When Click on the crmsfa link
And Click on the leads tab
And Click on the create lead

Scenario: Login with positive set of data

#Given Launch the browser
Given Load the url
Given Enter the username as 'democsr2'
And Enter the password
When Click on the login button
Then Verify the login is successful