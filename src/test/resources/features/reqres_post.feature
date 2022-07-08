@Post
Feature: Information post individual user

  @Scenario1 @Regression @Smoke
  Scenario: send information for registration and obtain individual user with successful response
    Given I prepare the information to be recorded
      | name     | job    |
      | morpheus | leader |
    When I call post user API
    Then I should see the status code post 201

  @Scenario2 @Regression
Scenario: send information for registration and obtain individual user with successful response
 Given I prepare the information to be recorded
      | name     | job    |
      | morpheus | leader |
    When I call post user API
    Then I validate the data I post from the api response