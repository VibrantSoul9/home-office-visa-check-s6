Feature: Country drop down Page Test Cases

  @author_JDL
  Scenario Outline: Verify the following country is available in country dropdown list
    Given I am on homepage
    When  I click on start button
    Then  I can see following '<country>' into dropdown

    Examples:
      | country                |
      |albania                 |
      |bhutan                  |
      |british-protected-person|
      |haiti                   |
      |kazakhstan              |
      |mozambique              |
      |norway                  |
      |portugal                |
      |russia                  |
      |zambia                  |