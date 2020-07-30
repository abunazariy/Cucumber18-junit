package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBear {
    public SmartBear(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userInput;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordInput;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderLink;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productSelect;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement productQuantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerNameInput;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement customerAddressInput;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement customerCityInput;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement customerStateInput;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement customerZipInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$cardList']")
    public List<WebElement> customerCardType;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement customerCardNumInput;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement customerCardExpirationInput;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement viewAllOrdersButton;

    @FindBy(xpath = "//table[@class='SampleTable']//td[2]")
    public List<WebElement> listOfCustomers;

}
