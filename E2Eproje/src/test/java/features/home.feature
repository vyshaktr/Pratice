Feature: Login into site

Scenario Outline: Postivie test
Given initialize browser
And navigate to "https://www.myntra.com" site
And click on login link in home
When user enters <username> and <password>
Then verify thast user is successfully loggedin
And close browser

Examples:
|username                    |password    |
|vyshatre@gmail.com          |password    |
|vyshae@gmail.com            |password    |