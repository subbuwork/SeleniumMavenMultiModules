package amazon;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartPage {

    Logger logger = Logger.getLogger(this.getClass());

    WebDriver webDriver;
    public ShoppingCartPage(WebDriver driver){
        this.webDriver = driver;
    }

    @FindBy(how = How.ID, using = "hlb-view-cart-announce")
    WebElement cart;

    @FindBy(how = How.XPATH,using = "//span[@id='sc-buy-box-ptc-button']/span/input")
    WebElement proceed_to_check_out;

    public void verify_cart(){
        cart.click();
    }

    public void proceed_to_check_out(){
        proceed_to_check_out.click();
    }

}
