package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils {
    //locator for camera & photo image
    private By _cameraAndPhoto=By.xpath("//a/img[@alt=\"Picture for category Camera & photo\"]");

    //To verify user is on electronics page
    public void verifyUserIsOnElectronicsPage()
    {
        assertURL("electronics");
    }

    //To click on camera and photo
    public void userClicksOnCameraAndPhoto()
    {
        waitForClickable(_cameraAndPhoto,50);
        clickOnElement(_cameraAndPhoto);
    }

}
