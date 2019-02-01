package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPO {

    WebElement emailid;
    WebElement password;
    WebElement login;
    WebElement radioButton;
    WebElement forgottenAccount;
//    WebElement firstName;
//    WebElement surnameName;

//    public void PO(WebDriver myDriver){

    public void FacebookPO(WebDriver myDriver){

         emailid = myDriver.findElement(By.xpath("//input[@id='email']"));
//         emailid = myDriver.findElement(By.id("email"));

         password = myDriver.findElement(By.xpath("//input[@type='password' and @name='pass']"));
//        password = myDriver.findElement(By.id("pass"));

        radioButton = myDriver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
        forgottenAccount = myDriver.findElement(By.xpath("//a[text()='Forgotten account?']"));
//
//         firstName = myDriver.findElement(By.id("u_0_j"));
//         surnameName = myDriver.findElement(By.id("u_0_l"));
    }

    public void FBPO(WebDriver myDriver){
        login = myDriver.findElement(By.id("loginbutton"));
    }
}
