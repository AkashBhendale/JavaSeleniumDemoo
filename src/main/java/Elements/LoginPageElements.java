package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {
    //UserName
    @FindBy(xpath = "//input[@name='username']")
    public WebElement Username;

    //Password
    @FindBy(xpath = "//input[@name='password']")
    public WebElement Password;

    //Login Button
    @FindBy(xpath ="(//div[@class='oxd-form-row'])[2]/following-sibling::div/button")
    public WebElement LoginButton;
}
