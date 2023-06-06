package com.nopcommerce;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTest extends CommonAPI {

           String fristName="kamel";
           String lastName="zaouache";
            String email="kamelzaouache198@gmail.com";
            String password="Kamel+1991";
            String company="XTD";
            String confirmPassword="Kamel+1991";


        Logger log = LogManager.getLogger(RegisterTest.class.getName());


        //********** Data ******************
//    Properties prop = Utility.loadProperties();
//    String fristName = Utility.decode(prop.getProperty("fristName"));
//    String lastName  = Utility.decode(prop.getProperty("lastName"));
//    String email  = Utility.decode(prop.getProperty("email"));
//    String company  = Utility.decode(prop.getProperty("company"));
//    String password = Utility.decode(prop.getProperty("password"));
//    String confirmPassword = Utility.decode(prop.getProperty("confirmPassword"));



       /* String currentDir = System.getProperty("user.dir");
        String path = currentDir+ File.separator+"data"+File.separator+"oussama-data.xlsx";
        ExcelReader excelReader = new ExcelReader(path);
        Faker faker = new Faker();

        //String fristName = "ABU";
        String fristName =excelReader.getDataFromCell("oussama-data",7,1);
        //String lastName  = "YOUSUF";
        String lastName =excelReader.getDataFromCell("oussama-data",8,1);
        //String email  = "email2001@gmail.com";
        String email=  faker.internet().emailAddress();

        //String email =excelReader.getDataFromCell("oussama-data",6,1);
        //String company  = "US BANGLA CORP";
        String company =excelReader.getDataFromCell("oussama-data",9,1);
        //String password = "Admin1234";
        String password =excelReader.getDataFromCell("oussama-data",10,1);
        // String confirmPassword = "Admin1234";
        String confirmPassword =excelReader.getDataFromCell("oussama-data",11,1);*/
      @Test(priority = 1)
        public void registerTest() {
            String expectedTitle = "nopCommerce demo store";
            String actualTitle = getCurrentTitle();
            Assert.assertEquals(expectedTitle, actualTitle);
            log.info("Lended to right website successfully");

            HomePage homePage = new HomePage(getDriver());
            RegisterPage registerPage = new RegisterPage(getDriver());

            //to register
            homePage.clickOnRegisterLink();

            // process for registration
            //scrollByAmount(0, 200);

            registerPage.clickOnRegisterLink();

            registerPage.typeFristName(fristName);

            registerPage.typeLastName(lastName);

            registerPage.typeDateOfBirthDay();

            registerPage.typeDateOfBirthMonth();

            registerPage.typeDateOfBirthYear();

            registerPage.typeEmail(email);

           // scrollByAmount(0, 200);

            registerPage.typeCompany(company);

           // scrollByAmount(0, 500);

            registerPage.typePassword(password);

            registerPage.typeConfirmPassword(confirmPassword);
            // captureScreenshot();
            registerPage.clickOnRegisterButton();

            // registration validation
            String expectedText="Your registration completed";
            String actualText = registerPage.registrationValidationText();
            Assert.assertEquals(expectedText,actualText);
            log.info("Registration validation Success");



        }

        @Test(priority = 2)
        public void registerWithExistingEmail() {
            String expectedTitle = "nopCommerce demo store";
            String actualTitle = getCurrentTitle();
            Assert.assertEquals(expectedTitle, actualTitle);
            log.info("Lended to right website successfully");

            HomePage homePage = new HomePage(getDriver());
            RegisterPage registerPage = new RegisterPage(getDriver());

            //to register
            homePage.clickOnRegisterLink();

            // process for registration
          //  scrollByAmount(0, 200);

            registerPage.clickOnRegisterLink();

            registerPage.typeFristName(fristName);

            registerPage.typeLastName(lastName);

            registerPage.typeDateOfBirthDay();

            registerPage.typeDateOfBirthMonth();

            registerPage.typeDateOfBirthYear();

          //  scrollByAmount(0,100);

            registerPage.typeEmail(email);

           // scrollByAmount(0, 200);

            registerPage.typeCompany(company);

           // scrollByAmount(0, 500);

            registerPage.typePassword(password);
            registerPage.typeConfirmPassword(confirmPassword);
            registerPage.clickOnRegisterButton();

            // re registration validation
            String expectedResult = "The specified email already exists";
            String actualText = registerPage.reRegistrationValidationText();
            Assert.assertEquals(expectedResult,actualText);
            log.info("Re-Registration validation Success");

        }
       @Test (priority = 3)
        public void loginTest(){
            HomePage homePage = new HomePage(getDriver());
            RegisterPage registerPage = new RegisterPage(getDriver());
            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.clickOnLoginLink();
            loginPage.typeUsername(email);
            waitFor(1);
            loginPage.typePassword(password);
            waitFor(1);
          //  scrollByAmount(0,100);
            loginPage.clickOnLoginButton();

            String expectedText="Log out";
            String actualText = loginPage.loginValidationText();
            Assert.assertEquals(expectedText,actualText);
            log.info("Log-in validation Success");

        }
        @Test(priority = 4)
        public void logOutTest(){
            HomePage homePage = new HomePage(getDriver());
            RegisterPage registerPage = new RegisterPage(getDriver());
            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.clickOnLoginLink();
            loginPage.typeUsername(email);
            waitFor(1);
            loginPage.typePassword(password);
            waitFor(1);
           // scrollByAmount(0,100);
            loginPage.clickOnLoginButton();
            waitFor(1);
            loginPage.clickOnLogOutButton();

            String expectedText="Log in";
            String actualText = loginPage.logOutValidationText();
            Assert.assertEquals(expectedText,actualText);
            log.info("Log-out validation Success");


        }
        // Email Recovery
        @Test(priority = 5)
        public void passwordRecovery(){
            HomePage homePage = new HomePage(getDriver());
            RegisterPage registerPage = new RegisterPage(getDriver());
            LoginPage loginPage = new LoginPage(getDriver());

            homePage.clickOnRegisterLink();
            loginPage.clickOnLoginLink();
           // scrollByAmount(0,100);
            waitFor(1);
            homePage.clickOnForgotPassword();
            waitFor(1);
            homePage.clickOnRecoveryEmailField();
            homePage.typeEmailOnRecoveryEmailField(email);
            homePage.clickOnRecoveryButton();

            String expectedText="Email with instructions has been sent to you.";
            String actualText = homePage.recoveryValidationText();
            Assert.assertEquals(expectedText,actualText);
            log.info("Password recovery validation Success");
        }
        @Test(priority = 6)
        public void checkOrder(){
            HomePage homePage = new HomePage(getDriver());
            RegisterPage registerPage = new RegisterPage(getDriver());
            LoginPage loginPage = new LoginPage(getDriver());

           // scrollByAmount(0, 400);
          //  scrollByAmount(0, 400);
          //  scrollByAmount(0, 400);
           // scrollByAmount(0, 400);
           // scrollByAmount(0, 400);
            //scrollByAmount(0, 400);
           // scrollByAmount(0, 400);
           // scrollByAmount(0, 400);

            homePage.clickOnMyAccountLink();
          //  scrollByAmount(0,100);
            loginPage.clickOnLoginLink();
            loginPage.typeUsername(email);
            loginPage.typePassword(password);
            loginPage.clickOnLoginButton();
           // scrollByAmount(0,100);
            loginPage.clickOnOrdersLink();
            waitFor(1);
            String expectedText="No orders";
            String actualText = loginPage.ordersValidationText();
            Assert.assertEquals(expectedText,actualText);
            log.info("Orders Validation validation Success");

            //take ScreenShoot
            //captureScreenshot();
        }}

        // build my own PC
