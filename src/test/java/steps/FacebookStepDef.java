package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigFileReader;

public class FacebookStepDef {

//    as its static its flexible
    static WebDriver myDriver;

//    This gives error as the driver is not yet initialised.
//    FacebookPO facebookPO = new FacebookPO();
    FacebookPO fPO  = new FacebookPO();
    ConfigFileReader cFR = new ConfigFileReader();


    @Given("^As a chrome user$")
    public void as_a_chrome_user() throws Throwable {
//        System.setProperty("webdriver.chrome.driver","C:\\SeleniumSetup\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",cFR.getDriverPath());
        myDriver = new ChromeDriver();
        System.out.println("Chrome browser launched");
    }

    @When("^I access Facebook page$")
    public void i_access_Facebook_page() throws Throwable {

//        myDriver.get("https://www.facebook.com/");
        myDriver.get(cFR.getApplicationUrl());
        System.out.println("\nFacebook page launched in Chrome browser");
        System.out.println("Page Title: " + myDriver.getTitle() + "\n");
    }

    @Then("^I see the Facebook Home page$")
    public void i_see_the_Facebook_Home_page() throws Throwable {

        //Identify where is the driver or contest of the driver

//        fPO.PO(myDriver);
        fPO.FacebookPO(myDriver);
        fPO.emailid.isDisplayed();
        System.out.println("Boolean value of isDisplayed: " + fPO.emailid.isDisplayed());
        fPO.emailid.sendKeys("selenium@gmail.com");
        fPO.FBPO(myDriver);
        fPO.login.click();
        myDriver.quit();
        System.out.println("Browser is closed\n");
    }

}
