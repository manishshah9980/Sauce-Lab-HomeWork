package org.example;

import org.openqa.selenium.By;

public class GuestCommentsResults extends Utils
{      // ASSERT MESSAGE GIVEN
    private By _assert1CommentsSuccessMessage = By.xpath("//div[text()=\"News comment is successfully added.\"]");

  // USER COMMENT ADD SUCCESSFULLY
    String expected = "News comment is successfully added.";

public void verifyGuestUserSEECommentsSuccessfullMessage()
{
    assertURL("about-nopcommerce");
    assertTextMessage("Comments not added successfully",expected,_assert1CommentsSuccessMessage);

}

}



