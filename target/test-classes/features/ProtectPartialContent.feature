Feature: Password protect partial content
  TestCaseID: TS2-TC-013

  Scenario Outline: Verify if the part of the content on the page is protected by a password form.
    Given Open the partial page
    When I enter the valid password to read the partial content of the page that being protected
    And Press in the submit button
    Then The page will display a line of the content like "<text>"
    Examples:
      | text |
      | Wow you just unlock this cool cat :3 |