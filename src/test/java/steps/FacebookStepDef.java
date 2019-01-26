package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookStepDef {

    WebDriver myDriver;
    WebElement emailid;
    WebElement password;
    WebElement firstName;
    WebElement secondName;

    @Given("^As a chrome user$")
    public void as_a_chrome_user() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumSetup\\chromedriver.exe");
        myDriver = new ChromeDriver();
        System.out.println("Chrome browser launched");

    }

    @When("^I access Facebook page$")
    public void i_access_Facebook_page() throws Throwable {

        myDriver.get("https://www.facebook.com/");
        System.out.println("\nFacebook page launched in Chrome browser");
        System.out.println("Page Title: " + myDriver.getTitle() + "\n");
        Assert.assertEquals(true,myDriver.getTitle().contains("Facebook"));

    }

    @Then("^I see the Facebook Home page$")
    public void i_see_the_Facebook_Home_page() throws Throwable {
        emailid = myDriver.findElement(By.id("email"));
        password = myDriver.findElement(By.id("pass"));
        firstName = myDriver.findElement(By.id("u_0_j"));
        secondName = myDriver.findElement(By.id("u_0_l"));
        Assert.assertEquals(true,emailid.isDisplayed());
        Assert.assertEquals(true,password.isDisplayed());
        Assert.assertEquals(true,firstName.isDisplayed());
        Assert.assertEquals(true,secondName.isDisplayed());

        myDriver.quit();
        System.out.println("Browser is closed\n");
    }

}
