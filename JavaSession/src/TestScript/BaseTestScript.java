package TestScript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.BrowserDriver;
import util.PropertyReader;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class BaseTestScript {
    static String username;
    static String password;
    static Map <String,String> dataMap= PropertyReader.getTestData("gmailLogin");
    @BeforeMethod
    public void beforeMEthod(){
        try {

            BrowserDriver.startBrowser("chrome");
            BrowserDriver.maximizeBrowser();
            BrowserDriver.accessURL(dataMap.get("Gmailurl"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void terminate(){
        BrowserDriver.stopBrowser();
    }
}
