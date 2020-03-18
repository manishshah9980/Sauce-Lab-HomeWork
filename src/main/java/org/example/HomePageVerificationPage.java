package org.example;

import org.openqa.selenium.By;

public class HomePageVerificationPage extends Utils {
    //locator for login success message
    private By _loginSuccessMessage=By.linkText("Welcome to our store");
    //expected message
    String expected="Welcome to our store";
    //Method for verifying login is successful
    public void verifyUserSeeLoginSuccessMessage()
    {
        assertTextMessage("Login not successful",expected,_loginSuccessMessage);
    }
}
