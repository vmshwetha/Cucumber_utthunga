#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: 

#Scenario: 
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login
This feature is going to  test the login functionality
This feature having following scenarios.
valid credentials
Invalid credentials

Background:
Given  I Am able to access magento webpage
And I am registered the user on magento
  @tag1
  Scenario: valid Credentials
 
When I update the valid username
And I am update with password
Then I click on Signin button
Then I should get access to the dashboard

  @tag2
 Scenario Outline: Parameterized valid Credentials
When I update the username as "<username>"
And I update the password as "<password>"
And I click on the Singin button
Then I should get access to the dashboard
Examples:
|username|password|
|natarajan.ramanathan93@gmail.com|Welcome123|
|balajidinakaran1@gmail.com|Welcome@1|
|balajidinakara123@gmail.com|Weocome@1|
  
