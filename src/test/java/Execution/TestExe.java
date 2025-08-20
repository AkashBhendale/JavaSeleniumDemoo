package Execution;

import Initialization.DriverSetUp;
import Pages.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static Pages.PIMPage.employeeIdNumber;
import static Pages.PIMPage.firstname;

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

    @Test(priority = 3)
    public void EmployeeList(){
        EmployeeListPage searchList = new EmployeeListPage(driver);
        searchList.searchAndValidateEmployee(firstname , employeeIdNumber);
    }

    @Test(priority = 5)
    public void verifyDashboardAndLogoutMethod(){
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.verifyDashboardAndLogout();
    }

    @Test(priority = 4)
    public void editEmployeeData() throws InterruptedException {
        EditEmployeePage editEmployeePage = new EditEmployeePage(driver);
        editEmployeePage.editemployeeMethod(firstname);
    }

}
