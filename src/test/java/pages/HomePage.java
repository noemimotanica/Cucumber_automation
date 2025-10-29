package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class HomePage {

    public static String hamburger_menu="//input[@type='checkbox']";
    public static String signIn_portal="//li[normalize-space()='Sign In Portal']";

    public static void click_hamburger_menu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu)).click();

    }

    public static void click_signIn_portal() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(signIn_portal)).click();
    }
}
