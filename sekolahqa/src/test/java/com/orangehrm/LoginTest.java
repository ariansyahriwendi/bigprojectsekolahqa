package com.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Login;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class LoginTest {
    WebDriver driver = Utils.getDriver();

    public LoginTest() throws IOException {
    }

    // Login with valid username and  valid password
    @Test
    public void loginWithValidUsernameAndValidPassword() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Login login = new Login(driver);
        login.inputEmail("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        Utils.closeWebsite();
    }

    // Login with valid username and  invalid password
    @Test
    public void loginWithValidUsernameandInvalidPassword() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Login login = new Login(driver);
        login.inputEmail("Admin");
        login.inputPassword("invalidpassword");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        Utils.closeWebsite();
    }

    // Login with invalid username and  valid password
    @Test
    public  void loginWithInvalidUsernameAndValidPassword() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Login login = new Login(driver);
        login.inputEmail("invalidusername");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        Utils.closeWebsite();
    }

    // Login with invalid username and  invalid password
    @Test
    public  void loginWithInvalidUsernameAndInvalidPassword() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Login login = new Login(driver);
        login.inputEmail("invalidusername");
        login.inputPassword("invalidpassword");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        Utils.closeWebsite();
    }

    // Login with valid username and  blank password
    @Test
    public  void loginWithValidUsernameAndBlankPassword() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Login login = new Login(driver);
        login.inputEmail("Admin");
        login.inputPassword("");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        Utils.closeWebsite();
    }

    // Login with blank username and  valid password
    @Test
    public  void loginWithBlankUsernameAndValidPassword() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Login login = new Login(driver);
        login.inputEmail("");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        Utils.closeWebsite();
    }

    // Login with invalid username and  blank password
    @Test
    public  void loginWithInvalidUsernameAndBlankPassword() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Login login = new Login(driver);
        login.inputEmail("invalidusername");
        login.inputPassword("");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        Utils.closeWebsite();
    }

    // Login with blank username and  invalid password
    @Test
    public  void loginWithBlankUsernameAndInvalidPassword() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Login login = new Login(driver);
        login.inputEmail("");
        login.inputPassword("invalidpassword");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        Utils.closeWebsite();
    }

    // Login with blank username and  blank password
    @Test
    public  void loginWithBlankUsernameAndBlankPassword() throws InterruptedException {
        Utils.openWebsite("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        Login login = new Login(driver);
        login.inputEmail("");
        login.inputPassword("");
        login.clickButtonLogin();
        login.userSeeErrorMessage();
        Utils.closeWebsite();
    }

}


