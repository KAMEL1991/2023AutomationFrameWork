package pages;


        import com.nopcommerce.CommonAPI;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends CommonAPI {
    Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    //----------------------------------------------------------------------
    // *********************************( Locators )****************************
    // ----------------------------------------------------------------------
    //Select Gender
    @FindBy(css = "#gender-male")
    WebElement maleSelectedOption;

    //type first name
    @FindBy(css = "#FirstName")
    WebElement firstNameField;

    //type last name
    @FindBy(css = "#LastName")
    WebElement lastNameField;

    //Select Day
    @FindBy(css = "select[name='DateOfBirthDay']")
    WebElement dateOfBirthDay;

    //Select Month
    @FindBy(css = "select[name='DateOfBirthMonth']")
    WebElement dateOfBirthMonth;

    //Select year
    @FindBy(css = "select[name='DateOfBirthYear']")
    WebElement dateOfBirthYear;

    //type email
    @FindBy(css = "#Email")
    WebElement emailField;

    //type company
    @FindBy(css = "#Company")
    WebElement companyField;

    //type password
    @FindBy(css = "#Password")
    WebElement passwordField;

    //type confirm password
    @FindBy(css = "#ConfirmPassword")
    WebElement confirmPasswordField;

    //click on register button
    @FindBy(css = "#register-button")
    WebElement registerButton;


    //registration Validation
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationValidation;

    //RE-registration Validation
    @FindBy(xpath = "//li[normalize-space()='The specified email already exists']")
    WebElement reRegistrationValidation;

    //Click on Register Button

    @FindBy(xpath = " //button[normalize-space()='Register']")
    WebElement registrationButton;


    //--------------------------------------------------------------------------
    // ************************( Reusable Methods )*****************************
    // ---------------------------------------------------------------------------

    //click On Register Link
    public void clickOnRegisterLink() {
        clickOn(maleSelectedOption);
        log.info("male gender selected successfully");
    }

    // type first Name
    public void typeFristName(String firstName) {
        type(firstNameField, firstName);
        log.info("Type first name successfully");
    }

    // type Last Name
    public void typeLastName(String lastName) {
        type(lastNameField, lastName);
        log.info("Type Last name successfully");
    }

    //Birth Day
    public void typeDateOfBirthDay() {
        selectOptionFromDropDown(dateOfBirthDay, "28");
        log.info("Selected  DateOfBirthDay successfully");
    }

    //Birth Month
    public void typeDateOfBirthMonth() {
        selectOptionFromDropDown(dateOfBirthMonth, "10");
        log.info(" Selected  DateOfBirthMonth successfully");
    }

    //Birth Year
    public void typeDateOfBirthYear() {
        selectOptionFromDropDown(dateOfBirthYear, "1990");
        log.info(" Selected DateOfBirthYear successfully");
    }

    // type Email
    public void typeEmail(String email) {
        type(emailField, email);
        log.info(" Type email successfully");
    }


    // type Company
    public void typeCompany(String company) {
        type(companyField, company);
        log.info(" Type company name successfully");
    }

    //type Password
    public void typePassword(String password) {
        type(passwordField, password);
        log.info(" Type Password successfully");
    }

    //type Confirm Password
    public void typeConfirmPassword(String confirmPassword) {
        type(confirmPasswordField, confirmPassword);
        log.info(" Type Password successfully");
    }

    //click on register button
    public void clickOnRegisterButton() {
        clickOn(registerButton);
        log.info("  Click On Register Button successfully");
    }


    //registration Validation
    public String registrationValidationText() {
        String text = getElementText(registrationValidation);
        log.info("  Registration Validation succeeded");
        return text;
    }

    public String reRegistrationValidationText() {
        String text = getElementText(reRegistrationValidation);
        log.info("  Registration Validation succeeded");
        return text;

    }
    //Click on Register Button
    public void clickOnRegisterButtonOnTheLeft() {
        clickOn(registrationButton);
        log.info("  Click On Register Button successfully");
    }

}



