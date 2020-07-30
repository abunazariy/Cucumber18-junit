package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBear;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SmartBearStepDefinitions {
    SmartBear smartBear = new SmartBear();

    @Given("User is on the Smartbear login page")
    public void user_is_on_the_smartbear_login_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @And("User enters Tester's credentials")
    public void userEntersTesterSCredentials() {
        smartBear.userInput.sendKeys("Tester");
        smartBear.passwordInput.sendKeys("test");
        smartBear.loginButton.click();
    }
    @And("User clicks to Orders link")
    public void userClicksToOrdersLink() {
        smartBear.orderLink.click();
    }

    @And("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String productName) {
        Select select = new Select(smartBear.productSelect);
        select.selectByVisibleText(productName);
    }

    @And("User enters {string} to quantity")
    public void userEntersToQuantity(String quantity) {
        smartBear.productQuantity.clear();
        smartBear.productQuantity.sendKeys(quantity);
    }

    @And("User enters {string} to costumer name")
    public void userEntersToCostumerName(String name) {
        smartBear.customerNameInput.sendKeys(name);
    }

    @And("User enters {string} to street")
    public void userEntersToStreet(String address) {
        smartBear.customerAddressInput.sendKeys(address);
    }

    @And("User enters {string} to city")
    public void userEntersToCity(String city) {
        smartBear.customerCityInput.sendKeys(city);
    }

    @And("User enters {string} to state")
    public void userEntersToState(String state) {
        smartBear.customerStateInput.sendKeys(state);
    }

    @And("User enter {string} to zip code")
    public void userEnterToZipCode(String zipCode) {
        smartBear.customerZipInput.sendKeys(zipCode);
    }

    @And("User selects {string} as card type")
    public void userSelectsAsCardType(String cardType) {
        for (WebElement each: smartBear.customerCardType){

            if (each.getAttribute("value").equals(cardType)){
                each.click();
            }
        }
    }

    @And("User enters {string} to card number")
    public void userEntersToCardNumber(String cardNumber) {
        smartBear.customerCardNumInput.sendKeys(cardNumber);
    }

    @And("User enters {string} to expiration date")
    public void userEntersToExpirationDate(String cardExpDate) {
        smartBear.customerCardExpirationInput.sendKeys(cardExpDate);
    }

    @And("User clicks process button")
    public void userClicksProcessButton() {
        smartBear.processButton.click();
    }

    @And("User clicks to View All Orders link")
    public void userClicksToViewAllOrdersLink() {
        smartBear.viewAllOrdersButton.click();
    }

    @Then("User verifies {string} is in the list")
    public void userVerifiesIsInTheList(String name) {

        for (WebElement each: smartBear.listOfCustomers){
            if (each.getText().equals(name)){
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.fail();
    }

}
