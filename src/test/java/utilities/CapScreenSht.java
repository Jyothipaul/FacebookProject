package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CapScreenSht {

    public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
    }

    public void capScrSht(WebDriver driver, String screenShotName){

//      Typecast screenshot
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(source,new File("./src/test/Screenshots/"+screenShotName+timestamp()+".png"));
//            FileUtils.copyFile(source,new File("./src/test/Screenshots/"+screenShotName+System.nanoTime()+".png"));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
