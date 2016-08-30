package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Controller {

    private static WebDriver webDriver=null;

    public static WebDriver getWebDriver(){
        return  webDriver;
    }

    public static void setWebDriver(String browserName){
        switch (browserName){
            case "chrome":
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/lib/chromedriver.exe");

                webDriver=new ChromeDriver();
                break;
            case "firefox":
                break;
        }
    }

    public static WebElement getWebElement(String locator){

        String locatorType=locator.split("_TBR_")[0];
        String locatorValue=locator.split("_TBR_")[1];
        WebElement element=null;

        switch (locatorType){
            case "xpath":
                element = getWebDriver().findElement(By.xpath(locatorValue));
                break;
            case "id":
                element = getWebDriver().findElement(By.id(locatorValue));
                break;
            case "name":
                element = getWebDriver().findElement(By.name(locatorValue));
                break;
        }
        return element;
    }

}
