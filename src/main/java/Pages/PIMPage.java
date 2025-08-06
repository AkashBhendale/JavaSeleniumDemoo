package Pages;

import Elements.PIMPageElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class PIMPage extends PIMPageElement {
    WebDriver driver;
    public PIMPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
public void PIMPageMethod() throws InterruptedException {
    //CLick on PIM
    WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOf((PIMButton)));
//    Thread.sleep(5000);
    PIMButton.click();

    //Click on Add button
    wait.until(ExpectedConditions.visibilityOf((AddButton)));
    AddButton.click();

    //FirstName
    wait.until(ExpectedConditions.visibilityOf((firstName)));
    Random random1 = new Random();
    String name = random1.toString();
    firstName.sendKeys(name);

    //MiddleName
    middleName.sendKeys(name);

    //LastName
    lastName.sendKeys(name);

    //EmployeeID
    employeeID.sendKeys("R001");

    //Click on Torrle button
    TurnOn.click();

    //Add Username
    wait.until(ExpectedConditions.visibilityOfAllElements(userName));
    Random random = new Random();
    int randomNumber = random.nextInt(1000);
    String user = "user" + randomNumber;

    userName.sendKeys(user);

    //Add Password
    String pass = "pass@" + randomNumber;
    passWord.sendKeys(pass);

    //Confirm Password
    confPass.sendKeys(pass);

    //Click on Save button
    saveButton.click();

    //Message
    wait.until(ExpectedConditions.visibilityOf(successMessage));
    System.out.println("User has been created: " + successMessage.getText());

}

}
