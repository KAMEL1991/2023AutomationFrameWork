package com.nopcommerce;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InvalidCredentialsPage;
import pages.LoginPage;
import pages.RegisterPage;

import java.util.Properties;

import static java.sql.DriverManager.getDriver;

    public class InvalidCredentialsTest extends CommonAPI {
        Logger log = LogManager.getLogger(InvalidCredentialsTest.class.getName());

//    Properties prop = Utility.loadProperties();
//
//    String invalidEmail =Utility.decode(prop.getProperty("invalidEmail"));
//    String validEmail =Utility.decode(prop.getProperty("validEmail"));
//    String Password =Utility.decode(prop.getProperty("Password"));

        String invalidEmail  = "kamel.sssgmail.com";
        String validEmail  = "kamelzaouache198@gmail.com";
        String Password = "Kamel+1991";
        String invPassword = "Kamel+77";


        @Test(priority = 1)
        public void invalidEmail() {
            HomePage homePage = new HomePage(getDriver());
            RegisterPage registerPage = new RegisterPage(getDriver());
            LoginPage loginPage = new LoginPage(getDriver());
            InvalidCredentialsPage invalidCredentialsPage = new InvalidCredentialsPage(getDriver());
            loginPage.clickOnLoginLink();
            loginPage.typeUsername(invalidEmail);
            loginPage.typePassword(Password);
            waitFor(1);
          //  scrollByAmount(0,1000);

            String expectedText="Wrong email";
            String actualText = invalidCredentialsPage.invalidEmailValidationText();
            Assert.assertEquals(expectedText,actualText);
            log.info("Invalid email validation success ");

        }
        @Test(priority = 2)
        public void unsuccessfulLogin(){
            HomePage homePage = new HomePage(getDriver());
            RegisterPage registerPage = new RegisterPage(getDriver());
            LoginPage loginPage = new LoginPage(getDriver());
            InvalidCredentialsPage invalidCredentialsPage = new InvalidCredentialsPage(getDriver());
            loginPage.clickOnLoginLink();
           // scrollByAmount(0, 150);
            loginPage.typeUsername(validEmail);
            waitFor(5);
            loginPage.typePassword(invPassword);
            //scrollByAmount(0, 100);
            waitFor(1);

            loginPage.clickOnLoginButton();

            String expectedText="No customer account found";
            String actualText = invalidCredentialsPage.unsuccessfulLoginValidationText();
            Assert.assertEquals(expectedText,actualText);
            log.info("Unsuccessful Login validation success ");



        }
    }

