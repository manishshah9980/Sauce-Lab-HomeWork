package org.example;

import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

//To fill details on register page
public class RegistrationPage extends Utils {


        //locator for first name
        private By _firstName = By.id("FirstName");
        //locator for last name
        private By _lastName = By.id("LastName");
        //locator for email address
        private By _email = By.id("Email");
        //locator for password
        private By _password = By.id("Password");
        //locator for confirm password
        private By _confirmPassword = By.id("ConfirmPassword");
        //locator for register button
        private By _registerButton = By.xpath("//input[@id=\"register-button\"]");
        //first name value
        private String firstName = "manish";
        //last name value
        private String lastName = "shah";
        //timestamp
        private static String timestamp = timeStamp();

        //to verify user is on register page
        public void verifyUserIsOnRegisterPage ()
        {
            assertURL("register");
        }

        //to enter registration details
        public void userEnterRegistrationDetails () throws InterruptedException {
        //To wait until first name is clickable
                try {
                        Thread.sleep(5000);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }        //To enter first name
        enterText(_firstName, firstName);
        //To enter last name
        enterText(_lastName, lastName);
        //To enter email address
        enterText(_email, "shah.manish99+" + timestamp + "@gmail.com");
        //To enter password
        enterText(_password, "shah123A");
        //To enter Confirm password
        enterText(_confirmPassword, "shah123A");
        //To click on register button
        clickOnElement(_registerButton);
    }
}
