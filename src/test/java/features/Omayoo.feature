Feature: Login Functionality Test

Scenario Outline: User should be able to login with credentials
Given I visited the omayo website
When I enter username as <> and password as <>
And I click on login button
Then I should see be able to login to Omayo Portal with <> login status
Examples:
|arun|1234|failure|
|SeleniumByArun|Test143$|success|



