package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static steps.Hooks.myDriver;

public class SantanderPO {

    WebElement onlineBankingVideo;
    WebElement termsAndConditions;
    WebElement homePagePopUp;
    WebElement popUpClose;

    Wait wait = new WebDriverWait(myDriver,10);

    public void SantanderPO(WebDriver myDriver){

        homePagePopUp = myDriver.findElement(By.xpath("//div[@id ='splash-97123-body']"));
        popUpClose = myDriver.findElement(By.xpath("//div[@title='Close']"));
        onlineBankingVideo = myDriver.findElement(By.xpath("//a[text()='View Online Banking videos']"));

        termsAndConditions = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Changes to Online and Mobile Banking Terms and Conditions']")));

//        termsAndConditions = myDriver.findElement(By.xpath("//a[text()='Changes to Online and Mobile Banking Terms and Conditions']"));
    }
}
