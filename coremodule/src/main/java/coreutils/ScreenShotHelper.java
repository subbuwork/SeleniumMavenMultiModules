package coreutils;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotHelper {

    Logger logger = Logger.getLogger(ScreenShotHelper.class);
    private ReadPoperties poperties;

    public ScreenShotHelper(){
        poperties = new ReadPoperties();
    }

    public void takescreenshot(WebDriver webDriver,String screenshot_name){
        logger.info("Inside takeScreenshot() method of "+logger.getClass().getName());
        TakesScreenshot screenshot = (TakesScreenshot)webDriver;
        try {
            File file = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File(poperties.getValue("screenshot_location")+screenshot_name+".jpeg"));

        }catch (IOException ex){
            ex.printStackTrace();
        }
        }

}
