package TestScript;

import PageController.LoginPage;
import org.testng.annotations.Test;

public class Login_TestCase extends BaseTestScript {

    @Test
    public void correctLogin() {
        try {
            LoginPage.login(dataMap.get("email"),dataMap.get("passwd"));
            Thread.sleep(5000);
            LoginPage.logout();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
