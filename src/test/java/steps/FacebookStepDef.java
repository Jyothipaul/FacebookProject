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

    @Given("^As a chrome user$")
    public void as_a_chrome_user() throws Throwable {

        System.setProperty("webdriver.chrome.driver",cFR.getDriverPath());
        System.out.println("Chrome browser launched");
        Log.info("I am in Facebook GIVEN");
    }

    @When("^I access Facebook page$")
    public void i_access_Facebook_page() throws Throwable {

//        myDriver.manage().window().maximize();
        myDriver.get(cFR.getApplicationUrl());
        System.out.println("\nFacebook page launched in Chrome browser");
        System.out.println("Page Title: " + myDriver.getTitle() + "\n");
        Log.info("I am in Facebook WHEN");
    }

    @Then("^I see the Facebook Home page$")
    public void i_see_the_Facebook_Home_page() throws Throwable {

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

//        fPO.FBPO(myDriver);
    }

    @And("^I click on Forgotten Account Link$")
    public void i_click_on_Forgotten_Account() throws Throwable{
        fPO.forgottenAccount.click();
        System.out.println("Click on Forgotten Account\n");
        myDriver.navigate().back();
        Assert.assertEquals(true,myDriver.getTitle().contains("Facebook"));
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
        fPO.myActions(myDriver);
        cSS.capScrSht(myDriver, "Scenario_");
    }

    @And("^I quit browser$")
    public void i_quit_browser() throws Throwable{
        myDriver.quit();
        System.out.println("Browser is closed\n");
    }

}
