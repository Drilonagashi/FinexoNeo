Feature: Account Page Tests

  Scenario: User can login in the Account Page
    Given The user is in the account menu page
    When The user writes the email address to drilona@frakton.com in the email input field in the Account Page
    And The user writes the password to Drilona in the password input field in the Account Page
    And The user clicks on the Login button in the Account Page
    Then The user is directed to Status Page

  Scenario: User can sign up in the Account Page
    Given The user is in the information menu page
    And The user clicks the AG button in the information page
    And The user writes the name of company to Test in the company input field
    And The user clicks on the second Next button in the information page
    And The user writes the purpose of company to This is just a plain text in the company purpose input field
    And The user clicks on the third Next button in the information page
    And The user writes the address one on the address to John Prishtina in the one address input field
    And The user writes the address two on the address to Legend in the two address input field
    And The user writes the zip code to 10000 in the zip input field
    And The user writes the city name to Prishtina in the city name input field
    And The user clicks on the state Next button in the information page
    And The user writes the email address to drilona@frakton.com in the email input field
    And The user writes the telephone number to 12313213 in the telephone input field
    And The user click on Frau button in the Gender section
    And The user writes the name to Jessica in the name input field
    And The user writes the surname to Jones in the surname input field
    And The user writes the date of birth to 12/12/1990 in the date of birth input field
    And The user writes the hometown to Bern in the hometown input field
    And The user writes the nationality to German in the nationality input field
    And The user writes the address one to Template street 23 in the address one input field on the private address section
    And The user writes the address two to Berlin in the address two input field on the private address section
    And The user writes the zip code to 12392 in the zip code input field on the private address section
    And The user writes the city name to Berlin in the city name input field on the private address section
    And The user writes the title of company to Einzelmitglied in the company input field on the company section
    And The user writes the percentage number to 80% in the percentage input field on the percentage section
    And The user clicks on Collective button on permission to sign the application in the founder page
    And The user clicks on the Next button in the founder page
    And The user clicks on Yes button in the telephone contact page
    And The user clicks on Yes button in the terms and conditions page
    And User is directed to the Account page
    And The message for the successful redirect to the sign up page in the Account Page
    And The user writes the name to Jessica in the name input field in the Account Page
    And The user writes the email to drilona@frakton.com in the email input field in the Account Page
    And The user writes the password to Drilona.test in the password input field on the sign up page of Account Page
    And The user clicks on the Sign up button in the Account Page
