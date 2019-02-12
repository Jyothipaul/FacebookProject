Feature: Facebook Login Page

  Scenario: Access Facebook page
    Given As a chrome user
    When I launch Facebook page
    Then I see the Facebook Home page

  Scenario: Enter email id
    Given As a chrome user
    When I launch Facebook page
    Then I enter email address

  Scenario: Select Date
    Given As a chrome user
    When I launch Facebook page
    Then I see the Facebook Home page
    And I select Day Option

  Scenario: Forgotten Account page and Back
    Given As a chrome user
    When I launch Facebook page
    Then I see the Facebook Home page
    And I click on Forgotten Account Link
    And click on back button

  Scenario: Key actions
    Given As a chrome user
    When I launch Facebook page
    Then I see the Facebook Home page
    And I perform key actions

  @test
  Scenario: Find the Id's for Facebook page
    Given As a chrome user
    When I launch Facebook page
    Then I see the Facebook Home page
    And I perform key actions
    And I select Day Option
    And I click on Forgotten Account Link
#    And I quit browser