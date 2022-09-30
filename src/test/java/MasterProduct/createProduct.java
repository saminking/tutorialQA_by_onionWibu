package MasterProduct;

import SetupMethod.WebDriverController;
import loginPage.loginPage;

import static SetupMethod.WebDriverController.driver;

public class createProduct extends WebDriverController {
    public static void main(String[] args) throws Exception {

        WebDriverController.setup("chrome");
        String baseUrl = "https://bss-stg.myrepublic.net.id/signin";

        driver.get(baseUrl);
        loginPage lp = new loginPage(driver);
        lp.validLogin();

    }


}
