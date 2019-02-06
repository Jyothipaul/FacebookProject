package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import static steps.Hooks.myDriver;

public class SantanderPO {

    WebElement onlineBankingVideo;
    WebElement termsAndConditions;
    WebElement homePagePopUp;
    WebElement popUpClose;

    public void SantanderPO(WebDriver myDriver){

        homePagePopUp = myDriver.findElement(By.xpath("//div[@id ='splash-97123-body']"));
        popUpClose = myDriver.findElement(By.xpath("//div[@title='Close']"));
        onlineBankingVideo = myDriver.findElement(By.xpath("//a[text()='View Online Banking videos']"));
        termsAndConditions = myDriver.findElement(By.xpath("//a[text()='Changes to Online and Mobile Banking Terms and Conditions']"));
    }
}
