package MasterProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class createProductForm {

    WebDriver driver;

    public createProductForm(WebDriver driver) {
        this.driver = driver;
    }

    By productName = By.name("productName");
    By descProduct = By.name("productDesc");
    By productTag = By.name("productTag");
    By productCost = By.name("productCost");
    By productPrice = By.name("productPrice");
    By discCheckBox = By.xpath("//input[@type='checkbox']");
    By statusDropDown = By.xpath("//div[contains(text(), 'Status')]");

    public void selectStatusTesting(){
        driver.findElement(statusDropDown).click();
        driver.findElement(statusDropDown).sendKeys("Testing");
        driver.findElement(statusDropDown).sendKeys(Keys.ENTER);
    }
}
