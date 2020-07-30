package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {
    public WikipediaSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "searchInput")
    public WebElement wikiSearchInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement wikiSearchButton;

    @FindBy(xpath = "//h1[@id='firstHeading']")
    public WebElement wikiHeader;

    @FindBy(xpath = "//div[@class='fn']")
    public WebElement wikiImageHeader;
}
