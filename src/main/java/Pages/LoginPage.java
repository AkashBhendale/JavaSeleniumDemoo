package Pages;

import Elements.LoginPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class LoginPage extends LoginPageElements {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginPageMethod(String userName , String passWord){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(Username));
        //Enter Username
        Username.sendKeys(userName);

        //Enter Password
        Password.sendKeys(passWord);

        //CLick on Login Button
        LoginButton.click();


    }
}
