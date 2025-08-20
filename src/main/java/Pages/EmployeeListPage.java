package Pages;

import Elements.EmployeeListElements;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class EmployeeListPage extends EmployeeListElements {
    WebDriver driver;

    public EmployeeListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchAndValidateEmployee(String employName, int empID) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        employeeList.click();

        //Add Employee Name
        wait.until(ExpectedConditions.visibilityOf(employeeName));
        employeeName.sendKeys(employName);
        System.out.println("Employee Name: " + employName);

        //Add Employee ID
        employID.sendKeys(String.valueOf(empID));
        System.out.println("Employee ID: " + empID);

        //Click on search button
        searchButton.click();

        //Wait for result table to load
        try {
            wait.until(ExpectedConditions.visibilityOf(loader));
            wait.until(ExpectedConditions.invisibilityOf(loader));
        } catch (TimeoutException ignored) {
            // Loader didn't appear — continue execution
        }

        //Verify the added employee details
        wait.until(ExpectedConditions.visibilityOf(expectedEmployee));
        String actualDisplayedId = expectedEmployee.getText().trim();
        String expectedId = String.valueOf(empID);

        // Print both for debug
        System.out.println("Expected Employee ID: " + expectedId);
        System.out.println("Displayed Employee ID: " + actualDisplayedId);

        Assert.assertEquals(actualDisplayedId, expectedId, "Employee ID does NOT match!");


//        List<WebElement> employeeRows = employeeRow;
//        for (WebElement row: employeeRows){
//            WebElement firstName = row.findElement(By.xpath("./div[3]"));
//            WebElement checkboxRow = row.findElement(By.xpath("./div[1]"));
//
//            String name = firstName.getText();
//            if(name.contains(employName)){
//
//               checkboxRow.click();
//
//               //Delete the Employee
//                wait.until(ExpectedConditions.elementToBeClickable(deleteEmployee));
//                deleteEmployee.click();
//
//                //Confirmation
//                wait.until(ExpectedConditions.elementToBeClickable(deleteConfirm));
//                deleteConfirm.click();
//
//                //Delete message
//                wait.until(ExpectedConditions.elementToBeClickable(deleteMessage));
//                System.out.println(deleteMessage.getText());
//
//                //Add Employee Name
//                wait.until(ExpectedConditions.visibilityOf(employeeName));
//                employeeName.sendKeys(employName);
//                System.out.println("Employee Name: " + employName);
//
//                //Add Employee ID
//                employID.sendKeys(String.valueOf(empID));
//                System.out.println("Employee ID: " + empID);
//
//                //Click on search button
//                searchButton.click();
//
//              // Check info
//                wait.until(ExpectedConditions.visibilityOf(infoMessage));
//                infoMessage.getText();
//                System.out.println(infoMessage.getText());
//
//               break;
//
//            }
//        }

        }

    }

