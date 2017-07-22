package tests_amazon;

import amazon.HomePage;
import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonHomePageTest {
    WebDriver driver;

    @BeforeTest
    public  void setup(){
        driver = new Browser().open("ff");
    }

    @Test
    public void go_to_home_page(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.open("url");


    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }

}
