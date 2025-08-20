package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMPageElement {

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")
    public WebElement PIMButton;

    @FindBy(xpath = "//button[text()=' Add ']")
    public WebElement AddButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='middleName']")
    public WebElement middleName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//label[text()='Employee Id']//parent::div/following-sibling::*[1]//input")
    public WebElement employeeID;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadPic;

    @FindBy(xpath = "//p[text()='Create Login Details']/following-sibling::div/label")
    public  WebElement TurnOn;

    @FindBy(xpath = "(//input[@autocomplete='off'])[1]")
    public WebElement userName;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passWord;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement confPass;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id='oxd-toaster_1']/div")
    public WebElement successMessage;

}
