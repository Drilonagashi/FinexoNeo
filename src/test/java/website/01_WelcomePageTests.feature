Feature: Welcome Page Tests

  Background: The user navigates to Finexo website
    Given The user navigates to the Finexo page

    Scenario: User clicks the Anfang button
      When The user clicks the Anfang button on the Finexo Welcome Page
      Then User is directed to the Information page