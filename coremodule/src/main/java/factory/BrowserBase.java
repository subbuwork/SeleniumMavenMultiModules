package factory;

import org.openqa.selenium.WebDriver;

public abstract class BrowserBase {
    public abstract WebDriver open_browser(String browser_name);
}
