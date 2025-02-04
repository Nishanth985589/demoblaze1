package testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import windows.POM.loginPage;

public class logintest {

    WebDriver driver = new ChromeDriver();
    loginPage loginpage = new loginPage();

    @Test
    public void testLogin() {
        driver.get("https://www.demoblaze.com/");
        loginpage.openLoginPage();
        loginpage.enterCredentials("validUser", "validPassword");
        loginpage.submitLogin();        
    }
}


