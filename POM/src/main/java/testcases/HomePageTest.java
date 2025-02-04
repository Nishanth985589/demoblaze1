package testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import windows.POM.loginPage;
import windows.POM.Homepage;

public class HomePageTest {

    WebDriver driver = new ChromeDriver();
    loginPage login = new loginPage();
    Homepage homePage = new Homepage();

    @Test
    public void testProductCategoriesDisplay() {
        driver.get("https://www.demoblaze.com/");
        login.enterCredentials("NewUsser", "password");
        login.submitLogin();
        homePage.openMonitorsCategory();
        homePage.openMonitorsCategory();
        homePage.verifyProductDetails();
    }}

