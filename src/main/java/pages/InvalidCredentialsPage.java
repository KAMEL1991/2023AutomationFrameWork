package pages;


import com.nopcommerce.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class InvalidCredentialsPage extends CommonAPI {
        Logger log = LogManager.getLogger(InvalidCredentialsPage.class.getName());

        public InvalidCredentialsPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//span[@id='Email-error']")
        WebElement invalidEmailValidation;


        @FindBy(xpath = "//li[normalize-space()='No customer account found']")
        WebElement unsuccessfulLoginValidation;



        public String invalidEmailValidationText() {
            String text = getElementText(invalidEmailValidation);
            log.info("  Invalid Email Validation Text successfully");
            return text;
        }


        public String unsuccessfulLoginValidationText() {
            String text = getElementText(unsuccessfulLoginValidation);
            log.info("Unsuccessful Login Validation Text successfully");
            return text;
        }
    }

