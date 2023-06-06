package pages;



import com.nopcommerce.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppPage extends CommonAPI {
    Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public AppPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[@class='wishlist-label']")
    WebElement wishList;
    // validation wish List
    @FindBy(xpath = "div[@class='no-data']")
    WebElement wishListValidation;



    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCart;

    //Shopping Cart Validation
    @FindBy(xpath = "//div[@class='no-data']")
    WebElement shoppingCartValidation;




    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement clickOnContactUs;

    // full name field
    @FindBy(xpath = "//input[@id='FullName']")
    WebElement FullField;

    // email field
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;

    // type Text field
    @FindBy(xpath = "//textarea[@id='Enquiry']")
    WebElement typeTextField;

    // click on submit button
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    WebElement hitSubmitButton;

    // contact us validation
    @FindBy(xpath = "//div[@class='result']")
    WebElement contactUsValidation;

    //Vendor name Field
    @FindBy(xpath = "//input[@id='Name']")
    WebElement vendorNameField;

    //Vendor Email Field
    @FindBy(xpath = "//input[@id='Email']")
    WebElement vendorEmailField;

    //Vendor Description Field
    @FindBy(xpath = "//textarea[@id='Description']")
    WebElement vendorDescriptionField;

    //Vendor Description Field
    @FindBy(xpath = "//button[@id='apply-vendor']")
    WebElement vendorSubmitButton;

    //vendor Submission validation
    @FindBy(xpath = "//div[@class='result']")
    WebElement vendorSubmissionValidation;



    @FindBy(xpath = "//input[@id='newsletter-email']")
    WebElement newsletterSubscribeField;

    //Subscribe button
    @FindBy(xpath = "//button[@id='newsletter-subscribe-button']")
    WebElement subscribeButton;

    // newsletter Subscribe Validation
    @FindBy(xpath = "//strong[normalize-space()='Newsletter']")
    WebElement subscribeNewsletterValidation;

    //***********( vote Locators )***********
    // click on excellent button
    @FindBy(css = "label[for='pollanswers-1']")
    WebElement excellentButton;

    //click on vote button
    @FindBy(css = "#vote-poll-1")
    WebElement voteButton;

    // vote validation

    @FindBy(xpath = "//strong[normalize-space()='Community poll']")
    WebElement voteValidation;

    //***********( Email a friend Locators )***********
    // Click on Digital downloads
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
    WebElement digitalDownloadsLink;

    // click If You Wait (donation)
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='If You Wait (donation)']")
    WebElement ifYouWaitDonationLink;

    //Email a friend
    @FindBy(xpath = "//button[normalize-space()='Email a friend']")
    WebElement emailAFriendLink;

    //Type Friend Email field
    @FindBy(xpath = "//input[@id='FriendEmail']")
    WebElement friendEmailField;

    //Type Your email address field

    @FindBy(xpath = "//input[@id='YourEmailAddress']")
    WebElement yourEmailAddressField;

    // Type Personal message field  PersonalMessageField
    @FindBy(xpath = "//textarea[@id='PersonalMessage']")
    WebElement PersonalMessageField;




    //wish List
    public void WishLink() {
        clickOn(wishList);
        log.info(" Click On Wish Link successfully.");
    }

    //wishListValidation
    public String  wishListValidationValidation() {
        String text = getElementText(wishListValidation);
        log.info("Cart Validation successfully.");
        return text;

    }

    //*******------------*******/////
    //Shopping Cart
    public void shoppingCart() {
        clickOn(shoppingCart);
        log.info(" Click on shopping Cart successfully.");
    }

    //Shopping Cart Validation
    public String shoppingCartValidation() {
        String text = getElementText(shoppingCartValidation);
        log.info(" shopping Cart validation successfully.");
        return text;


    }
    //*******------------*******/////

    //********Contact us Methods********

    //Click on Contact Us button
    public void clickOnContactUsButton() {
        clickOn(clickOnContactUs);
        log.info("Click on contact us button successfully");
    }

    //type FullName
    public void typeFullName(String fullName) {
        type(FullField, fullName);
        log.info("Type full Name successfully");
    }

    //type Email
    public void typeEmail(String email) {
        type(emailField, email);
        log.info("Type email successfully");
    }

    //type In TextField Box
    public void typeInTextFieldBox(String typeMessage) {
        type(typeTextField, typeMessage);
        log.info("Type Message successfully");
    }

    //click On Submit Button
    public void clickOnSubmitButton() {
        clickOn(hitSubmitButton);
        log.info("Click successfully");

    }


    public String contactUsValidation() {
        String text = getElementText(shoppingCartValidation);
        log.info(" shopping Cart validation successfully.");
        return text;
    }



    public void clickOnVendorNameField() {
        clickOn(vendorNameField);
        log.info("Click successfully");
    }
    //Type Vendor name  Field
    public void typeInVendorNameField(String typeName) {
        type(vendorNameField, typeName);
        log.info("Type Vendor Name successfully");
    }
    //Vendor Email Field
    public void clickOnVendorEmailField() {
        clickOn(vendorEmailField);
        log.info("Click successfully");
    }
    //Type Vendor Email Field
    public void typeInVendorEmailField(String typeEmail) {
        type(vendorEmailField, typeEmail);
        log.info("Type Vendor Email successfully");
    }
    //Vendor Description Field vendorDescriptionField

    public void clickOnVendorDescriptionField() {
        clickOn(vendorDescriptionField);
        log.info("Click successfully");
    }
    //Type Vendor Description Field
    public void typeInVendorDescriptionField(String typeDescription) {
        type(vendorDescriptionField, typeDescription);
        log.info("Type Vendor Description successfully");
    }
    //vendorSubmitButton
    public void clickOnVendorSubmitButton() {
        clickOn(vendorSubmitButton);
        log.info("Click Submit Button successfully");
    }
    //vendor Submission validation vendorSubmissionValidation
    public String vendorSubmissionValidationText() {
        String text = getElementText(vendorSubmissionValidation);
        log.info(" Vendor Submission validation successfully.");
        return text;
    }

    //***********( Newsletter Subscribe Method )***********
    //Newsletter Subscribe
    public void typeEmailNewsletterSubscribeField(String typeEmail) {
        type(newsletterSubscribeField, typeEmail);
        log.info("Type email successfully");
    }

    //Subscribe button
    public void clickOnSubscribeButton() {
        clickOn(subscribeButton);
        log.info("Click Subscribe Button successfully");
    }
    //subscribe Newsletter Validation
    public String subscribeNewsletterValidationText() {
        String text = getElementText(subscribeNewsletterValidation);
        log.info("Subscribe Newsletter Validation successfully.");
        return text;
    }

    //***********( vote Methods )***********

    // click on excellent button
    public void clickOnExcellentButton() {
        clickOn(excellentButton);
        log.info("Click on excellent Button successfully");
    }

    //click on vote button voteButton

    public void clickOnVoteButton() {
        clickOn(voteButton);
        log.info("Click on vote Button successfully");
    }

    // vote validation
    public String voteValidationText() {
        String text = getElementText(voteValidation);
        log.info("vote Validation successfully.");
        return text;
    }

    //***********( Email a friend Locators )***********
    // Click on Digital downloads

    public void clickOnDigitalDownloadsLink() {
        clickOn(digitalDownloadsLink);
        log.info("Click on digital Downloads Link successfully");
    }
    // click If You Wait (donation)
    public void clickOnIfYouWaitDonationLink() {
        clickOn(ifYouWaitDonationLink);
        log.info("Click on if You Wait Donation Link successfully");
    }
    //Email a friend
    public void clickOnEmailAFriendLink() {
        clickOn(emailAFriendLink);
        log.info("Click on email A Friend Link successfully");
    }
    //Type Friend Email field
    public void typeFriendEmailField(String typeEmail) {
        type(friendEmailField, typeEmail);
        log.info("Type email successfully");
    }
    //Type Your email address field
    public void typeYourEmailAddressField(String typeEmail) {
        type(yourEmailAddressField, typeEmail);
        log.info("Type email successfully");
    }

    // Type Personal message field
    public void typePersonalMessageField(String typeMessage) {
        type(PersonalMessageField, typeMessage);
        log.info("Type Message successfully");
    }


}
