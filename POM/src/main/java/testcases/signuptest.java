package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import junit.framework.Assert;
import windows.POM.signUP;

public class signuptest {

    WebDriver driver = new ChromeDriver();
    signUP signUpPage = new signUP();

    @Test
    public void testSignUp() {
        driver.get("https://www.demoblaze.com/");
        signUpPage.signin();
        signUpPage.enterSignupDetails("Neewuser", "password", "abcdfg@gmail.com");
        signUpPage.signupbtn();
    }}










