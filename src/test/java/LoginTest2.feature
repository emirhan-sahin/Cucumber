

Feature: Login Test


  Scenario: Go to amazon website and test login page

    Given Go to Amazon website
    And click login button
    And enter firstName
    And enter password
    When click submit button
    Then verify success messages