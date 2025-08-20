package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EmployeeListElements {

    @FindBy(xpath = "//a[text()='Employee List']")
    public WebElement employeeList;

    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    public WebElement employeeName;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement employID;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")
    public WebElement expectedEmployee;

    @FindBy(xpath = "//div[contains(@class,'oxd-loading-spinner-container')]//div[contains(@class,'oxd-loading-spinner')]")
    public WebElement loader;

    @FindBy(xpath = "//div[contains(@class,'oxd-table-row--clickable' ) and @role='row']")
    public List<WebElement> employeeRow;

    @FindBy(xpath = "//i[@class='oxd-icon bi-trash-fill oxd-button-icon']")
    public WebElement deleteEmployee;

    @FindBy(xpath = "//i[@class='oxd-icon bi-trash oxd-button-icon']")
    public WebElement deleteConfirm;

    @FindBy(xpath = "//div[@class='oxd-toast-start']")
    public WebElement deleteMessage;

    @FindBy(xpath = "//div[contains(@class, 'oxd-toast-content--info')]")
    public WebElement infoMessage;
}

