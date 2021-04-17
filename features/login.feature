@Login
Feature: login scenario
@LoginPositiveScenario
Scenario: postive login scenario
Given user is in login page
When user enter "773107979" and "gjhjhk"
And user click on submit button
Then home page should be displayed

@LoginNegativeScenario
Scenario Outline: Negative login scenario
Given user is in login page
When user enter "<username>" and "<password>"
And user click on submit button
Then user is in samepage unsuccessfull login

Examples:
|username|password|
|wrong|saibaba|
|7731064412|assss|
||saibaba|
|7731064412||
|sahkk|243|


