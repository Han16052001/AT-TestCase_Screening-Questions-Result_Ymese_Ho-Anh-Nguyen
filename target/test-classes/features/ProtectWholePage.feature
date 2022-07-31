Feature: Password protect the whole page
  TestCaseID: TS1-TC-013

  Scenario Outline: Verify if the login form is possible with a valid password.
    Given Open the page
    When I enter the valid password to read the content that being protected
    And Press in submit button
    Then The website will display a line of the content like "<content>"
    Examples:
      | content |
      | And because you entered the right pass, so you can read all of this. Congratulation !!! |

