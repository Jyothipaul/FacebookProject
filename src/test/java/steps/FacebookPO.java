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
    WebElement  dayOption;
    WebElement  monthOption;
    WebElement  yearOption;
//    WebElement firstName;
//    WebElement surnameName;

//    public void PO(WebDriver myDriver){

    public void FacebookPO(WebDriver myDriver){

         emailid = myDriver.findElement(By.xpath("//input[@id='email']"));
         password = myDriver.findElement(By.xpath("//input[@type='password' and @name='pass']"));
        radioButton = myDriver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
        forgottenAccount = myDriver.findElement(By.xpath("//a[text()='Forgotten account?']"));
        login = myDriver.findElement(By.id("loginbutton"));

//        dayOption = myDriver.findElement(By.id("day"));
        dayOption = myDriver.findElement(By.xpath("//select[@id='day' and @name='birthday_day']"));
//        dayOption = myDriver.findElement(By.xpath("//select[@id='day']"));

        monthOption =  myDriver.findElement(By.xpath("//select[@id='month']"));
        yearOption =  myDriver.findElement(By.xpath("//select[@id='year']"));

//        password = myDriver.findElement(By.id("pass"));
//         emailid = myDriver.findElement(By.id("email"));
//         firstName = myDriver.findElement(By.id("u_0_j"));
//         surnameName = myDriver.findElement(By.id("u_0_l"));
    }

    public void FBPO(WebDriver myDriver){
        login.click();
    }

//    public void selectDayOption(WebDriver myDriver){
//        dayOption = myDriver.findElement(By.xpath("//input[@id='day']"));
//        dayOption=myDriver.findElement(By.id("day"));
//    }
}
