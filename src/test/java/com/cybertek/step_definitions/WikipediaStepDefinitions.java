package com.cybertek.step_definitions;

import com.cybertek.pages.WikipediaSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaStepDefinitions {

    WikipediaSearchPage wiki = new WikipediaSearchPage();
    @Given("User in on Wikipedia home page")
    public void user_in_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @Then("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String keyword) {
        wiki.wikiSearchInput.sendKeys(keyword);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wiki.wikiSearchButton.click();
    }

    @Then("User should see {string} is in the wiki title")
    public void user_should_see_is_in_the_wiki_title(String expectedInTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @Then("User should see {string} is in the main header")
    public void userShouldSeeIsInTheMainHeader(String expectedInHeader) {
        Assert.assertTrue(wiki.wikiHeader.getText().equals(expectedInHeader));

    }

    @Then("User should see {string} is in the image header")
    public void userShouldSeeIsInTheImageHeader(String expectedInImageHeader) {
        Assert.assertTrue(wiki.wikiImageHeader.getText().equals(expectedInImageHeader));
    }
}
