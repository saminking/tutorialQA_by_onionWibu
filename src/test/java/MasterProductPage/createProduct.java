package MasterProductPage;

import MasterProduct.createProductForm;
import MasterProduct.masterProductPage;
import SetupMethod.WebDriverController;
import loginPage.loginPage;
import org.openqa.selenium.JavascriptExecutor;

public class createProduct extends WebDriverController {
    public static void main(String[] args) throws Exception {

        WebDriverController.setup("chrome");
        driver.get("https://bss-stg.myrepublic.net.id/signin");

        loginPage loginPage = new loginPage(driver);
        loginPage.validLogin();

        masterProductPage masterProductPage = new masterProductPage(driver);

        masterProductPage.clickMainProductMenu();
        masterProductPage.clickMasterProductMenu();
        masterProductPage.clickCreateMasterProduct();

        createProductForm CreatedProductForm = new createProductForm(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        CreatedProductForm.selectStatusTesting();

    }
}
