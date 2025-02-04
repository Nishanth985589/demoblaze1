package testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import windows.POM.loginPage;
import windows.POM.cartfunction;
import windows.POM.purchase;

public class purchasetest {

    WebDriver driver = new ChromeDriver();
    loginPage login = new loginPage();
    cartfunction cart = new cartfunction();
    purchase order = new purchase();
    
    @Test
    public void testPurchaseFunctionality() {
        driver.get("https://www.demoblaze.com/");
        login.enterCredentials("NewUser", "Password");
        login.submitLogin();
        cart.cartbutton();
        order.placeorder();
        order.fillOrderDetails("NIshanth", "India", "Chennai", "1234567896321045", "15", "2027");
        order.placeorder();
    }}

