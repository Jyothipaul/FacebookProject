package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPO {

    WebElement emailid;
    WebElement password;
    WebElement login;
//    WebElement firstName;
//    WebElement surnameName;

//    public void PO(WebDriver myDriver){

    public void FacebookPO(WebDriver myDriver){

         emailid = myDriver.findElement(By.id("email"));
         password = myDriver.findElement(By.id("pass"));
//         firstName = myDriver.findElement(By.id("u_0_j"));
//         surnameName = myDriver.findElement(By.id("u_0_l"));
    }

    public void FBPO(WebDriver myDriver){
        login = myDriver.findElement(By.id("loginbutton"));
    }
}
