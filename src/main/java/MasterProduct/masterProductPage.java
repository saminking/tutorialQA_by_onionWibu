package MasterProduct;

import SetupMethod.WebDriverController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class masterProductPage extends WebDriverController{
    public masterProductPage(WebDriver driver)    {
        this.driver = driver;
    }
    By mainProductMenu = By.xpath("//span[contains(text(), 'Product')]");
    By mainSubProductMenu = By.xpath("//a[@href='/product-management']");
    By btnCreateProduct = By.xpath("//button[contains(text(), 'Buat Master Produk')]");

    public void clickMainProductMenu()  {
        driver.findElement(mainProductMenu).click();
    }

    public void clickMainSubProductMenu() {
        driver.findElement(mainSubProductMenu).click();
    }

    public void clickBtnCreateProduct() {
        driver.findElement(btnCreateProduct).click();
    }
}
