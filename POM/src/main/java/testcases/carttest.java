package testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import windows.POM.loginPage;
import windows.POM.Productdetails;
import windows.POM.cartfunction;


public class carttest {

    WebDriver driver = new ChromeDriver();
    loginPage login = new loginPage();
    Productdetails details = new Productdetails();
    cartfunction carttest = new cartfunction();
    
    @Test
    public void testCartFunctionality() {
        driver.get("https://www.demoblaze.com/");
        login.enterCredentials("NewUser", "password");
        login.submitLogin();
        details.openNexus6Product();
        details.addNexus6ToCart();
        carttest.cartbutton();
        carttest.isNexus6InCart();
        carttest.getProductQuantity();
        carttest.getProductPrice();
        Assert.assertTrue("Nexus 6 should be in the cart", carttest.isNexus6InCart());
        int quantity = carttest.getProductQuantity();
        Assert.assertEquals("The quantity of Nexus 6 should be 1", 1, quantity);
        double price = carttest.getProductPrice();
        Assert.assertEquals("The price of Nexus 6 is not correct", 201.0, price, 0.01); 
        Assert.assertFalse("The cart should be empty after deleting the Nexus 6", carttest.isNexus6InCart());
    }
}
