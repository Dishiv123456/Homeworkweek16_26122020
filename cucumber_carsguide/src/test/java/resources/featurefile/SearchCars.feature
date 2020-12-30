@Smoke
Feature: Acceptance testing to validate Search Cars Page is working.
  In order to validate that
  the Search Cars page is working
  Doing the Acceptance Testing

  Scenario: Validate Search Cars Page
    Given I am on the Home Page of CarsGuide Website
    When I mouse hover to buy+sell Menu
    And click on Search Cars link
    And select car brand as "BMW" from AnyMake dropdown
    And select "1 Series" as car model
    And select location as "NSW - Sydney" from Select Location dropdown
    And select "$30,000" as price
    And click on Find_My_Next_Car button
    Then I should see list of searched cars "21 BMW 1 Series for Sale under $30,000 in Sydney, NSW"
    And the page title should be "Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide"
