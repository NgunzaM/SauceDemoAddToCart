package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage {
    public WebDriver driver;
    private By addToCartBtn = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");

    public ProductListPage(WebDriver driver) {
        this.driver=driver;
    }

    public void clickONAddToCartBtn(){
        driver.findElement(addToCartBtn).click();

    }
}
