package Pages;

import Elements.DashboardElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage extends DashboardElements {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyDashboardAndLogout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(dashboardButton));
        //Click on Dashboard option
        dashboardButton.click();

        //Verify Title of current page
        wait.until(ExpectedConditions.visibilityOf(title));
        System.out.println(title.getText());

        //Verify the Logged User name
        System.out.println(loggedUser.getText());

        //Logout the user using dropdown
        userDropdown.click();

        logOut.click();


    }


}
