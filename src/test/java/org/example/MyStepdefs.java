package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
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
    // TO CHANGE CURRENCY
    CurrencyChange currencyChange = new CurrencyChange();
    CurrencyChangeResultPage currencyChangeResultPage = new CurrencyChangeResultPage();

    // FOR USER ADD COMMENT
    GuestComments guestComments = new GuestComments();
    GuestCommentsResults guestCommentsResults = new GuestCommentsResults();
    // FOR ADD TO CART BUTTON ON THE HOMEPAGE
    AddToCartButton addToCartButton = new AddToCartButton();
  //////////  FOR GUEST USER CHECKOUT  ///////////////////////////

    JewelryPage jeweleryPage = new JewelryPage();
    GuestCheckout guestCheckout = new GuestCheckout();
    ShippingAddress shippingAddress = new ShippingAddress();
    PaymentMethod paymentMethod = new PaymentMethod();
    CheckOutResult checkOutResult = new CheckOutResult();

/////////////// PROGRAMME FOR REGISTER SUCCESSFULLY///////////////////////////

    @Given("user is on register page")
    public void userIsOnRegisterPage() {
        homePage.clickRegisterButton();
    }


    @When("user enters all registration details")
    public void userEntersAllRegistrationDetails() throws InterruptedException {
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {

    }

    @Then("user should able to register successfully")
    public void userShouldAbleToRegisterSuccessfully() {
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }


    //////  PROGRAMME FOR REGISTER USER REFER PRODUCT TO FRIEND  /////////////////////////////////////////////
    @Given("user is already on home page")
    public void userIsAlreadyOnHomePage() {

    }

    @When("user clicks on login")
    public void userClicksOnLogin() {
        homePage.clickOnLogin();

    }

    @And("user enters email address")
    public void userEntersEmailAddress() {
        try {
            loginPage.loginDetails();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @And("user enters password")
    public void userEntersPassword() {


    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
    }

    @And("user clicks on electronics link")
    public void userClicksOnElectronicsLink()
    {
        homePage.clickOnElectronics();
    }

    @And("user selects Camera & Photo")
    public void userSelectsCameraPhoto()
    {
        electronicsPage.userClicksOnCameraAndPhoto();
    }

    @And("user click on Apple iCam")
    public void userClickOnAppleICam() {

        cameraAndPhotoPage.selectProduct();
    }

    @And("user click on Email a friend")
    public void userClickOnEmailAFriend() {
        productEmailAFriend.emailAFriend();

    }

    @And("user enters friend's email address")
    public void userEntersFriendSEmailAddress() {

        productEmailAFriendDetails.registerUserEnterFriendDetails();
    }

    @And("user enters personal message")
    public void userEntersPersonalMessage() {
    }

    @And("user clicks on send email")
    public void userClicksOnSendEmail() {
    }

    @Then("user should able to see message {string}")
    public void userShouldAbleToSeeMessage(String arg0) {

        productEmailResult.verifyRegisterUserSeeEmailSuccessMessage();
    }
    //////////// PROGRAMME FOR COMPARE PRODUCT //////////////////////////////////////////////

    @Given("User is on homepage")
    public void userIsOnHomepage() {
    }

    @When("User clicked on electronics link")
    public void userClickedOnElectronicsLink() {
        homePage.clickOnElectronics();
        electronicsPage.verifyUserIsOnElectronicsPage();
    }

    @And("User selected Camera & Photo")
    public void userSelectedCameraPhoto() {
        electronicsPage.userClicksOnCameraAndPhoto();

    }

    @And("User clicks on Nikon D{int} DSLR")
    public void userClicksOnNikonDDSLR(int arg0) {
        cameraAndPhotoPage.selectProduct();

    }

    @And("User click on Add to compare list")
    public void userClickOnAddToCompareList()
    {
        cameraAndPhotoPage.clickOnCompareButtonForProduct1();
    }

    @And("User click on camera & photo")
    public void userClickOnCameraPhoto() {

        electronicsPage.userClicksOnCameraAndPhoto();
    }

    @And("User clicked on Apple iCam")
    public void userClickedOnAppleICam()
    {
        electronicsPage.userClicksOnCameraAndPhoto();
    }

    @And("User click on product comparison.")
    public void userClickOnProductComparison()
    {
        cameraAndPhotoPage.clickOnCompareButtonForProduct2();
    }

    @Then("User should able to see {string} text")
    public void userShouldAbleToSeeCompareProductsText() {
        cameraAndPhotoResultPage.verifyUserSeeCompareProductSuccessMessage();
    }

    ///////// PROGRAMME FOR NON REGISTERED USER //////////////////////////////////////
    @Given("user is on a  HomePage")
    public void userIsOnAHomePage() {

    }

    @And("user clicked on a electronics link")
    public void userClickedOnAElectronicsLink()
    {
        homePage.clickOnElectronics();
    }

    @And("user Has selected Camera & Photo")
    public void userHasSelectedCameraPhoto() {

        electronicsPage.userClicksOnCameraAndPhoto();
    }

    @And("user clicks on Apple iCam")
    public void userClicksOnAppleICam() {
        cameraAndPhotoPage.selectProduct();

    }

    @And("user clicked on Emailed a friend")
    public void userClickedOnEmailedAFriend()
    {
        productEmailAFriend.emailAFriend();
    }

    @And("user entered friend's email address")
    public void userEnteredFriendSEmailAddress()
    {
        productEmailAFriendDetails.nonRegisterUserEnterFriendDetails();
    }

    @And("user entered your email address")
    public void userEnteredYourEmailAddress() {
    }

    @And("user enters personalise message")
    public void userEntersPersonaliseMessage() {
    }

    @And("user clicked on a send email")
    public void userClickedOnASendEmail() {
    }

    @Then("user should able to see error message -{string}")
    public void userShouldAbleToSeeErrorMessage(String arg0) {
        productEmailResult.verifyRegisterUserSeeEmailSuccessMessage();

    }
    //////// PROGRAMME FOR PRICE HIGH TO LOW /////////////////////////////////////////////////////////
    @Given("user is on A  homepage")
    public void userIsOnAHomepage() {
    }

    @And("user clicks on Books link")
    public void userClicksOnBooksLink() {

        homePage.clickBooks();
    }

    @And("user click on sort by filter")
    public void userClickOnSortByFilter() {

    }

    @And("user select High to Low filter.")
    public void userSelectHighToLowFilter() {
        bookPage.selectHighToLowFromShortByFilter();
    }

    @Then("user should able to see sorted price from high to low.")
    public void userShouldAbleToSeeSortedPriceFromHighToLow() {

        bookPage.verifyPriceHighToLowSorting();
    }

//////  PROGRAMME FOR CHANGE CURRENCY  //////////////////////////////////////////////////////////

    @Given("user is already on Home")
    public void userIsAlreadyOnHome() {
    }

    @When("user click on euro currency symbol")
    public void userClickOnEuroCurrencySymbol() {
        currencyChange.selectCurrencyUsDollarToEuro();

    }

    @Then("user should able to see  currency symbol in euro for feature products on homepage")
    public void userShouldAbleToSeeCurrencySymbolInEuroForFeatureProductsOnHomepage() {

    }

    @And("user click on dollar currency symbol")
    public void userClickOnDollarCurrencySymbol() {
        currencyChange.selectCurrencyEuroToDollar();
    }

    @Then("user should see  currency symbol in us dollar for all feature product on homeoage")
    public void userShouldSeeCurrencySymbolInUsDollarForAllFeatureProductOnHomeoage() {
        currencyChangeResultPage.verifychangeCurrencyChangeUsDollarsToEuro();
        currencyChangeResultPage.verifycurrencyChangeEuroToUsDollar();
    }
///////////////  PROGRAMME FOR GUEST ADD COMMENT  ////////////////////////////////////////////////////

    @Given("user  On homePage")
    public void userOnHomePage() {

    }

    @When("user click on Details")
    public void userClickOnDetails() {
        guestComments.addComments();


    }

    @And("user enter the title")
    public void userEnterTheTitle() {

    }

    @And("user enter the comment")
    public void userEnterTheComment() {
    }

    @And("user click on a new comment")
    public void userClickOnANewComment() {
    }

    @Then("user Should be Able to See The Message  {string} successfully")
    public void userShouldBeAbleToSeeTheMessageSuccessfully(String arg0) {
        guestCommentsResults.verifyGuestUserSEECommentsSuccessfullMessage();
    }

    ///////////  PROGRAMME FOR ADD TO CART BUTTON ON HOME PAGE /////////////////////////////////


    @Given("user Is Already On A HoMePaGe")
    public void userIsAlreadyOnAHoMePaGe() {
    }

    @Then("user should see the Add to cart button present on all feature Products on a home page")
    public void userShouldSeeTheAddToCartButtonPresentOnAllFeatureProductsOnAHomePage() {
        addToCartButton.verifyAddToCartButton();

    }
/////////  PROGRAMME FOR CHECKOUT GUEST  ///////////////////////////////////////
    @Given("user is Already on A  homesPage")
    public void userIsAlreadyOnAHomesPage() {

    }

    @When("user clicks on Jewellery")
    public void userClicksOnJewellery() {

        homePage.clickOnJewelryCategory();
        jeweleryPage.verifyUserIsOnJewelryPage();
        shippingAddress.userShippingAddress();
        paymentMethod.userChoosePaymentMethod();
    }

    @And("user clicks on Add To Cart")
    public void userClicksOnAddToCart() {
        jeweleryPage.addToCartProduct();
    }

    @And("user clicks on Shoping Cart")
    public void userClicksOnShopingCart() {
    }

    @And("user tick check box for terms and condition")
    public void userTickCheckBoxForTermsAndCondition() {
    }

    @And("user click on Checkouts")
    public void userClickOnCheckouts() {
    }

    @And("user Click on checkout as a guest")
    public void userClickOnCheckoutAsAGuest() {
        guestCheckout.checkoutAsGuest();
    }

    @And("user Enters first name")
    public void userEntersFirstName() {
    }

    @And("user Enters a Last name")
    public void userEntersALastName() {
    }

    @And("user Enter Email address")
    public void userEnterEmailAddress() {
    }

    @And("user click and select country")
    public void userClickAndSelectCountry() {
    }

    @And("user Enter a City name")
    public void userEnterACityName() {
    }

    @And("user Enter first line of address")
    public void userEnterFirstLineOfAddress() {
    }

    @And("user Enter postcode")
    public void userEnterPostcode() {
    }

    @And("user Enter phone number")
    public void userEnterPhoneNumber() {
    }

    @And("user Clicke on a continu")
    public void userClickeOnAContinu() {
    }

    @And("user click on credit card radio button")
    public void userClickOnCreditCardRadioButton() {
    }

    @And("user Clickes on Continues")
    public void userClickesOnContinues() {
    }

    @And("user clicked on continue")
    public void userClickedOnContinue() {
    }

    @And("user select {string}from dropdown box")
    public void userSelectFromDropdownBox(String arg0) {
    }

    @And("user Enters a CardHolders name")
    public void userEntersACardHoldersName() {
    }

    @And("user Enter card number")
    public void userEnterCardNumber() {
    }

    @And("user From expiry date drop down box select {string} and {string}")
    public void userFromExpiryDateDropDownBoxSelectMonthAndYear() {
    }

    @And("user Enter CVC number")
    public void userEnterCVCNumber() {
    }

    @And("user Clicka on a continue")
    public void userClickaOnAContinue() {
    }

    @Then("user should be able to see message {string}")
    public void userShouldBeAbleToSeeMessage(String arg0) {
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("user is on Homepage")
    public void userIsOnAAHomepage() {
    }

    @When("user click on {string} link from top menu")
    public void userClickOnLinkFromTopMenu(String category) {
        homePage.clickOnCategoryLinks(category);

    }

    @Then("user should able to navigate to {string} successfully")
    public void userShouldAbleToNavigateToSuccessfully(String related_category_page ) {
        Utils.assertURL(related_category_page);

    }
}