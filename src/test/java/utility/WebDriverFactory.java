package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;

// Factory Pattern

public class WebDriverFactory {

    public static WebDriver getDriver() throws IOException {

        WebDriver driver = null;

        String browser = System.getProperty("browser", "chrome");

        // which is chrome

        if (driver == null) {


            switch (browser) {


                case "chrome" -> {

                    WebDriverManager.chromedriver().setup();


                    driver = new ChromeDriver();

                }

                case "safari" -> {

                    WebDriverManager.safaridriver().setup();

                    driver = new SafariDriver();

                }

                case "firefox" -> {

                    WebDriverManager.firefoxdriver().setup();

                    driver = new FirefoxDriver();
                }

            }

        }
    }

}