package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EditEmployeeElements {

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")
    public WebElement expectedEmployee;

    @FindBy(xpath = "//div[contains(@class,'oxd-table-row--clickable' ) and @role='row']")
    public List<WebElement> employeeRow;

    @FindBy(xpath = "//i[contains(@class, 'bi-pencil-fill')]")
    public WebElement editIcon;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 --strong']")
    public WebElement checkEmployeeName;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement updatedName;

    @FindBy(xpath = "//input[@name='middleName']")
    public WebElement updatedMiddle;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement updatedLast;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='oxd-toast-start']")
    public WebElement updatedMessage;

    @FindBy(xpath = "//div[contains(@class,'oxd-loading-spinner-container')]//div[contains(@class,'oxd-loading-spinner')]")
    public WebElement loader;

}

