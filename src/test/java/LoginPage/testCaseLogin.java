package LoginPage;

import SetupMethod.WebDriverController;
import loginPage.loginPage;

//Scenario :
//as user i want to login using valid username and password

public class testCaseLogin extends WebDriverController {

    public static void main(String[] args) throws Exception {
        String browser = "chrome";
        WebDriverController.setup(browser);

        String baseUrl = "https://bss-stg.myrepublic.net.id/signin";

        driver.get(baseUrl);

        //Creating loginPage Object
        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@myrepublic.co.id");
        loginPage.setPassTxtBox("P@ssw0rd");
        loginPage.clickLoginBtn();

    }

}
