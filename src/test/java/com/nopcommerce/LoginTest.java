package com.nopcommerce;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

import java.util.Properties;

    public class LoginTest extends CommonAPI {
        Logger log = LogManager.getLogger(LoginTest.class.getName());
        //********** Data ******************

//    Properties prop = Utility.loadProperties();
//    String email =Utility.decode(prop.getProperty("email"));
//    String password =Utility.decode(prop.getProperty("password"));

       // Faker faker = new Faker();
        //String email=  faker.internet().emailAddress();
        String email  = "Kamelzaouache198@gmail.com";
      //  RegisterTest registerTest = new RegisterTest();

        //String validEmail= registerTest.email;


        String password = "Kamel+1991";
        @Test (priority = 1)
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
        }
        @Test(priority = 2)
        public void logOutTest(){
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
            waitFor(1);
            loginPage.clickOnLogOutButton();

            String expectedText="Log in";
            String actualText = loginPage.logOutValidationText();
            Assert.assertEquals(expectedText,actualText);


        }

    }

