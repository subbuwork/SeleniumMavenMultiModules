package test;

import browserfactory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserFactoryTest {

    BrowserFactory browserFactory;
    WebDriver webDriver;

   @BeforeTest
    public void setup(){
        browserFactory = new BrowserFactory();
        webDriver = browserFactory.open_browser("edge");
    }

    @Test
    public void test_browser(){
        webDriver.get("https://www.amazon.com");
        System.out.println(webDriver.getTitle());
    }

    @AfterTest
    public void teardown(){
        webDriver.close();
        webDriver.quit();
    }
}
