Feature: Find elements using ID

  Scenario: Find the Id's for Facebook page
    Given As a chrome user
    When I access Facebook page
    Then I see the Facebook Home page
    And I perform key actions
#    And I select Day Option
#    And I click on Forgotten Account Link
#    And I quit browser