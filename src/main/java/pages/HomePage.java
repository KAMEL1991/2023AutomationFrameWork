package pages;

import com.nopcommerce.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
public class HomePage extends CommonAPI {
    Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(WebDriver driver) {PageFactory.initElements(driver, this);}

    //----------------------------------------------------------------------------------------------------------------
    // ************************************************( Locators )***************************************************
    // ---------------------------------------------------------------------------------------------------------------
    //forgot password
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;


    //forgot password
    @FindBy(xpath = "//span[@class='forgot-password']")
    WebElement forgotPassword;

    //recovery EmailField
    @FindBy(xpath = "//input[@id='Email']")
    WebElement recoveryEmailField;

    // click on recovery button
    @FindBy(xpath = "//button[@name='send-email']")
    WebElement recoveryButton;

    // Recovery password Validation
    @FindBy(xpath = "//p[@class='content']")
    WebElement recoveryValidation;


    // click on my account
    @FindBy(xpath = "//a[normalize-space()='My account']")
    WebElement myAccountLink;

    //Click 0n Apply for vendor account
    @FindBy(xpath = "//a[normalize-space()='Apply for vendor account']")
    WebElement applyForVendorAccount;

    //----------------------------------------------------------------------------------------------------------------
    // ****************************************( Reusable Methods )***************************************************
    // ---------------------------------------------------------------------------------------------------------------


    public void clickOnRegisterLink() {
        clickOn(registerLink);
        log.info("The Register page opened successfully.");
    }


    public void typeItemAndClickSearch(String itemName) {
    }


    public void clickOnForgotPassword() {
        clickOn(forgotPassword);
        log.info("Click forgot Password successfully.");
    }

    public void clickOnRecoveryEmailField() {
        clickOn(recoveryEmailField);
        log.info("Click On Recovery Email Field successfully.");

    }

    // Recovery email field
    public void typeEmailOnRecoveryEmailField(String email) {
        type(recoveryEmailField, email);
        log.info(" Type email successfully");
    }

    //recoveryButton
    public void clickOnRecoveryButton() {
        clickOn(recoveryButton);
        log.info("Click On Recovery Button successfully.");
    }

    // Recovery password Validation
    public String recoveryValidationText() {
        String text = getElementText(recoveryValidation);
        log.info("  Recovery Validation succeeded");
        return text;
    }

    // Click on My account link myAccountLink
    public void clickOnMyAccountLink() {
        clickOn(myAccountLink);
        log.info("Click On my Account Link successfully.");
    }

    //Click 0n Apply for vendor account
    public void clickOnApplyForVendorAccount() {
        clickOn(applyForVendorAccount);
        log.info("Click on apply for Vendor Account Link successfully.");
    }

}
