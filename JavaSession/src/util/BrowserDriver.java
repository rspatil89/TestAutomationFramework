package util;

public class BrowserDriver {
    public static void startBrowser(String browserName){
        Controller.setWebDriver(browserName);
    }

    public  static void maximizeBrowser(){
        Controller.getWebDriver().manage().window().maximize();
    }

    public static void accessURL(String url){
        Controller.getWebDriver().get(url);
    }

    public static void stopBrowser(){

            Controller.getWebDriver().quit();

    }
}
