Feature:user(Non registered) should not be able to refer a product to a friend and should able to see error message -"Only registered customers can use email a friend feature"
@test7
  Scenario: user should not be able to refer product to the friend successfully
    Given user is on a  HomePage
    And user clicked on a electronics link
    And user Has selected Camera & Photo
    And user clicks on Apple iCam
    And user clicked on Emailed a friend
    And user entered friend's email address
    And user entered your email address
    And user enters personalise message
    And user clicked on a send email
    Then user should able to see error message -"Only registered customers can use email a friend feature"
