package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductListPage;

public class AddToCartTest extends BaseClass {
    @Test
    public void addToCartList(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");

        ProductListPage productListPage = loginPage.clickLoginBtn();

        productListPage.clickONAddToCartBtn();
    }
}