/*  @Test (priority = 7)
        public void buildMyOwnPC(){
            HomePage homePage = new HomePage(getDriver());
            RegisterPage registerPage = new RegisterPage(getDriver());
            LoginPage loginPage = new LoginPage(getDriver());
            CheckOutPage checkOutPage = new CheckOutPage(getDriver());

            scrollByAmount(0,3200);
            checkOutPage.clickOnSitemapLink();
            scrollByAmount(0,500);
            checkOutPage.clickOnDesktopLink();
            scrollByAmount(0,200);
            checkOutPage.clickOnBuildYourOwnComputer();
            scrollByAmount(0,100);
            checkOutPage.clickOnChooseProcessor();
            checkOutPage.clickOnChooseProcessor2_5GHz();
            checkOutPage.clickOnRAM();
            checkOutPage.clickOnRAMChooseGB();
            scrollByAmount(0,150);
            checkOutPage.clickOnHDD();
            checkOutPage.clickOnOS();
            checkOutPage.clickOnSoftware();
            checkOutPage.clickOnAddToCartButtonForPC();
            checkOutPage.clickOnAddToCart();
            checkOutPage.clickOnAgreeCheckBox();
            checkOutPage.clickOnCheckOut();


        }
        // Vote
        @Test (priority = 8)
        public void vote(){
            LoginPage loginPage = new LoginPage(getDriver());
            HomePage homePage = new HomePage(getDriver());
            FeaturePage featurePage = new FeaturePage(getDriver());
            loginPage.clickOnLoginLink();
            loginPage.typeUsername(email);
            loginPage.typePassword(password);
            loginPage.clickOnLoginButton();
            scrollByAmount(0,2000);
            featurePage.clickOnExcellentButton();
            featurePage.clickOnVoteButton();

            String expectedText="Community poll";
            String actualText = featurePage.voteValidationText();
            Assert.assertEquals(expectedText,actualText);
            log.info("Vote validation Success");


        }


    }
}*/
