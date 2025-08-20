package Pages;

import Elements.PIMPageElement;
import Initialization.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Random;

public class PIMPage extends PIMPageElement {
    WebDriver driver;

    public PIMPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static String firstname;
    public static String middlename;
    public static String lastname;
    public static int employeeIdNumber;

    public void PIMPageMethod() throws InterruptedException {
        //CLick on PIM
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf((PIMButton)));
//    Thread.sleep(5000);
        PIMButton.click();

        //Click on Add button
        wait.until(ExpectedConditions.visibilityOf((AddButton)));
        AddButton.click();

        wait.until(ExpectedConditions.visibilityOf((firstName)));
        DriverSetUp driverSetUp = new DriverSetUp();

        //FirstName
        firstname = driverSetUp.randomString();
        firstName.sendKeys(firstname);
        System.out.println("First name: " + firstname);


        //MiddleName
        middlename = driverSetUp.randomString();
        middleName.sendKeys(middlename);
        System.out.println("Middle name: " + middlename);

        //LastName
        lastname = driverSetUp.randomString();
        lastName.sendKeys(lastname);
        System.out.println("Last name: " + lastname);

        //EmployeeID
        employeeIdNumber = driverSetUp.randomNumber();
        employeeID.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        employeeID.sendKeys(String.valueOf(employeeIdNumber));
        System.out.println("Employee ID: " + employeeIdNumber);

//    //Upload user photo
        String filePath = "C:\\Users\\bhendalea\\Downloads\\Google.jpg";
        uploadPic.sendKeys(filePath);

//    Click on Torrle button
        TurnOn.click();

        //Add Username
        wait.until(ExpectedConditions.visibilityOfAllElements(userName));
        Random random = new Random();
        String user = "Test" + driverSetUp.randomNumber();

        userName.sendKeys(user);

        //Add Password
        String pass = "pass@" + driverSetUp.randomNumber();
        passWord.sendKeys(pass);

        //Confirm Password
        confPass.sendKeys(pass);

        //Click on Save button
        saveButton.click();

        //Message
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.isDisplayed(), "Employee was not added successfully.");
        System.out.println("User has been created: " + successMessage.getText());


    }

}
