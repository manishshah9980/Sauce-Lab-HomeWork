package org.example;

import org.testng.annotations.Test;

//Collection of test cases
public class TestSuit extends BaseTest {
    //To Create object of home page
    HomePage homePage = new HomePage();
    //To Create object of registration page
    RegistrationPage registrationPage = new RegistrationPage();
    //To Create object of registration result page
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    //To Create object of electronics page
    ElectronicsPage electronicsPage = new ElectronicsPage();
    //To Create object of camera and photo page
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    //To Create object of camera and photo result page
    CameraAndPhotoResultPage cameraAndPhotoResultPage = new CameraAndPhotoResultPage();
    //To Create object of login page
    LoginPage loginPage = new LoginPage();
    //To Create object of page verification page
    HomePageVerificationPage homePageVerificationPage = new HomePageVerificationPage();
    //To Create object of product email a friend
    ProductEmailAFriend productEmailAFriend = new ProductEmailAFriend();
    //To Create object of product email a friend details
    ProductEmailAFriendDetails productEmailAFriendDetails = new ProductEmailAFriendDetails();
    //To Create object of user success email result--register user
    RegisterUserSuccessEmailResult productEmailResult = new RegisterUserSuccessEmailResult();
    //To Create object of user  email result--non register user
    NonRagisterUseremailResult nonRagisterUseremailResult = new NonRagisterUseremailResult();
    //To Create object of Book page
    BookPage bookPage = new BookPage();
    /////////// TO GUEST USER CHECKOUT SUCCESSFULLY  //////////////////////////////////////
    JewelryPage jeweleryPage = new JewelryPage();
    GuestCheckout guestCheckout = new GuestCheckout();
    ShippingAddress shippingAddress = new ShippingAddress();
    PaymentMethod paymentMethod = new PaymentMethod();
    CheckOutResult checkOutResult = new CheckOutResult();

///////////////////RUNNING WITH SAUCE LAB////////////////////////////////////////////////////////////////////////

    //To verify that user should able to  register successfully on demo nop commerce website and able to see successful registration message.......................................
    @Test
    public void userShouldAbleToRegisterSuccessfully() throws InterruptedException {
        //Click on register button
        homePage.clickRegisterButton();
        //To fill Registration details
        registrationPage.userEnterRegistrationDetails();
        driver.quit();
        }

    //----------------------End of testcase 1----------------


    //2.To verify that user should able to compare two products successfully....................................................................................................
    @Test
    public void userShouldBeAbleToCompareTwoDifferentProductsSuccessfully() {
        //---for product 1---
        //Click on electronics
        homePage.clickOnElectronics();
        //Verify user is  on electronics page
        electronicsPage.verifyUserIsOnElectronicsPage();
        //Click on camera and photo
        electronicsPage.userClicksOnCameraAndPhoto();
        //Click on compare button for item 1
        cameraAndPhotoPage.clickOnCompareButtonForProduct1();

        //--for product 2
        //Click on compare button for item 2
        homePage.clickOnElectronics();
        //Verify user is  on electronics page
        electronicsPage.verifyUserIsOnElectronicsPage();
        //Click on camera and photo
        electronicsPage.userClicksOnCameraAndPhoto();
        //Verify user is on camera and photo page
        cameraAndPhotoPage.verifyUserIsOnCameraAndPhotoPage();
        //Click on compare button for item 2
        cameraAndPhotoPage.clickOnCompareButtonForProduct2();

        //--for comparison--
        //Click on green product comparison link
        cameraAndPhotoPage.productComparision();
        //Verify compare product success message
        cameraAndPhotoResultPage.verifyUserSeeCompareProductSuccessMessage();
        // FOR ADD TO CART BUTTON ON HOMEPAGE
        AddToCartButton addToCartButton = new AddToCartButton();
        driver.quit();
    }

//-----------------------End of testcase 2-------------


    //3.To verify that when  Registered user should be able to refer a product to a friend..............................
    @Test
    public void registerUserShouldBeAbleToReferProductToTheFriend() throws InterruptedException {
        //Click on login link
        homePage.clickOnLogin();
        //To verify user is on login page
        loginPage.verifyOnLoginPage();
        //Enter login details
        loginPage.loginDetails();
        //Click on electronics
        homePage.clickOnElectronics();
        //To verify we are on electronics page
        electronicsPage.verifyUserIsOnElectronicsPage();
        //Click on camera & photo
        electronicsPage.userClicksOnCameraAndPhoto();
        //To select product
        cameraAndPhotoPage.selectProduct();
        //To click on email a friend
        productEmailAFriend.emailAFriend();
        //To fill the details
        productEmailAFriendDetails.registerUserEnterFriendDetails();
        //To check User should able to see message-"Your message has been sent.".
        productEmailResult.verifyRegisterUserSeeEmailSuccessMessage();
        driver.quit();
    }

    //------------------End of testcase 3------------------

    //To verify that non registered user should not be able to refer a product to a friend..............................
    @Test
    public void nonRegisterUserShouldNotBeAbleToReferAProductToFriend() {
        //Click on electronics
        homePage.clickOnElectronics();
        //To verify user is on electronics page
        electronicsPage.verifyUserIsOnElectronicsPage();
        //To click camera and photo
        electronicsPage.userClicksOnCameraAndPhoto();
        //To select product
        cameraAndPhotoPage.selectProduct();
        //To click email a friend
        productEmailAFriend.emailAFriend();
        //To fill details
        productEmailAFriendDetails.nonRegisterUserEnterFriendDetails();
        //To verify User should able to see error message -"Only registered customers can use email a friend feature"
        nonRagisterUseremailResult.verifyNonRegisterUserSeeErrorMessage();
        driver.quit();
    }

    //---------------End of testcase 4----------------------------

    //To verify user should be able to sort product high to low by price................................................
    @Test
    public void userShouldBeAbleToSortProductHighToLowByPrice() {
        //To click on books
        homePage.clickBooks();
        //To select short by filter for price high to low
        bookPage.selectHighToLowFromShortByFilter();
        //To print price high to low
        bookPage.verifyPriceHighToLowSorting();
        driver.quit();
    }

    //--------------End of testcase 5--------------------------
    @Test
    public void verifyGuestUserShouldBeAbleToCheckOutSuccessfully() {
        homePage.clickOnJewelryCategory();
        jeweleryPage.verifyUserIsOnJewelryPage();
        jeweleryPage.addToCartProduct();
        guestCheckout.checkoutAsGuest();
        shippingAddress.userShippingAddress();
        paymentMethod.userChoosePaymentMethod();
        driver.quit();
    }
}



