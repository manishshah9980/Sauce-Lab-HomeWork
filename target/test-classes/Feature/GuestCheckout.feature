Feature: Guest  User should able to  Checkout Successfully And see message"Your order h++A1:A29A1:A29as been successfully processed"
@test4
  Scenario: user should be able to checkout successfully.
    Given user is Already on A  homesPage
    When user clicks on Jewellery
    And user clicks on Add To Cart
    And user clicks on Shoping Cart
    And  user tick check box for terms and condition
    And user click on Checkouts
    And user Click on checkout as a guest
    And user Enters first name
    And user Enters a Last name
    And user Enter Email address
    And user click and select country
    And user Enter a City name
    And user Enter first line of address
    And user Enter postcode

    And user Enter phone number
    And user Clicke on a continu
    And user click on credit card radio button
    And user Clickes on Continues
    And user clicked on continue
    And user select "mastercard"from dropdown box
    And user Enters a CardHolders name
    And user Enter card number
    And user From expiry date drop down box select 'Month  ' and 'Year'
    And user Enter CVC number
    And user Clicka on a continue
    Then user should be able to see message "your order has been  successfully processed"




