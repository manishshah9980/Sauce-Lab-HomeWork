package org.example;

import org.openqa.selenium.By;

public class GuestCheckout extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _checkoutguest = By.xpath("//input[@value='Checkout as Guest']");
    private By _firstname = By.xpath("//input[@name='BillingNewAddress.FirstName']");
    private String FirstName = "Tom";
    private By _lastname = By.xpath("//input[@name='BillingNewAddress.LastName']");
    private String LastName = "Jerry";
    private By _email = By.id("BillingNewAddress_Email");
    private By _dropdown = By.id("BillingNewAddress_CountryId");
    //private By _dropdown = By.xpath("//select[@name='BillingNewAddress.CountryId']");
    private String _country = "United Kingdom";
    private By _city = By.xpath("//input[@name = 'BillingNewAddress.City']");
    private String city = "Hatfield";
    private By _address = By.xpath("//input[@name='BillingNewAddress.Address1']");
    private String address = "99, Gorse Close";
    private By _postcode = By.xpath("//input[@name ='BillingNewAddress.ZipPostalCode']");
    private String postcode = "Al109dw";
    private By _phonenum = By.xpath("//input[@name='BillingNewAddress.PhoneNumber']");
    private String phonenum = "07533360517";
    private By _continue = By.xpath("//input[@onclick='Billing.save()']");


    public void checkoutAsGuest(){

        clickOnElement(_checkoutguest);
        try {
            Thread.sleep(2000); // System will go on sleep mode to allow loading the homepage(very Slow)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        enterText(_firstname,FirstName);
        enterText(_lastname,LastName);
        enterText(_email,"premchopda1@gmail.com");
        selectFromDropdownByValue(_dropdown,"233");
        enterText(_city,city);
        enterText(_address,address);
        enterText(_postcode,postcode);
        enterText(_phonenum,phonenum);
        clickOnElement(_continue);

    }

    public String get_country() {
        return _country;
    }

    public void set_country(String _country) {
        this._country = _country;
    }
}
