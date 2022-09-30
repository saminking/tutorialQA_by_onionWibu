package SetupMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverController {

        public static WebDriver driver;

        public static WebDriver setup(String browser) throws Exception
        {
            //Check if parameter passed from TestNG is 'firefox'
            if(browser.equalsIgnoreCase("firefox"))
            {
                //create firefox instance
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("chrome"))    {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if(browser.equalsIgnoreCase("IE")) {
                WebDriverManager.iedriver().setup();
                InternetExplorerDriver driver;
                driver = new InternetExplorerDriver();
            } else {
                //If no browser passed throw exception
                throw new Exception("Browser is not correct");
            }

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
        }
    }
