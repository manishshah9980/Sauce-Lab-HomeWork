Feature: User should able to compare two products successfully and able to see 'compare products' text.
@test3
  Scenario: User should  able to compare two products successfully
    Given User is on homepage
    When User clicked on electronics link
    And User selected Camera & Photo
    And User clicks on Nikon D5500 DSLR
    And User click on Add to compare list
    And User click on camera & photo
    And User clicked on Apple iCam
    And User click on Add to compare list
    And User click on product comparison.
    Then User should able to see 'compare products' text
