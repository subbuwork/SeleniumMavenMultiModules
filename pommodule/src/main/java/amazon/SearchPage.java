package amazon;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage {

    Logger logger = Logger.getLogger(this.getClass());

    WebDriver webDriver;

    public SearchPage(WebDriver driver){
        this.webDriver = driver;
    }

    @FindBy(how = How.ID,using = "twotabsearchtextbox")
    WebElement search_box;

    @FindBy(how = How.XPATH, using = "//div[@id='nav-search']/form/div[2]/div/input")
    WebElement click_on_search_button;

    @FindBy(how = How.XPATH, using = "//ul[@id='s-results-list-atf']/li[1]/div/div[2]/div/div/a")
    WebElement product;

    @FindBy(how = How.ID, using = "add-to-cart-button")
    WebElement cart;

    public void product(String searchTerm){
        logger.info("Search Term::"+searchTerm);
        search_box.sendKeys(searchTerm);
        click_on_search_button.click();
    }

    public void select_product(){
     logger.info("Inside select_product() method..");
     product.click();
    }

    public void add_product_to_cart(){
        logger.info("Inside add_product_to_cart()...");
        cart.click();
    }
}
