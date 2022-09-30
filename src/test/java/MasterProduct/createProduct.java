package MasterProduct;

import SetupMethod.WebDriverController;
import loginPage.loginPage;
import productPage.productPage;

public class createProduct extends WebDriverController {

    public static void main(String[] args) throws Exception{
        WebDriverController.setup("chrome");
        driver.get("https://bss-stg.myrepublic.net.id/signin");

        loginPage login = new loginPage(driver);
        login.validLogin();

        productPage product = new productPage(driver);

        product.clickMainProductMenu();
        product.clickMasterProductMenu();
        product.clickCreateMasterProduct();
    }
}
