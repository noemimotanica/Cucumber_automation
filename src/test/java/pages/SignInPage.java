package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class SignInPage {


    public static String username_text="//input[@id='usr']";
    public static String password_text="//input[@id='pwd']";
    public static String login_btn="//input[@value='Login']";
    public static String registration_btn="//button[@id='NewRegistration']";


    public static void sendKeys_username() {
        driver.findElement(By.xpath(username_text)).sendKeys("sam");

    }


    public static void sendKeys_password() {
    driver.findElement(By.xpath(password_text)).sendKeys("alex");

    }

    public static void click_loginBtn() {
        driver.findElement(By.xpath(login_btn)).click();

    }

    public static void click_registrationBtn() {
        driver.findElement(By.xpath(registration_btn)).click();

    }


}




