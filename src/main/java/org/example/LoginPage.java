package org.example;

import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class LoginPage extends Utils {
    //locator for email
    private By _email=By.xpath("//*[@id=\"Email\"]");
    //locator for password
    private By _password=By.xpath("//*[@id=\"Password\"]");
    //locator for login button
    private By _login=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input");

    //Method to verify we  are on login page
    public void verifyOnLoginPage()
    {
        assertURL("login?returnUrl=%2F");
    }

    //To enter login details
    public void loginDetails() throws InterruptedException {
        //To wait for until email is clickable
        waitForClickable(_email,30);
        sleep(3000);
        //To enter email
        enterText(_email,"manish_shah9988@yahoo.com");
        waitForClickable(_password,50);
        //To enter password
        enterText(_password,"Manish9980");
        waitForClickable(_login,50);
        //To click on login
        clickOnElement(_login);
    }
}
