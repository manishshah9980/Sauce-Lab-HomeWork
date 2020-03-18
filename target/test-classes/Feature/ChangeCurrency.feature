Feature: user Should Able To Change The Curency For Feature Products On a HomePage from "$" to "Ђ" and "Ђ" to "$"
@test2

  Scenario: user Should Able To Change The Curency For Feature Products On a HomePage
    Given user is already on Home
    When user click on euro currency symbol
    Then user should able to see  currency symbol in euro for feature products on homepage
    And  user click on dollar currency symbol
    Then user should see  currency symbol in us dollar for all feature product on homeoage
