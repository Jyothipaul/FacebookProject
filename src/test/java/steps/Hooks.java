package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigFileReader;

public class Hooks {

//    as its static its flexible
    static WebDriver myDriver;
    static ConfigFileReader cFR = new ConfigFileReader();

    @Before
    public void beforeScenario(){
//        System.setProperty("webdriver.chrome.driver","C:\\SeleniumSetup\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",cFR.getDriverPath());
        myDriver = new ChromeDriver();
    }

    @After
    public void afterScenario(){
        myDriver.quit();
    }
}
