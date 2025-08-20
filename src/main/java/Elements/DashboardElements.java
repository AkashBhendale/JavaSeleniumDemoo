package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardElements {

    @FindBy(xpath = "//span[text()='Dashboard']")
    public WebElement dashboardButton;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    public WebElement title;

    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    public WebElement loggedUser;

    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    public WebElement userDropdown;

    @FindBy(xpath = "(//a[@class='oxd-userdropdown-link'])[4]")
    public WebElement logOut;
}
