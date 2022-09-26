package LoginPage;

import loginPage.loginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

//Scenario :
//As a user i want to set empty the username and password

public class testCaseLogin2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String baseUrl = "https://bss-stg.myrepublic.net.id/signin";
        driver.get(baseUrl);

        //Creating loginPage Object
        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("a");
        loginPage.clearUserTxtBox();
        loginPage.setPassTxtBox("a");
        loginPage.clearPassTxtBox();

        Assert.assertEquals("Username wajib diisi", loginPage.getEmptyUserMsg());
        Assert.assertEquals("Password wajib diisi", loginPage.getEmptyPassMsg());

    }
}
