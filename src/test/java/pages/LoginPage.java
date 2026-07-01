package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//*[@id=\"login-button\"]");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys((username));
        System.out.println("Username entered: " + username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);

    }

    public ProductListPage clickLoginBtn(){
        driver.findElement(loginButton).click();
        return new ProductListPage(driver);
    }

}
