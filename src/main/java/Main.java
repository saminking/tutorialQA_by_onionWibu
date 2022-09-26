import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String baseUrl = "https://bss-stg.myrepublic.net.id/signin";
        driver.get(baseUrl);

        WebElement userNameTxtBox = driver.findElement(By.name("username"));
        WebElement passTxtBox = driver.findElement(By.name("password"));

        userNameTxtBox.sendKeys("admin@myrepublic.co.id");
        passTxtBox.sendKeys("P@ssw0rd");

        WebElement loginBtn = driver.findElement(By.xpath("//button[text() = \"LOGIN\"]"));
        loginBtn.click();

        String labelBeranda = driver.findElement(By.xpath("//h1[text() = \"Beranda\"]")).getText();
        Assert.assertEquals("Beranda", labelBeranda);

        driver.quit();
    }

}