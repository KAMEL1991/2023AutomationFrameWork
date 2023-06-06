package com.nopcommerce;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

import java.io.File;

    public class CheckOutTest extends CommonAPI {

        String fristName="kamel";
        String fullName="kamel zaouache";
        String message="NEXT MONTH";

        String firstName="kamel";
        String senderEmail="kamelmel-tkd@hotmail.fr";
        String lastName="zaouache";
        String email="kamelzaouache198@gmail.com";
        String password="Kamel+1991";
        String company="XTD";
        String confirmPassword="Kamel+1991";
        Logger log = LogManager.getLogger(CheckOutTest.class.getName());

      /*  String currentDir = System.getProperty("user.dir");
        String path = currentDir+ File.separator+"data"+File.separator+"oussama-data.xlsx";
        ExcelReader excelReader = new ExcelReader(path);
        String fristName =excelReader.getDataFromCell("oussama-data",7,1);
        //String lastName  = "YOUSUF";
        String lastName =excelReader.getDataFromCell("oussama-data",8,1);
        String message =excelReader.getDataFromCell("oussama-data",14,1);
        String email =excelReader.getDataFromCell("oussama-data",13,1);
        String senderEmail =excelReader.getDataFromCell("oussama-data",21,1);
        @Test(priority = 1)*/
        public void checkOut(){

            CheckOutPage checkOutPage = new CheckOutPage(getDriver());

            checkOutPage.clickOnJewelry();
          //  scrollByAmount(0,150);
            checkOutPage.clickOnFlowerGirlBracelet();
            checkOutPage.clickOnAddToCart();
          //  scrollByAmount(0,200);
            checkOutPage.clickOnAgreeCheckBox();
            checkOutPage.clickOnCheckOut();
            checkOutPage.clickOnCheckOutAsAGuest();
        }
        @Test(priority = 2)
        public void emptyCart(){
            CheckOutPage checkOutPage = new CheckOutPage(getDriver());

            checkOutPage.clickOnJewelry();
           // scrollByAmount(0,150);
            checkOutPage.clickOnFlowerGirlBracelet();
            checkOutPage.clickOnAddToCart();
            checkOutPage.clickOnRemoveItem();


        }
        @Test(priority = 3)
        public void updateQuantity(){
            CheckOutPage checkOutPage = new CheckOutPage(getDriver());

            checkOutPage.clickOnJewelry();
           // scrollByAmount(0,150);
            checkOutPage.clickOnFlowerGirlBracelet();
            checkOutPage.clickOnAddToCart();
            // checkOutPage.clickOnUpdateQty();
            // checkOutPage.typeQuantity("3");
            checkOutPage.clickOnUpdateButton();

            waitFor(1);
        }
        @Test(priority = 4)
        public void buildMyOwnPC(){
            HomePage homePage = new HomePage(getDriver());
            RegisterPage registerPage = new RegisterPage(getDriver());
            LoginPage loginPage = new LoginPage(getDriver());
            CheckOutPage checkOutPage = new CheckOutPage(getDriver());

           // scrollByAmount(0,3200);
            checkOutPage.clickOnSitemapLink();
           // scrollByAmount(0,500);
            checkOutPage.clickOnDesktopLink();
            //scrollByAmount(0,200);
            checkOutPage.clickOnBuildYourOwnComputer();
           // scrollByAmount(0,100);
            checkOutPage.clickOnChooseProcessor();
            checkOutPage.clickOnChooseProcessor2_5GHz();
            checkOutPage.clickOnRAM();
            checkOutPage.clickOnRAMChooseGB();
          //  scrollByAmount(0,150);
            checkOutPage.clickOnHDD();
            checkOutPage.clickOnOS();
            checkOutPage.clickOnSoftware();
            checkOutPage.clickOnAddToCartButtonForPC();
            checkOutPage.clickOnAddToCart();
            checkOutPage.clickOnAgreeCheckBox();
            checkOutPage.clickOnCheckOut();


        }

   @Test(priority = 5)
        public void $25GiftCard(){
            CheckOutPage checkOutPage = new CheckOutPage(getDriver());
            checkOutPage.clickOnGiftCardLink25$();
           // scrollByAmount(0,200);
            checkOutPage.clickOnVirtualGiftCard25$();
           // scrollByAmount(0,150);
            checkOutPage.typeRecipientNameField25$(fristName);
            checkOutPage.typeRecipientEmailField25$(email);
            checkOutPage.typeYourNameField25$(lastName);
            checkOutPage.typeYourOrSenderEmailField25$(senderEmail);
            checkOutPage.typeMessageField25$(message);
            checkOutPage.clickOnAddToCartButton25$();

            // validation for $25 gift card
            String expectedResult = "shopping cart";
            String actualText = checkOutPage.validationFor$25GiftCardText();
            Assert.assertEquals(expectedResult,actualText);
            log.info("$25 gift card validation Success");

        }
        @Test(priority = 6)
        public void $50PhysicalGiftCard(){
            CheckOutPage checkOutPage = new CheckOutPage(getDriver());
            checkOutPage.clickOnGiftCardLink25$();
           // scrollByAmount(0,150);
            checkOutPage.clickOn$50PhysicalGiftCard();
           // scrollByAmount(0,150);
            checkOutPage.type$50RecipientsNameField(fristName);
            checkOutPage.type$50SenderNameField(lastName);
            checkOutPage.type$50MessageField(message);
            checkOutPage.clickOn$50AddToCartButton();

            // Validation
            String expectedResult = "shopping cart";
            String actualText = checkOutPage.validationFor$50ValidationText();
            Assert.assertEquals(expectedResult,actualText);
            log.info("$50 gift card validation Success");

        }
        @Test (priority = 7)
        public void $100PhysicalGiftCard(){
            CheckOutPage checkOutPage = new CheckOutPage(getDriver());
            checkOutPage.clickOnGiftCardLink25$();
           // scrollByAmount(0,150);
            checkOutPage.clickOn$100PhysicalGiftCard();
          //  scrollByAmount(0,150);
            checkOutPage.type$100RecipientNameField(fristName);
            checkOutPage.type$100SenderNameField(lastName);
            checkOutPage.type$100MessageField(message);
            checkOutPage.clickOn$100AddToCartButton();

            //Validation
            String expectedResult = "shopping cart";
            String actualText = checkOutPage.validationFor$100ValidationText();
            Assert.assertEquals(expectedResult,actualText);
            log.info("$100 gift card validation Success");

        }

    }

