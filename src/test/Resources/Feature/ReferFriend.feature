Feature: user(Registered) should be able to refer a product to a friend and able to see message "Your message has been sent."
@test8

  Scenario: user should be able to refer product to the friend successfully
    Given user is already on home page
    When user clicks on login
    And user enters email address
    And user enters password
    And user clicks on login button
    And user clicks on electronics link
    And user selects Camera & Photo
    And user click on Apple iCam
    And user click on Email a friend
    And user enters friend's email address
    And user enters personal message
    And user clicks on send email
    Then user should able to see message "Your message has been sent."
