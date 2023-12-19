@author_JDL @regression
Feature: Visa confirmation Test
  As a user I want to test visa confirmation

  @author_JDL @smoke
  Scenario: Verify result 'You will not need a visa to come to the UK'
    Given I am on homepage
    When I click on start button
    And  I Select a Nationality 'Australia'
    And  I Click on Continue button
    And I Select reason Tourism
    And  I Click on Continue button
    Then verify result 'You will not need a visa to come to the UK'

  @author_JDL @sanity,@smoke
  Scenario: verify result You need a visa to work in health and care
    Given I am on homepage
    When I click on start button
    And  I Select a Nationality 'Chile'
    When  I Click on Continue button
    And  Select reason Work, academic visit or business
    And  I Click on Continue button
    When  Select intendent to stay for longer than 6 months
    And  I Click on Continue button
    And Select have planning to work for Health and care professional
    And  I Click on Continue button
    Then verify result of'You need a visa to work in health and care'

  @author_JDL @sanity,@smoke
  Scenario: Verify you’ll need a visa to join your family or partner in the UK
    Given I am on homepage
    When I click on start button
    And Select a Nationality 'Colombia'
    And I Click on Continue button
    And Select reason Join partner or family for a long stay
    And I Click on Continue button
    Then To get verify result 'You may need a visa'