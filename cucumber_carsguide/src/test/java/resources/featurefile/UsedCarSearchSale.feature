
Feature: Acceptance testing to validate Search Cars Page is working.
  In order to validate that
  the Used Search Cars page is working
  Performing the Acceptance Testing


  Scenario: Validate Used  Search Cars Page
    Given I am on the Home Page of CarsGuide Website
    When I mouse hover to buy+sell Menu
    And click on submenu Used Search link
    And select carMaker "Audi" from AnyMake dropdown
    And select carModel "A4" from AmyModel dropdown
    And select location "SA - All"  from SelectLocation dropdown
    And select price "$20,000" from price dropdown
    And click on Find_My_Car button
    Then I should see list of Used cars "10 Used Audi A4s for Sale under $20,000 in SA"
    And the page title should match expected title  "Used Audi A4 Under 20000 for Sale SA | carsguide"