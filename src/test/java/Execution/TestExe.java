package Execution;

import Initialization.DriverSetUp;
import Pages.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestExe extends DriverSetUp{
    @Test
    @Parameters({"userName", "passWord"})
    public void LogInT1est(String uName , String pWord){
        LoginPage login = new LoginPage(driver);
        login.loginPageMethod(uName , pWord);
    }
}
