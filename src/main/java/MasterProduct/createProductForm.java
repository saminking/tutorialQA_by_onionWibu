package MasterProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class createProductForm {
    WebDriver driver;

    public createProductForm(WebDriver driver)  {
        this.driver = driver;
    }

    By productName = By.name("productName");
    By descProduct = By.name("productDesc");
    By tagProduct = By.name("productTag");
    By costProduct = By.name("productCost");
    By checkBoxDiscount = By.xpath("//input[@type='checkbox']");
    By statusDropdown = By.xpath("//div[contains(text(), 'Status')]");

    public void setProductName() {
        driver.findElement(productName).sendKeys("Product Automation 7");
    }

    public void setDescProduct() {
        driver.findElement(descProduct).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
    }

    public void setTagProduct() {
        driver.findElement(tagProduct).sendKeys("product-automation-7");
    }

    public void setStatusDropdown() {
        driver.findElement(checkBoxDiscount).click();
        driver.findElement(checkBoxDiscount).sendKeys("Testing");
        driver.findElement(checkBoxDiscount).sendKeys(Keys.ENTER);
    }
}
