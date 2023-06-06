package com.nopcommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AppPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class AppTest extends CommonAPI{
     String fullName="kamel zaouache";
     String message="NEXT MONTH";

    String firstName="kamel";
    String senderEmail="kamelmel-tkd@hotmail.fr";
    String lastName="zaouache";
    String email="kamelzaouache198@gmail.com";
    String password="Kamel+1991";
    String company="XTD";
    String confirmPassword="Kamel+1991";
    Logger log = LogManager.getLogger(AppTest.class.getName());

    @Test(priority = 1)
    public void wishListTest(){
        //Wish list Test
        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        AppPage appPage  = new AppPage(getDriver());

        appPage.WishLink();

        // Wish list Test validation

    }
    @Test(priority = 2)
    public void shoppingCartTest(){
        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        AppPage appPage = new AppPage(getDriver());
        //Shopping cart Test
        appPage.shoppingCart();

        //Shopping cart validation

    }
    @Test(priority = 3)
    public void contactUs(){
        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        AppPage AppPage = new AppPage(getDriver());
        //scrollByAmount(0, 300);
        AppPage.clickOnContactUsButton();
       // scrollByAmount(0, 250);
        AppPage.typeFullName(fullName);
        AppPage.typeEmail(email);
        AppPage.typeInTextFieldBox(message);
        AppPage.clickOnSubmitButton();




    }
    @Test(priority = 4)
    // Apply for Vendor Account
    public void applyForVendorAccount() {
        String expectedTitle = "nopCommerce demo store";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("Lended to right website successfully");

        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AppPage appPage =new AppPage(getDriver());
       // scrollByAmount(0,3200);

        homePage.clickOnApplyForVendorAccount();
        registerPage.clickOnRegisterButtonOnTheLeft();

        //to register

        // process for registration
        //scrollByAmount(0, 200);

        registerPage.typeFristName(firstName);

        registerPage.typeLastName(lastName);

        registerPage.typeDateOfBirthDay();

        registerPage.typeDateOfBirthMonth();

        registerPage.typeDateOfBirthYear();

        registerPage.typeEmail(email);

       // scrollByAmount(0, 200);

        registerPage.typeCompany(company);

     //   scrollByAmount(0, 500);

        registerPage.typePassword(password);

        registerPage.typeConfirmPassword(confirmPassword);
        // captureScreenshot();
        registerPage.clickOnRegisterButton();


        loginPage.clickOnLoginLink();
        loginPage.typeUsername(email);
        waitFor(1);
        loginPage.typePassword(password);
        waitFor(1);
       // scrollByAmount(0,100);
        loginPage.clickOnLoginButton();
        loginPage.clickOnMyAccountLink();
        loginPage.clickOnOrdersLink();
      //  scrollByAmount(0,150);
        homePage.clickOnApplyForVendorAccount();
        appPage.clickOnVendorNameField();
        appPage.typeInVendorNameField(fullName);
        appPage.clickOnVendorEmailField();
        appPage.typeInVendorEmailField("");
        appPage.clickOnVendorDescriptionField();
        appPage.typeInVendorDescriptionField(message);
       // scrollByAmount(0,300);
        waitFor(1);
        appPage.clickOnVendorSubmitButton();
        waitFor(1);


        // Vendor Submission validation
        String expectedText = "Your request has been submitted successfully. We'll contact you soon.";
        String actualText = registerPage.registrationValidationText();
        Assert.assertEquals(actualText, expectedText);
        log.info("Vendor Submission validation successfully.");
    }
    @Test(priority = 5)
    //subscribe Newsletter
    public void subscribeNewsletter(){
        AppPage appPage = new AppPage(getDriver());

       // scrollByAmount(0,3200);
        appPage.typeEmailNewsletterSubscribeField(email);
        appPage.clickOnSubscribeButton();

        // validation
        String expectedText = "Newsletter";
        String actualText = appPage.subscribeNewsletterValidationText();
        Assert.assertEquals(actualText, expectedText);
        log.info("Subscribe Newsletter Validation successfully.");



    }
    //***********( Email a friend )***********
    @Test(priority = 6)
    public void emailAFried(){
        AppPage appPage = new AppPage(getDriver());
        appPage.clickOnDigitalDownloadsLink();
       // scrollByAmount(0,150);
        appPage.clickOnIfYouWaitDonationLink();
      //  scrollByAmount(0,150);
        appPage.clickOnEmailAFriendLink();
       // scrollByAmount(0,150);
        appPage.typeFriendEmailField(email);
        appPage.typeYourEmailAddressField(senderEmail);
        appPage.typePersonalMessageField(message);
    }

}



