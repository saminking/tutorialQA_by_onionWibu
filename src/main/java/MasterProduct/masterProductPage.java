package MasterProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class masterProductPage {

    WebDriver driver;

    public masterProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By mainProductMenu = By.xpath("//span[contains(text(), 'Product')]");
    By masterProductMenu = By.xpath("//a[@href='/product-management']");
    By createMasterProductBtn = By.xpath("//button[contains(text(), 'Buat Master Produk')]");
    By catalogProductTitle = By.xpath(("//h1[normalize-space()='Katalog Produk']"));

    public void clickMainProductMenu() {
        driver.findElement(mainProductMenu).click();
    }

    public void clickMasterProductMenu() {
        driver.findElement(masterProductMenu).click();
    }

    public void clickCreateMasterProduct() {
        driver.findElement(createMasterProductBtn).click();
    }

    public boolean catalogElementIsPresent(){
        try {
            driver.findElement(catalogProductTitle);
            return true;
        } catch (NoSuchElementException e){
            return false;
        }
    }


}
