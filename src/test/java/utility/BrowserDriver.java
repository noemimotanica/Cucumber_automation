package utility;

import io.cucumber.java.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserDriver {
 public static WebDriver driver;

@Before
    public  void init() {

        if (driver == null) {
            driver = new ChromeDriver();
            driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
            driver.manage().window().maximize();

        }
    }

    @After
    public  void close() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
