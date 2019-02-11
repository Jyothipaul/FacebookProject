package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigFileReader;
import utilities.Log;

import java.util.concurrent.TimeUnit;

public class Hooks {

//    as its static its flexible
    static WebDriver myDriver;
    static ConfigFileReader cFR = new ConfigFileReader();

    @Before
    public void beforeScenario(){
//        System.setProperty("webdriver.chrome.driver","C:\\SeleniumSetup\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",cFR.getDriverPath());
        myDriver = new ChromeDriver();
        myDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        Log.startTestCase("Find the Id's for Facebook page");
    }

    @After
    public void afterScenario(){
        myDriver.quit();
        Log.endTestCase("Find the Id's for Facebook page");
    }

}
