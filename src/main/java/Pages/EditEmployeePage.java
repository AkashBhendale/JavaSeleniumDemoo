package Pages;

import Elements.EditEmployeeElements;
import Initialization.DriverSetUp;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static Pages.PIMPage.*;

public class EditEmployeePage extends EditEmployeeElements {
    WebDriver driver;

    public EditEmployeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static String updateFirstname;
    public static String updateMiddlename;
    public static String updateLastname;

    public void editemployeeMethod(String employName) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> employeeRows = employeeRow;
        for (WebElement row : employeeRows) {
            wait.until(ExpectedConditions.visibilityOf(row.findElement(By.xpath("./div[3]"))));
            WebElement firstName = row.findElement(By.xpath("./div[3]"));
            WebElement checkboxRow = row.findElement(By.xpath("./div[1]"));

            String name = firstName.getText();
            if (name.contains(employName)) {

                //Click on edit Icon
                editIcon.click();
                wait.until(ExpectedConditions.invisibilityOf(loader));

                //Verify the name
                wait.until(ExpectedConditions.visibilityOf(checkEmployeeName));
                String disName = checkEmployeeName.getText();
                System.out.println("Display name: " + disName);
                System.out.println("Employee name: " + employName);
//                if (disName.contains(employName)) {
                    DriverSetUp driverSetUp = new DriverSetUp();

                    updateFirstname = driverSetUp.randomString();

                    wait.until(ExpectedConditions.visibilityOf(updatedName));
                    updatedName.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
                    updatedName.sendKeys(updateFirstname);
                    System.out.println("Updated First name: " + updateFirstname);

                    updateMiddlename = driverSetUp.randomString();
                    updatedMiddle.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
                    updatedMiddle.sendKeys(updateMiddlename);
                    System.out.println("Updated middle name: " + updateMiddlename);

                    updateLastname = driverSetUp.randomString();
                    updatedLast.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
                    updatedLast.sendKeys(updateLastname);
                    System.out.println("Updated last name: " + updateLastname);
                }
                saveButton.click();

                try {
                    wait.until(ExpectedConditions.invisibilityOf(loader));
                } catch (TimeoutException ignored) {
                }

                wait.until(ExpectedConditions.visibilityOf(updatedMessage));
                System.out.println(updatedMessage.getText());

//            }
        }
    }
}
