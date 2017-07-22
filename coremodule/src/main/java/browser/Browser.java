package browser;

import browserfactory.BrowserFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Browser {

     Logger logger = Logger.getLogger(Browser.class);
     BrowserFactory browserFactory;
     WebDriver webDriver;
    public  Browser(){
        browserFactory = new BrowserFactory();
    }

    public  WebDriver open(String browserName) {
        logger.info("Inside open_browser() of "+logger.getClass().getName());
        webDriver = browserFactory.open_browser(browserName);
        return webDriver;
    }
}
