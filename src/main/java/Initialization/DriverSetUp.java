package Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.Random;

public class DriverSetUp {

    public static WebDriver driver;

    @BeforeClass
    @Parameters("URL")
    public void driverInitialize(String appURL) {
        driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void driverClose() {
        driver.close();
    }

    public String randomString() {
        Random random = new Random();
        return random.toString();
    }

    public int randomNumber() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}
