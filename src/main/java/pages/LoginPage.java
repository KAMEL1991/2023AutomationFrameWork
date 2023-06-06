package pages;


        import com.nopcommerce.CommonAPI;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {
    Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //--------------------------------------------------------------------------------
    // ****************************************( Locators )***************************
    // -------------------------------------------------------------------------------
    //Login Button
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    //Login Username Field
    @FindBy(xpath = "//input[@id='Email']")
    WebElement loginUsernameField;

    //Login password Field
    @FindBy(xpath = "//input[@id='Password']")
    WebElement loginPasswordField;

    //click on login button

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement LoginButton;

    // Login validation
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement loginValidation;

    // Logout button
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement LogOutButton;

    //////////Log-Out Validation
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement LogoutValidation;

    //Click on Orders
    @FindBy(xpath = "//li[@class='customer-orders inactive']//a[normalize-space()='Orders']")
    WebElement ordersLink;

    //Order Validation
    @FindBy(xpath = "//div[@class='no-data']")
    WebElement ordersValidation;


    //Click on my account Link
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;






    public void clickOnLoginLink() {
        clickOn(loginLink);
        log.info(" Click On LoginLink successfully.");

    }


    public void typeUsername(String username) {
        type(loginUsernameField, username);
        log.info(" Type username successfully");
    }


    public void typePassword(String password) {
        type(loginPasswordField, password);
        log.info(" Type password successfully");
    }


    public void clickOnLoginButton() {
        clickOn(LoginButton);
        log.info(" Click On LoginButton successfully");
    }


    public String loginValidationText() {
        String text = getElementText(loginValidation);
        log.info("  login Validation successfully");
        return text;
    }

    public void clickOnLogOutButton() {
        clickOn(LogOutButton);
        log.info(" Click On LogOutButton successfully");
    }

    public String logOutValidationText() {
        String text = getElementText(LogoutValidation);
        log.info("  log out Validation successfully");
        return text;
    }


    public void clickOnOrdersLink() {
        clickOn(ordersLink);
        log.info(" Click On OrdersLink successfully");
    }

    //Order Validation
    public String ordersValidationText() {
        String text = getElementText(ordersValidation);
        log.info("  Order Validation successfully");
        return text;
    }


    public void clickOnMyAccountLink() {
        clickOn(myAccountLink);
        log.info(" Click On OrdersLink successfully");
    }



}
