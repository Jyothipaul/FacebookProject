package steps;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.CapScreenSht;
import utilities.ConfigFileReader;
import utilities.Log;
import utilities.SpreadsheetReader;

import static steps.Hooks.cFR;
import static steps.Hooks.myDriver;

public class FacebookStepDef {

    Select daySelect;
    Select monthSelect;
    Select yearSelect;

//    This gives error as the driver is not yet initialised.
//    FacebookPO facebookPO = new FacebookPO();
    FacebookPO fPO  = new FacebookPO();
    CapScreenSht cSS = new CapScreenSht();
    SpreadsheetReader ssR = new SpreadsheetReader();

    @Given("^As a chrome user$")
    public void as_a_chrome_user() throws Throwable {
//        System.setProperty("webdriver.chrome.driver",cFR.getDriverPath());
        System.out.println("Step1: Chrome browser launched");
        Log.info("I am in Facebook GIVEN");
    }

    @When("^I launch Facebook page$")
    public void i_launch_Facebook_page() throws Throwable {
//        myDriver.manage().window().maximize();
        myDriver.get(cFR.getApplicationUrl());
        System.out.println("\nFacebook page launched in Chrome browser");
        Log.info("I am in Facebook WHEN");
    }

    @Then("^I see the Facebook Home page$")
    public void i_see_the_Facebook_Home_page() throws Throwable {
        Assert.assertEquals(true,myDriver.getTitle().contains("Facebook"));
        System.out.println("Page Title: " + myDriver.getTitle() + "\n");
    }

    @Then("^I enter email address$")
    public void i_enter_email_address() throws Throwable {
        //Identify where is the driver or contest of the driver
//        fPO.PO(myDriver);
        fPO.FacebookPO(myDriver);
        fPO.emailid.isDisplayed();
        System.out.println("Boolean value of isDisplayed: " + fPO.emailid.isDisplayed());
        fPO.emailid.sendKeys("selenium@gmail.com");
        System.out.println("EmailId entered in text box\n");
        fPO.radioButton.click();
        System.out.println("Radio Button Selected\n");
        Log.info("I am in Facebook THEN");
//        cSS.capScrSht(myDriver, "Scenario_");
//        fPO.FBPO(myDriver);
    }

    @Then("^I enter (.*) from spreadsheet$")
    public void i_enter_email_from_spreadsheet(String email) throws Throwable {
        ssR.readSpreadsheet("TestData.xlsx","PRE");
        fPO.FacebookPO(myDriver);
        fPO.emailid.isDisplayed();
        fPO.emailid.sendKeys(email);
    }

    @And("^I click on Forgotten Account Link$")
    public void i_click_on_Forgotten_Account() throws Throwable{
        fPO.FacebookPO(myDriver);
        fPO.forgottenAccount.click();
        System.out.println("Clicked on Forgotten Account\n");
//        cSS.capScrSht(myDriver, "Scenario_");
    }

    @And("^click on back button$")
    public void click_on_back_button() throws Throwable{
          myDriver.navigate().back();
//        cSS.capScrSht(myDriver, "Scenario_");
    }

    @And("^I select Day Option$")
    public void i_select_Day_Option() throws Throwable{
        daySelect = new Select(fPO.dayOption);
        daySelect.selectByValue("1");

        monthSelect = new Select(fPO.monthOption);
        monthSelect.selectByValue("7");

        yearSelect = new Select(fPO.yearOption);
        yearSelect.selectByValue("1982");

//        cSS.capScrSht(myDriver, "Scenario_");
    }

    @And("^I perform key actions$")
        public void I_perform_key_actions() throws Throwable{
        fPO.FacebookPO(myDriver);
        fPO.myActions(myDriver);
//        cSS.capScrSht(myDriver, "Scenario_");
    }

    @And("^I quit browser$")
    public void i_quit_browser() throws Throwable{
        myDriver.quit();
        System.out.println("Browser is closed\n");
    }

}
