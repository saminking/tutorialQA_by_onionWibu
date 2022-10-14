package MasterProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class createProductForm {
    WebDriver driver;

    public createProductForm(WebDriver driver)  {
        this.driver = driver;
    }

    By productName = By.name("productName");
    By descProduct = By.name("productDesc");
    By tagProduct = By.name("productTag");
    By costProduct = By.name("productCost");

    By productPrice = By.name("productPrice");
    By checkBoxDiscount = By.xpath("//input[@type='checkbox']");
    By dropdownStatus = By.xpath("//div[contains(text(), 'Status')]");
    By dropdownBusinessLine = By.xpath("//div[contains(text(), 'Business Line')]");
    By dropdownProductLine = By.xpath("//div[contains(text(), 'Product Line')]");
    By dropdownChannel = By.xpath("//div[contains(text(), 'Channel')]");
    By paymentTypeMonthly = By.xpath("//input[@name='product-pay-type'][@value='4']");
    By dropdownProductArea = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div/div[3]/div/div/div/div[2]/div/div[2]/div[3]/div/div/div[1]");
    By dropdownChargeType = By.xpath("//div[contains(text(), 'Charge Type')]");
    By dropdownProductCluster = By.xpath("//div[@class='select-cluster__placeholder css-1wa3eu0-placeholder'][contains(text(), 'Select...')]");
    By dropdownProductType = By.xpath("//div[contains(text(), 'Produk Type')]");

    By assertCheckboxElement = By.xpath("//label[normalize-space()='PILIH SEMUA CLUSTER']");

    By btn_simpan = By.xpath("//button[contains(text(), 'Simpan')]");

    By buttonNext = By.xpath("//button[contains(text(), 'Berikutnya')]");

    public void setSimpanProduct() {
        driver.findElement(btn_simpan).click();
    }

    public void setDropdownProductType() {
        driver.findElement(dropdownProductType).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
    }

    public void setDropdownProductCluster() {
        driver.findElement(dropdownProductCluster).click();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
        w.until(ExpectedConditions.visibilityOfElementLocated(assertCheckboxElement));
        System.out.println("Show popup");
        Actions keyDown = new Actions(driver);
        driver.findElement(buttonNext).click();
        keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
    }

    public void setDropdownChargeType() {
        driver.findElement(dropdownChargeType).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
    }

    public void setDropdownProductArea() {
        driver.findElement(dropdownProductArea).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
    }

    public void setPaymentTypeMonthly() {
        driver.findElement(paymentTypeMonthly).click();
    }

    public void setDropdownChannel() {
        driver.findElement(dropdownChannel).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
    }

    public void setCostProduct(String CostProduct) {
        driver.findElement(costProduct).sendKeys("450000");
    }

    public void setProductPrice(String ProductPrice) {
        driver.findElement(productPrice).sendKeys("500000");
    }

    public void setDropdownStatus(String status) {
        driver.findElement(dropdownStatus).click();
        Actions keyDown = new Actions(driver);
        if (status.equalsIgnoreCase("testing"))   {
            keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
        } else if (status.equalsIgnoreCase("live")) {
            keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
        } else if(status.equalsIgnoreCase("retired")) {
            keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
        }
    }

    public void setDropdownBusinessLineAll() {
        driver.findElement(dropdownBusinessLine).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
    }

    public void setDropdownProductLineOnnet() {
        driver.findElement(dropdownProductLine).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
    }

    public void setProductName(String ProductName) {
        driver.findElement(productName).sendKeys(ProductName);
    }

    public void setDescProduct(String DescriptionProduct) {
        driver.findElement(descProduct).sendKeys(DescriptionProduct);
    }

    public void setTagProduct(String TagsProduct) {
        driver.findElement(tagProduct).sendKeys(TagsProduct);
    }
}
