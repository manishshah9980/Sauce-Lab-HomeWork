Feature: Categories

  Background:
    Given user is on Homepage

  @category
  Scenario Outline: User can navigate to correct category page,
  so that he can use all products features from categories

    When user click on "<category>" link from top menu
    Then user should able to navigate to "<related category page>" successfully
    Examples:

      | category          | related category page                          |
      | Computers         | https://demo.nopcommerce.com/computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads |