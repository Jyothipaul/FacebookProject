package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import utilities.Log;

import java.util.ArrayList;
import static java.lang.Thread.*;
import static steps.Hooks.cFR;
import static steps.Hooks.myDriver;

public class SantanderStepDef {

    ArrayList<String> tabs2;
    SantanderPO sPO = new SantanderPO();

    @Given("^As a Santander user$")
    public void as_a_Santander_user() throws Throwable {
        System.out.println("Chrome browser launched"+ "\n");
        Log.info("I am in Santander GIVEN");
    }

    @When("^I launch Santander website$")
    public void i_launch_Santander_website() throws Throwable {
        myDriver.get("https://retail.santander.co.uk/LOGSUK_NS_ENS/BtoChannelDriver.ssobto?dse_operationName=LOGON&dse_processorState=initial&redirect=S");
        sPO.SantanderPO(myDriver);
        if(sPO.homePagePopUp.isDisplayed()){
            sPO.popUpClose.click();
            Log.info("I am in Santander WHEN");
        }
    }

    @Then("^I click on Online Banking link$")
    public void i_click_on_Online_Banking_link() throws Throwable {
        sPO.onlineBankingVideo.click();

//        Thread waits
//        sleep(1000);

        sPO.termsAndConditions.click();
        tabs2 = new ArrayList<String>(myDriver.getWindowHandles());

//        tabs2.add(myDriver.getWindowHandle());

        for(String h: tabs2){
            myDriver.switchTo().window(h);
            System.out.println("Page Title: " + myDriver.switchTo().window(h).getTitle() + "\n");
        }

        Log.info("I am in Santander THEN");
    }

}
