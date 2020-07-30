package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before(order = 2)
    public void setUpScenario(){
        System.out.println("------> Before annotation: Setting up browser");
    }

    @Before (value = "@db", order = 1)
    public void setUpDataBaseConnection(){
        System.out.println("-----------> BEFORE ANNOTATION: DB CONNECTION CREATED <------------");
    }

    @After(order = 4)
    public void tearDownScenario(Scenario scenario){
        //System.out.println("------> After annotation: Closing browser");
//        System.out.println("scenario.getName() = " + scenario.getName());
//        System.out.println("scenario.isFailed() = " + scenario.isFailed());
//        System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());

        if (scenario.isFailed()){
        byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName()); }

    }

    @After (value = "@db", order = 3)
    public void tearDownDataBaseConnection(){
        System.out.println("-----------> AFTER ANNOTATION: DB CONNECTION CLOSED <------------");
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("===============> Before step: Taking screenshot");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("===============> After step: Taking screenshot");
    }
}
