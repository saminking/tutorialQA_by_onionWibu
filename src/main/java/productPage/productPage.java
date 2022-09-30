package productPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage {
    WebDriver driver;

    public productPage(WebDriver driver){
        this.driver = driver;
    }

    By mainProductMenu = By.xpath("//span[contains(text(), 'Product')]");
    By masterProductMenu = By.xpath("//a[@href='/product-management']");
    By createMasterProduct = By.xpath("//button[contains(text(), 'Buat Master Product']");

    public void clickMainProductMenu(){
        driver.findElement(mainProductMenu).click();
    }

    public void clickMasterProductMenu(){
        driver.findElement(masterProductMenu).click();
    }

    public void clickCreateMasterProduct(){
        driver.findElement(createMasterProduct).click();
    }
}
