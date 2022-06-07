Feature: Testing Google search
  Scenario: A user performs search on Google
    Given Navigate to Google homepage
    When A User enters a search term in the search bar
    And A user clicks on Google Search button
    Then A list of search results will be returned
