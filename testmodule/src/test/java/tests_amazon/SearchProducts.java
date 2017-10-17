package tests_amazon;

import amazon.HomePage;
import amazon.SearchPage;
import amazon.ShoppingCartPage;
import browser.Browser;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchProducts {
    Logger logger = Logger.getLogger(this.getClass());
    WebDriver webDriver;

    public SearchProducts(){}

    @BeforeTest
    public void setup(){

        webDriver = new Browser().open("ff");
        webDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @AfterTest
    public void teardown(){
        webDriver.quit();
    }

    @Test
    public void logged_out_user_can_search_product(){
        HomePage homePage = PageFactory.initElements(webDriver,HomePage.class);
        homePage.open("url");
        SearchPage search = PageFactory.initElements(webDriver,SearchPage.class);
        search.product("Ferrari 458");
    }

    @Test
    public void logged_out_user_can_select_product_from_search_list() throws Exception{
        logger.info("Inside logged_out_user_can_select_product_from_search_list() method.");
        HomePage homePage = PageFactory.initElements(webDriver,HomePage.class);
        homePage.open("url");
        SearchPage search = PageFactory.initElements(webDriver,SearchPage.class);
        search.product("Ferrari 458");
        //Thread.sleep(2);
        search.select_product();

    }

    @Test
    public void logged_out_user_can_add_product_to_cart() throws Exception{
        logger.info("Inside logged_out_user_can_select_product_from_search_list() method.");
        HomePage homePage = PageFactory.initElements(webDriver,HomePage.class);
        homePage.open("url");
        SearchPage search = PageFactory.initElements(webDriver,SearchPage.class);
        search.product("Ferrari 458");
        //Thread.sleep(3); testing purpose only
        search.select_product();
        //Thread.sleep(1);
        search.add_product_to_cart();

    }

    @Test
    public void logged_out_user_can_verify_shopping_cart() throws Exception{
        logger.info("Inside logged_out_user_can_verify_shopping_cart() method.");
        HomePage homePage = PageFactory.initElements(webDriver,HomePage.class);
        homePage.open("url");
        SearchPage search = PageFactory.initElements(webDriver,SearchPage.class);
        search.product("Ferrari 458");
        //Thread.sleep(3);
        search.select_product();
        //Thread.sleep(2);
        search.add_product_to_cart();
        ShoppingCartPage cart = PageFactory.initElements(webDriver,ShoppingCartPage.class);
        cart.verify_cart();


    }

    @Test
    public void user_should_login_to_check_out() throws Exception{
        logger.info("Inside user_should_login_to_check_out() method.");
        HomePage homePage = PageFactory.initElements(webDriver,HomePage.class);
        homePage.open("url");
        SearchPage search = PageFactory.initElements(webDriver,SearchPage.class);
        search.product("Ferrari 458");
        Thread.sleep(4);
        search.select_product();
        //Thread.sleep(2);
        search.add_product_to_cart();
        ShoppingCartPage cart = PageFactory.initElements(webDriver,ShoppingCartPage.class);
        cart.verify_cart();
        //Thread.sleep(1);
        cart.proceed_to_check_out();


    }







}
