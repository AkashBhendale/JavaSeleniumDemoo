package Execution;

import Initialization.DriverSetUp;
import Pages.LoginPage;
import Pages.PIMPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestExe extends DriverSetUp{
    @Test(priority = 1)
    @Parameters({"userName", "passWord"})
    public void LogInTest(String uName , String pWord){
        LoginPage login = new LoginPage(driver);
        login.loginPageMethod(uName , pWord);
    }

    @Test(priority = 2)
    public void AddEmployee() throws InterruptedException {
       PIMPage addEmployee = new PIMPage(driver);
       addEmployee.PIMPageMethod();
    }

}
