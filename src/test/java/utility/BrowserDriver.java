package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;


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











//public class BrowserDriver {
// public static WebDriver driver;
//
//@Before
//    public  void init() {
//
//        if (driver == null) {
//            driver = new ChromeDriver();
//            driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
//            driver.manage().window().maximize();
//
//        }
//    }
//
//    @After
//    public  void close() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }
//
//}
