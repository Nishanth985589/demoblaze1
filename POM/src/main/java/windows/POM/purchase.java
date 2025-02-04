package windows.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class purchase {
    
	@FindBy(className="btn btn-success ")
	WebElement orderbtn;
	
    @FindBy(id = "name")
    WebElement nameField;

    @FindBy(id = "country")
    WebElement countryField;

    @FindBy(id = "city")
    WebElement cityField;

    @FindBy(id = "card")
    WebElement cardField;

    @FindBy(id = "month")
    WebElement monthField;

    @FindBy(id = "year")
    WebElement yearField;

    @FindBy(xpath = "//button[contains(text(),'Purchase')]")
    WebElement purchaseButton;

    public void placeorder() {
    	orderbtn.click();
    }
    
    public void fillOrderDetails(String name, String country, String city, String card, String month, String year) {
        nameField.sendKeys(name);
        countryField.sendKeys(country);
        cityField.sendKeys(city);
        cardField.sendKeys(card);
        monthField.sendKeys(month);
        yearField.sendKeys(year);
    }
    public void placeOrder() {
        purchaseButton.click();
    }}
