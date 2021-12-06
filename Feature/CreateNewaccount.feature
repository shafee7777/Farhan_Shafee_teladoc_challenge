
Feature: Add a new user to the table
@addUser
Scenario Outline: able to add new user

Given user on home page
When user click on add user
And user enter firstname as "<firstname>" 
And user enter lastname as "<lastname>"
And user enter username as "<username>"
And user re enter password as "<password>"
And customer check radio button button
And user choose option from role dropdown
And user enter email as "<email>"
And user enter cell phone
And user click save button
Then new user added successfully to the table

Examples:
|firstname|lastname|username|password|email|
|Farhan|Shafee|Fshafee|pass1234|farhansf2@gmail.com|

@DeleteUser
Scenario: able to delete existing user

Given user on home page
When click on remove user
Then user removed successfully
