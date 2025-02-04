package testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import windows.POM.loginPage;
import windows.POM.Productdetails;

public class details {

    WebDriver driver = new ChromeDriver();
    loginPage login = new loginPage();
    Productdetails addcart = new Productdetails();

    @Test
    public void testAddNexus6ToCart() {
        driver.get("https://www.demoblaze.com/");
        login.enterCredentials("NewUser", "password");
        login.submitLogin();
        addcart.openNexus6Product();
        addcart.addNexus6ToCart();
    }}

