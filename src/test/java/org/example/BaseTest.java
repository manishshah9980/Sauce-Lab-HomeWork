package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//For open browser and close browser
public class BaseTest extends Utils {
    BrowserSelector browserSelector=new BrowserSelector();


    @BeforeTest
    //open browser
    public void openBrowser()
    {
        browserSelector.SetUpBrowser();
    }

   @AfterTest
    //close browser
    public void closeBrowser()
    {
     //   browserSelector.closeBrowser();
    }


}
