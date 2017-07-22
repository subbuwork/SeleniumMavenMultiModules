package browserfactory;

import coreutils.ReadPoperties;
import factory.BrowserBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFactory extends BrowserBase {
    Logger logger = Logger.getLogger(BrowserFactory.class);
    WebDriver webDriver;
    ReadPoperties props;

    public BrowserFactory(){
       props = new ReadPoperties();
    }

    public WebDriver open_browser(String browser_name) {
        logger.info("Inside open_browser() of"+logger.getClass().getName());
        logger.info("Browser name:::"+browser_name);

        if (browser_name.equalsIgnoreCase("gc")){
            logger.info("Opening chrome browser...");
            System.setProperty("webdriver.chrome.driver",props.getValue("gc"));
            webDriver = new ChromeDriver();
        }else if (browser_name.equalsIgnoreCase("ie")){
            logger.info("Opening IE browser..");
            System.setProperty("webdriver.ie.driver",props.getValue("ie"));
            webDriver = new InternetExplorerDriver();
        }else if (browser_name.equalsIgnoreCase("ff")){
            logger.info("Opening Fire Fox driver..");
            System.setProperty("webdriver.gecko.driver",props.getValue("ff"));
            webDriver = new FirefoxDriver();
        }else if (browser_name.equalsIgnoreCase("ed")){
            logger.info("Opening Edge driver..");
            System.setProperty("webdriver.edge.driver",props.getValue("ed"));
            webDriver = new EdgeDriver();
        }else if (browser_name.equalsIgnoreCase("op")){
            System.setProperty("webdriver.opera.driver",props.getValue("op"));
            webDriver = new OperaDriver();
        }

        else{
            logger.error("Please enter valid browser names like gc,ie,ff,ed  and try again...");
        }
        webDriver.manage().window().maximize();
        return webDriver;
    }
}
