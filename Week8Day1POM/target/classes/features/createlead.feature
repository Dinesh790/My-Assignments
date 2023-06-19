Feature: Create Leadfunctionality of leaftaps Application

Scenario Outline:Create Lead for multiple data 
Given Enter the Username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should displayed
When click on crmsfa link
And click on leads link
And click on create lead link
Given Enter the company name as <Companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
And click on submit button
Then viewleadpage should be displayed as <companyname>

Examples:
|Companyname|firstname|lastname|
|Testleaf|Subraja|Subi|
|QEagle|Vidya|R|