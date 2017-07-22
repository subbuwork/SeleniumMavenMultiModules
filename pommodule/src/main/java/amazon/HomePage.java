package amazon;

import coreutils.ReadPoperties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class HomePage {
    Logger logger = Logger.getLogger(HomePage.class);
    WebDriver webDriver;
    ReadPoperties props;

    public HomePage(WebDriver driver){
        this.webDriver = driver;
        props = new ReadPoperties();
    }

    public void open(String url){
        logger.info("Inside go to home page method of "+logger.getClass().getName());
        webDriver.get(props.getValue(url));
    }


}
