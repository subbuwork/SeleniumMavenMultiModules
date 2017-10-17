package tests_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAutoIt {

    public static void main(String args[]) throws Exception{
        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver","E:\\Softwares\\Selenium\\drivers\\geckodriver.exe");
        driver.get("http://demo.automationtesting.in/Register.html");

        driver.findElement(By.id("imagesrc")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\subbu\\Desktop\\AutoIt\\FileUpload.exe");
        Thread.sleep(2000);
        driver.quit();
    }
}
