package windows.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage {

    @FindBy(linkText = "Phones")
    WebElement phonesCategory;

    @FindBy(linkText = "Laptops")
    WebElement laptopsCategory;

    @FindBy(linkText = "Monitors")
    WebElement monitorsCategory;

    @FindBy(xpath = "//div[@class='card-block']")
    List<WebElement> productCards;

    @FindBy(xpath = "//button[text()='Add to cart']")
    WebElement addToCartButton;

    @FindBy(xpath = "//a[text()='Cart']")
    WebElement cartLink;

    public void openPhonesCategory() {
        phonesCategory.click();
    }

    public void openLaptopsCategory() {
        laptopsCategory.click();
    }

    public void openMonitorsCategory() {
        monitorsCategory.click();
    }

    public void verifyProductDetails() {
        for (WebElement productCard : productCards) {
            String productName = productCard.findElement(By.xpath(".//h4")).getText();
            String productPrice = productCard.findElement(By.xpath(".//h5")).getText();
            System.out.println("Product Name: " + productName + ", Price: " + productPrice);
        }
    }}

