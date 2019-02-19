package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.ConfigFileReader;
import utilities.Log;

import java.util.concurrent.TimeUnit;

public class Hooks {

//    as its static its flexible
    static WebDriver myDriver;
    public static ConfigFileReader cFR = new ConfigFileReader();
    static ChromeOptions options;


    @Before
    public void beforeScenario(Scenario scenario){
//        System.setProperty("webdriver.chrome.driver","C:\\SeleniumSetup\\chromedriver.exe");

        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver",cFR.getDriverPath());
        myDriver = new ChromeDriver(options);
        myDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        Log.startTestCase(scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario){
        myDriver.quit();
        Log.endTestCase(scenario.getName());
    }

}
