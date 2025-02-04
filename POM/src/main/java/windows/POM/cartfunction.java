package windows.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class cartfunction {

	@FindBy(id="cartur")
	WebElement cartbtn;
	
    @FindBy(xpath = "//table[@class='table table-striped']/tbody/tr")
    List<WebElement> cartRows;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    WebElement deleteButton;

    @FindBy(xpath = "//td[@class='col-sm-1 col-md-1']/input")
    WebElement productQuantityField;

    @FindBy(xpath = "//td[@class='col-sm-2 col-md-2']")
    WebElement productNameField;

    @FindBy(xpath = "//td[@class='col-sm-1 col-md-1'][2]")
    WebElement productPriceField;

    
    public void cartbutton( ) {
    	cartbtn.click();
    }
    
    public boolean isNexus6InCart() {
        for (WebElement row : cartRows) {
            String productName = row.findElement(By.xpath(".//td[@class='col-sm-2 col-md-2']")).getText();
            if (productName.equals("Nexus 6")) {
                return true;
            }
        }
        return false;
    }

    public int getProductQuantity() {
        return Integer.parseInt(productQuantityField.getAttribute("value"));
    }

    public double getProductPrice() {
        String priceText = productPriceField.getText().replace("$", "");
        return Double.parseDouble(priceText);
    }}
