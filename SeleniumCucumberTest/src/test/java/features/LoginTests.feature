Feature: Login Tests

  Scenario: Validate the user is able to view after logging in
    Given User navigates to the Login page
    When User successfully enters the log in details
    Then User should be able to view the product category page

