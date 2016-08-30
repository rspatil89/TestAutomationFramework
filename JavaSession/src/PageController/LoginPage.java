package PageController;
import util.XMLReader;
import util.Controller;
import java.util.Map;

public class LoginPage extends  BasePage{

    public static void login(String username, String password){
        try {
            Controller.getWebElement(objectMap.get("username")).sendKeys(username);
            Controller.getWebElement(objectMap.get("nextButton")).click();
            Thread.sleep(2000);
            Controller.getWebElement(objectMap.get("password")).sendKeys(password);
            Controller.getWebElement(objectMap.get("signIn")).click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void logout(){
        try {
            Controller.getWebElement(objectMap.get("options")).click();
            Thread.sleep(1000);
            Controller.getWebElement(objectMap.get("signOut")).click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
