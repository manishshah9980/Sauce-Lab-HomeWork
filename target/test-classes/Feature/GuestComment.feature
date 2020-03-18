Feature:  user should able to Add new comment on nop-commerce website And see NewsNewcomment is successfully added.
@test5
  Scenario: user should be able to add comment on nop-commerce Website
    Given user  On homePage
    When user click on Details
    And user enter the title
    And user enter the comment
    And user click on a new comment
    Then user Should be Able to See The Message  "News comment is successfully added" successfully
