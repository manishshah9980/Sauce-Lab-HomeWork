package org.example;

import org.openqa.selenium.By;

public class GuestComments extends Utils
{
   // OBJECT CREATED
    LoadProp loadprop = new LoadProp();
   // USER IS GOING TO ENTER THE COMMENTS
    private By _detailsButtonAboutNop = By.xpath("//div[3]/div[3]/a[@class=\"read-more\"]");
   // USER ENTER THE TITLE
    private By _enterTitle = By.xpath("//input[@class=\"enter-comment-title\"]");
    // USER ENTER THE COMMENTS
    private By _enterComments = By.xpath("//textarea[@class=\"enter-comment-text\"]");
    // USER SUBMIT THE COMMENT
    private By _submitNewComments = By.xpath("//input[@class=\"button-1 news-item-add-comment-button\"]");
    // TITLE WILL PRINT
    private String title = loadprop.getProperty("title");
    // COMMENT WILL PRINT
    private String comments = loadprop.getProperty("comments");



    public void addComments()
    {
      // CLICK ON A ELEMENT BUTTON
        clickOnElement(_detailsButtonAboutNop);
        try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
      // ENTER THE TITLE
        enterText(_enterTitle,title);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

           enterText(_enterComments,comments);

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
            clickOnElement(_submitNewComments);


        }



    }





