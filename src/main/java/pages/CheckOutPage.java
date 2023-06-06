package pages;


import com.nopcommerce.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CheckOutPage extends CommonAPI {
        Logger log = LogManager.getLogger(CheckOutPage.class.getName());

        public CheckOutPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        //click on Jewelry
        @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
        WebElement jewelry;
        //scrollByAmount(0,150);

        //click flower Girl Bracelet;
        @FindBy(xpath = "//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]")
        WebElement flowerGirlBracelet;

        //click for Compare flower Girl Bracelet;
        @FindBy(xpath = "//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]")
        WebElement compareClowerGirlBracelet;

        //click for Compare Elegant Gemstone

        @FindBy(css = "body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(2)")
        WebElement compareElegantGemstone;

        //product comparison
        @FindBy(xpath = "//a[normalize-space()='product comparison']")
        WebElement comparison;

        //click on add to cart
        @FindBy(xpath = "//a[normalize-space()='shopping cart']")
        WebElement addToCart;

        //scrollByAmount(0,200);
        //click on agree check box
        @FindBy(xpath = "//input[@id='termsofservice']")
        WebElement agreeCheckBox;


        //click on  check out button
        @FindBy(xpath = "//button[@id='checkout']")
        WebElement checkOut;

        //click on  check out as a guest
        @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
        WebElement checkOutAsAGuest;

        // scrollByAmount(0,150);

        //type all personal info
        @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
        WebElement firstNameField;

        @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
        WebElement lastNameField;

        //remove item
        @FindBy(xpath = " //button[@class='remove-btn']")
        WebElement removeItem;

        //Update Quantity
        @FindBy(xpath = " //input[@id='itemquantity11223']")
        WebElement updateQuantity;

        //update Cart
        @FindBy(xpath = " //button[@id='updatecart']")
        WebElement updateCart;

        //remove item validation
        @FindBy(xpath = "  //div[@class='no-data']")
        WebElement removeItemValidation;
        //Check out validation
        @FindBy(xpath = "//h2[normalize-space()='Billing address']")
        WebElement CheckOutValidation;

        // compare Validation

        @FindBy(xpath = "//h1[normalize-space()='Compare products']")
        WebElement compareValidation;

        // *************************Desktops Locators*******************************
        //Click on Sitemap
        @FindBy(xpath = "//a[normalize-space()='Sitemap']")
        WebElement SitemapLink;

        //desktop Link
        @FindBy(xpath = "//div[@class='entity-body']//a[normalize-space()='Desktops']")
        WebElement desktopLink;

        //Click on Build your own computer
        @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
        WebElement buildYourOwnComputer;

        //Click on  choose processor
        @FindBy(css = "#product_attribute_1")
        WebElement processor;

        //Click on choose processor 2.5GHz processor2_5GHz
        @FindBy(css = "option[value='2']")
        WebElement processor2_5GHz;

        //Click on choose RAM
        @FindBy(css = "#product_attribute_2")
        WebElement ram;

        //Click on choose RAM-GB
        @FindBy(css = "option[value='5']")
        WebElement ramGb;

        //Click on choose HDD
        @FindBy(css = "#product_attribute_3_7")
        WebElement hdd;

        //Click on choose OS
        @FindBy(xpath = "//label[@for='product_attribute_4_9']")
        WebElement os;

        //Click on choose software
        @FindBy(xpath = "//label[@for='product_attribute_5_11']")
        WebElement software;

        //Click on add to cart button PC

        @FindBy(css = "#add-to-cart-button-1")
        WebElement addToCartForPC;

        // ************************Gift Cards**************************
        //Click on Gift Card Link
        @FindBy(xpath = " //ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
        WebElement giftCardLink25$;

        // $25 Virtual Gift Card
        @FindBy(xpath = " //a[normalize-space()='$25 Virtual Gift Card']")
        WebElement VirtualGiftCard25$;

        //Type Recipient Name Field
        @FindBy(css = "#giftcard_43_RecipientName")
        WebElement recipientNameField25$;

        // type Recipient Email Field
        @FindBy(css = "#giftcard_43_RecipientEmail")
        WebElement recipientEmailField25$;

        //Your/sender Name Field    yourNameField25$
        @FindBy(css = "#giftcard_43_SenderName")
        WebElement yourNameField25$;

        //Your/sender Email Field
        @FindBy(css = "#giftcard_43_SenderEmail")
        WebElement yourOrSenderEmailField25$;

        //Message Field
        @FindBy(css = "#giftcard_43_Message")
        WebElement messageField25$;

        //Add to cart button

        @FindBy(css = "#add-to-cart-button-43")
        WebElement addToCartButton25$;

        // Validation for $25 Gift Card
        @FindBy(xpath = "//a[normalize-space()='shopping cart']")
        WebElement validationFor$25GiftCard;

        // ************************$50 Physical Gift Card**************************
        //$50 Physical Gift Card
        @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'$50 Physical Gift Card')]")
        WebElement $50PhysicalGiftCard;

        //50$ Recipient's Name:
        @FindBy(css = "#giftcard_44_RecipientName")
        WebElement $50RecipientsName;

        //50$ Sender Name
        @FindBy(css = "#giftcard_44_SenderName")
        WebElement $50SenderName;

        // 50$ Message field
        @FindBy(css = "#giftcard_44_Message")
        WebElement $50MessageField;

        // 50$ add to cart button
        @FindBy(css = "#add-to-cart-button-44")
        WebElement $50AddToCartButton;

        // $50 Physical Gift Card Validation
        @FindBy(xpath = "//a[normalize-space()='shopping cart']")
        WebElement $50Validation;

        // ************************$100 Physical Gift Card******************
        //click on $100 Physical Gift Card
        @FindBy(xpath = "//a[normalize-space()='$100 Physical Gift Card']")
        WebElement $100PhysicalGiftCard;

        // 100  Recipient Name Field
        @FindBy(css = "#giftcard_45_RecipientName")
        WebElement $100RecipientNameField;

        //$100 Sender Name Field
        @FindBy(css = "#giftcard_45_SenderName")
        WebElement $100SenderNameField;

        // 100$ Message field
        @FindBy(css = "#giftcard_45_Message")
        WebElement $100MessageField;

        // 100$ Add to cart Button
        @FindBy(css = "#add-to-cart-button-45")
        WebElement $100AddToCartButton;

        // $100 Physical Gift Card Validation

        @FindBy(xpath = "//a[normalize-space()='shopping cart']")
        WebElement $100Validation;





        public void clickOnJewelry() {
            clickOn(jewelry);
            log.info(" Click On jewelry Link successfully.");
        }


        public void clickOnFlowerGirlBracelet() {
            clickOn(flowerGirlBracelet);
            log.info(" Click On flowerGirlBracelet Link successfully.");
        }
        // compare Flower Girl Bracelet
        public void clickOnFlowerGirlBraceletCompare() {
            clickOn(compareClowerGirlBracelet);
            log.info(" Click On flowerGirlBracelet Link successfully.");
        }
        //click On compare Vintage Style EngagementRing
        public void clickOncomparecompareElegantGemstone() {
            clickOn(compareElegantGemstone);
            log.info(" Click On compare Vintage Style Engagement Ring Link successfully.");
        }

        public void clickOnComparison() {
            clickOn(comparison);
            log.info(" Click On comparison Link successfully.");
        }
        //addToCart
        public void clickOnAddToCart() {
            clickOn(addToCart);
            log.info(" Click On addToCart successfully.");
        }

        //agreeCheckBox
        public void clickOnAgreeCheckBox() {
            clickOn(agreeCheckBox);
            log.info(" Click On agreeCheckBox successfully.");
        }

        //checkOut
        public void clickOnCheckOut() {
            clickOn(checkOut);
            log.info(" Click On checkOut successfully.");
        }

        //checkOutAsAGuest
        public void clickOnCheckOutAsAGuest() {
            clickOn(checkOutAsAGuest);
            log.info(" Click On checkOut successfully.");
        }

        //Shopping Cart Validation
        public String CheckOutValidation() {
            String text = getElementText(CheckOutValidation);
            log.info(" Check Out Validation validation successfully.");
            return text;


        }

        public void clickOnRemoveItem() {
            clickOn(removeItem);
            log.info(" Click On remove Item successfully.");
        }

        //removeItemValidation
        public void removeItemValidation() {
            clickOn(removeItemValidation);
            log.info(" remove Item successfully.");
        }
        //updateQuantity
        public void clickOnUpdateQty() {
            clickOn(updateQuantity);
            clear(updateQuantity);
            log.info(" remove Item successfully.");
        }

        public void typeQuantity(String Qty) {
            type(updateQuantity, Qty);
            log.info(" Type Quantity successfully");
        }

        // updateCart
        public void clickOnUpdateButton() {
            clickOn(updateCart);
            log.info(" update Cart successfully.");
        }
        // compare Validation
        public String compareValidationText() {
            String text = getElementText(compareValidation);
            log.info("  Compare Validation succeeded");
            return text;
        }

        // *************************Desktops Methods*******************************
        //Click on Sitemap
        public void clickOnSitemapLink() {
            clickOn(SitemapLink);
            log.info(" Click Sitemap link successfully.");
        }
        // //desktop Link
        public void clickOnDesktopLink() {
            clickOn(desktopLink);
            log.info(" Click desktop link successfully.");
        }

        //add To Cart Button
        public void clickOnBuildYourOwnComputer() {
            clickOn(buildYourOwnComputer);
            log.info("Click on build Your Own Computer successfully.");
        }
        //Click on  choose processor
        public void clickOnChooseProcessor() {
            clickOn(processor);
            log.info("Click processor choose successfully.");
        }
        //Click on choose processor 2.5GHz
        public void clickOnChooseProcessor2_5GHz() {
            clickOn(processor2_5GHz);
            log.info("Click processor 2_5GHz choose successfully.");
        }
        //Click on RAM
        public void clickOnRAM() {
            clickOn(ram);
            log.info("Click RAM successfully.");
        }
        //Click on choose RAM-GB
        public void clickOnRAMChooseGB() {
            clickOn(ramGb);
            log.info("Click RAM GB successfully.");
        }
        //Click on choose HDD
        public void clickOnHDD() {
            clickOn(hdd);
            log.info("Click HDD successfully.");
        }
        //Click on choose OS
        public void clickOnOS() {
            clickOn(os);
            log.info("Click OS successfully.");
        }
        //Click on choose software
        public void clickOnSoftware() {
            clickOn(software);
            log.info("Click Software successfully.");
        }
        //Click on add to cart button PC
        public void clickOnAddToCartButtonForPC() {
            clickOn(addToCartForPC);
            log.info("Click on Add To Cart Button For PC successfully.");
        }

        //************************* Gift Card $25***************************
        //Click on Gift Card Link
        public void clickOnGiftCardLink25$() {
            clickOn(giftCardLink25$);
            log.info("Click on gift CardLink 25$ successfully.");
        }
        public void clickOnVirtualGiftCard25$() {
            clickOn(VirtualGiftCard25$);
            log.info("Click on gift CardLink 25$ successfully.");
        }
        //Type Recipient Name Field
        public void typeRecipientNameField25$(String recipientName) {
            type(recipientNameField25$, recipientName);
            log.info(" Type Recipient Name successfully");
        }
        // type Recipient Email Field recipientEmailField25$
        public void typeRecipientEmailField25$(String recipientEmail) {
            type(recipientEmailField25$, recipientEmail);
            log.info(" Type Recipient email successfully");
        }
        //Your/sender Name Field    yourNameField25$
        public void typeYourNameField25$(String senderName) {
            type(yourNameField25$, senderName);
            log.info(" Type sender Name successfully");
        }
        //Your/sender Email Field yourOrSenderEmailField25$;
        public void typeYourOrSenderEmailField25$(String yourOrSenderEmail) {
            type(yourOrSenderEmailField25$, yourOrSenderEmail);
            log.info(" Type sender email successfully");
        }
        //Message Field messageField25$
        public void typeMessageField25$(String typeMessage) {
            type(messageField25$, typeMessage);
            log.info(" Type message successfully");
        }
        //Add to cart button ;
        public void clickOnAddToCartButton25$() {
            clickOn(addToCartButton25$);
            log.info("Click on add To Cart Button for 25$ successfully.");
            // Validation for $25 Gift Card  ;

        }
        public String validationFor$25GiftCardText() {
            String text = getElementText(validationFor$25GiftCard);
            log.info("Validation For $25 Gift Card succeeded");
            return text;
        }

        public void clickOn$50PhysicalGiftCard() {
            clickOn($50PhysicalGiftCard);
            log.info("Click on $50 Physical Gift Card successfully.");
        }



        public void type$50RecipientsNameField(String typeRecipientsName) {
            type($50RecipientsName, typeRecipientsName);
            log.info(" Type Recipients Name successfully");
        }



        public void type$50SenderNameField(String typeSenderName) {
            type($50SenderName, typeSenderName);
            log.info(" Type Sender Name successfully");
        }
        // 50$ Message field
        public void type$50MessageField(String typeMessage) {
            type($50MessageField, typeMessage);
            log.info(" Type Message successfully");
        }
        // 50$ add to cart button
        public void clickOn$50AddToCartButton() {
            clickOn($50AddToCartButton);
            log.info("Click on $50 Add To Cart Button successfully.");
        }

        // $50 Physical Gift Card Validation
        public String validationFor$50ValidationText() {
            String text = getElementText($50Validation);
            log.info("Validation For $50 Gift Card succeeded");
            return text;
        }



        public void clickOn$100PhysicalGiftCard() {
            clickOn($100PhysicalGiftCard);
            log.info("Click on $100 Physical Gift Card successfully.");
        }

        // 100  Recipient Name Field
        public void type$100RecipientNameField(String typeRecipientName) {
            type($100RecipientNameField, typeRecipientName);
            log.info(" Type Recipient Name successfully");
        }
        //$100 Sender Name Field
        public void type$100SenderNameField(String typeSenderName) {
            type($100SenderNameField, typeSenderName);
            log.info(" Type Sender Name successfully");
        }
        // 100$ Message field
        public void type$100MessageField(String typeMessage) {
            type($100MessageField, typeMessage);
            log.info(" Type message successfully");
        }
        // 100$ Add to cart Button
        public void clickOn$100AddToCartButton() {
            clickOn($100AddToCartButton);
            log.info("Click on add to cart successfully.");
        }



        public String validationFor$100ValidationText() {
            String text = getElementText($100Validation);
            log.info("Validation For $100 Gift Card succeeded");
            return text;
        }}





