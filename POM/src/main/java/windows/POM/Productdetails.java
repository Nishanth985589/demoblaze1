package windows.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Productdetails {
 
    @FindBy(linkText = "Nexus 6")
    WebElement ProductLink;

    @FindBy(xpath = "//button[text()='Add to cart']")
    WebElement addToCartButton;

    public void openNexus6Product(){
    ProductLink.click(); 
    }

    public void addNexus6ToCart(){
    addToCartButton.click();     
    }}
