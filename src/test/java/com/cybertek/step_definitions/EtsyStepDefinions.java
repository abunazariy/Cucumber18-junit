package com.cybertek.step_definitions;

import com.cybertek.pages.Etsy;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDefinions {

    Etsy etsy = new Etsy();

    @Given("User on Etsy home page")
    public void userOnEtsyHomePage() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("User should see title is Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")
    public void userShouldSeeTitleIsEtsyShopForHandmadeVintageCustomAndUniqueGiftsForEveryone() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Given("User should be able type Wooden spoon in Etsy search box")
    public void userShouldBeAbleTypeWoodenSpoonInEtsySearchBox() {

        etsy.searchBox.sendKeys("Wooden spoon");
    }

    @When("User clicks to Etsy search button")
    public void userClicksToEtsySearchButton() {
        etsy.searchButton.click();
    }

    @Then("User should see Wooden spoon in the title")
    public void userShouldSeeWoodenSpoonInTheTitle() {
        String expectedInLineTitle = "Wooden spoon";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInLineTitle));
    }


    @Given("User should be able type {string} in Etsy search box")
    public void userShouldBeAbleTypeInEtsySearchBox(String keyWord) {
        etsy.searchBox.sendKeys(keyWord);
    }

    @Then("User should see {string} in title")
    public void userShouldSeeInTitle(String expectedInLineTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInLineTitle));
    }
}
