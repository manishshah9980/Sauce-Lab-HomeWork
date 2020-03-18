package org.example;

import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

//For homepage links
public class HomePage extends Utils {
    //Locator for register link
    private By _registerLink =By.linkText("Register");
    // Locator for electronics link
    private By _electronicsLink=By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/a");
    //Locator for login link
    private By _loginLink=By.linkText("Log in");
    //Locator for book link
    private By _bookLink=By.xpath("//div[6]/div[2]/ul[1]/li[5]/a[contains(text(),\"Books \")]");

    private By _jewelryLink = By.xpath("//ul[contains(@class,'notmobile')]//li//a[contains(text(),'Jewelry')]");
    //T0 click on register link
    public void clickRegisterButton()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            clickOnElement(_registerLink);
    }
    //To click on electronics link
    public void clickOnElectronics()
    {
        clickOnElement(_electronicsLink);
    }

    public void clickOnJewelryCategory(){clickOnElement(_jewelryLink);}
    //To click on login
    public void clickOnLogin()
    {
        waitForClickable(_loginLink,30);
        clickOnElement(_loginLink);
    }
    //To click on books link
    public void clickBooks()
    {
        clickOnElement(_bookLink);
    }
/////////////////////////////////////////////////////////////////////////////////////////
   public void clickOnCategoryLinks(String category){
        driver.findElement(By.linkText(category)).click();

   }
}