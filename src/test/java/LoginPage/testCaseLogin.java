package LoginPage;

import SetupMethod.WebDriverController;
import loginPage.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

//Scenario :
//as user i want to login using valid username and password

public class testCaseLogin {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String baseUrl = "https://bss-stg.myrepublic.net.id/signin";

        //Creating loginPage Object
        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@myrepublic.co.id");
        loginPage.setPassTxtBox("P@ssw0rd");
        loginPage.clickLoginBtn();

        driver.quit();
    }

}
