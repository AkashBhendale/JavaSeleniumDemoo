package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {
    //UserName
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement Username;

    //Password
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement Password;

    //Login Button
    @FindBy(xpath ="(//div[@class='oxd-form-row'])[2]/following-sibling::div/button")
    public WebElement LoginButton;
}
