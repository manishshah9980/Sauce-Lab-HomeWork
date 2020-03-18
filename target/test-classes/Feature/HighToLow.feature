Feature: User should able to see sorted price from high to low.
@test6
  Scenario: user should be able to sort product high to low by price.
    Given user is on A  homepage
    And user clicks on Books link
    And user click on sort by filter
    And user select High to Low filter.
    Then user should able to see sorted price from high to low.

