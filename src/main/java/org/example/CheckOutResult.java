package org.example;

import org.openqa.selenium.By;

public class CheckOutResult extends Utils {
    private By _checkoutsuccessmessage = By.xpath("//div[@class='section order-completed']/div[1]/strong");

    String accepted = "Your order has been successfully processed!";

    public void verifyCheckoutSuccessMessage()
    {
//        try {
//            sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        assertURL("checkout completed");
        //String accepted = "Your order has been successfully processed!";
        //assertTextMessage("checkout is not successful",accepted,_checkoutsuccessmessage);
    }
}
