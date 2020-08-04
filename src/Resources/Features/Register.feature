@register

Feature: I want to register on https://demo.nopcommerce.com

  Scenario: I should be able to complete registration with all mandatory field

    Given I m on Home page
    When I click on register Button
    And  I click on gender
    And  I enter the First Name
    And  I enter last name
    And  I enter date of birth
    And  I enter my email address
    And  I enter Company name
    And  I enter password
    And  I enter confirm password
    And I click on registration button
    Then I register succesfully amd i should be able to see welcome massage
