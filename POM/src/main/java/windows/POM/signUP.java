package windows.POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class signUP {
	    WebDriver driver;

	   
	    @FindBy(id = "sign-username")
	    WebElement usernameField;

	    @FindBy(id = "sign-password")
	    WebElement passwordField;

	    @FindBy(xpath = "//button[text()='Sign up']")
	    WebElement signupButton;

	    @FindBy(id = "signInModal")
	    WebElement signupMessage;

	    public void signUP(String username, String password)
	    {
	        usernameField.sendKeys(username);
	   	    passwordField.sendKeys(password);
	        signupButton.click();
	        }
		public String getSignupMessage() {
			return signupMessage.getText();
		}}
		
			
		
	


