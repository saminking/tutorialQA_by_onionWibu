package MasterProduct;

import SetupMethod.WebDriverController;
import loginPage.loginPage;

public class createProduct extends WebDriverController {
    public static void main(String[] args) throws Exception {

        WebDriverController.setup("chrome");
        String baseUrl = "https://bss-stg.myrepublic.net.id/signin";

        driver.get(baseUrl);
        loginPage lp = new loginPage(driver);
        lp.validLogin();
        masterProductPage masterProductPage = new masterProductPage(driver);
        masterProductPage.clickMainProductMenu();
        masterProductPage.clickMainSubProductMenu();
        masterProductPage.clickBtnCreateProduct();

        createProductForm cpf = new createProductForm(driver);

        cpf.setProductName("Internet 2MBPS");
        cpf.setDescProduct("Lorem Ipsum Internet 2MBPS");
        cpf.setTagProduct("lorem-internet-2mbps");
        cpf.setCostProduct("470000");
        cpf.setProductPrice("500000");
        cpf.setDropdownStatus("testing");
        cpf.setDropdownBusinessLineAll();
        cpf.setDropdownProductLineOnnet();
        cpf.setDropdownChannel();
        cpf.setDropdownChargeType();
        cpf.setDropdownProductType();
        cpf.setPaymentTypeMonthly();
        cpf.setDropdownProductArea();
        cpf.setDropdownProductCluster();
        cpf.setSimpanProduct();
    }


}
