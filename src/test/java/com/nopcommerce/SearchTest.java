package com.nopcommerce;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.HomePage;
import pages.SearchPage;

public class SearchTest extends CommonAPI {
        Logger log = LogManager.getLogger(SearchTest.class.getName());

        String text = "iPhone 14 Pro Max";
        @Test(priority = 1)
        public void searchItems(){

            SearchPage searchPage = new SearchPage(getDriver());
            searchPage.clickOnSearchField();
            searchPage.typeOnSearchField(text);
            searchPage.clickOnSearchButtonLink();


            String expectedresult = "No products were found that matched your criteria.";
            String actualText = searchPage.searchValidationText();
            Assert.assertEquals(expectedresult,actualText);
            log.info("Search item(s) validation Success");
        }
        @Test(priority = 2)
        public void compareWith(){
            HomePage homePage = new HomePage(getDriver());
            SearchPage searchPage = new SearchPage(getDriver());
            CheckOutPage checkOutPage = new CheckOutPage(getDriver());
           // scrollByAmount(0, 900);
            waitFor(1);
          //  scrollByAmount(0, 400);
            waitFor(1);
            checkOutPage.clickOnJewelry();
           // scrollByAmount(0,200);
            checkOutPage.clickOncomparecompareElegantGemstone();
            checkOutPage.clickOnComparison();
           // scrollByAmount(0,50);
            waitFor(5);

            String expectedresult = "Compare products";
            String actualText = checkOutPage.compareValidationText();
            Assert.assertEquals(expectedresult,actualText);
            log.info("Compare products validation Success");



        }


    }

