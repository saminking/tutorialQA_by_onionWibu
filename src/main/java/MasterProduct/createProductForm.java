package MasterProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.security.PublicKey;
import java.time.Duration;

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
    By statusTesting = By.xpath("//*[@id=\"react-select-46-option-0\"]");
    By businessLineDropDown = By.xpath("//div[contains(text(), 'Business Line')]");
    By productLineDropDown = By.xpath("//div[contains(text(), 'Product Line')]");
    By channelDropDown = By.xpath("//div[contains(text(), 'Channel')]");
    By chargeTypeDropDown = By.xpath("//div[contains(text(), 'Charge Type')]");
    By produkTypeDropDown = By.xpath("//div[contains(text(), 'Produk Type')]");
    By paymentTypeMonthly = By.xpath("//input[@value = '4']");
    By produkAreaDropDown = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div/div/div/div[3]/div/div/div/div[2]/div/div[2]/div[3]/div/div/div[1]/div[1]");
    By clusterdropDown = By.xpath("//div[@class='select-cluster__placeholder css-1wa3eu0-placeholder']");
    By assertCheckboxElement = By.xpath("//label[normalize-space()='PILIH SEMUA CLUSTER']");
    By buttonBerikutnyaCluster = By.xpath("//button[contains(text(), 'Berikutnya')]");
    By buttonSimpanProduct = By.xpath("//button[contains(text(), 'Simpan')]");

    public void inputProductName(String ProductName){
        driver.findElement(productName).sendKeys(ProductName);
    }

    public void inputDescProduct(String DescProduct){
        driver.findElement(descProduct).sendKeys(DescProduct);
    }

    public void inputProductTag(String ProductTag){
        driver.findElement(productTag).sendKeys(ProductTag);
    }

    public void inputProductCost(String ProductCost){
        driver.findElement(productCost).sendKeys(ProductCost);
    }

    public void inputProductPrice(String ProductPrice){
        driver.findElement(productPrice).sendKeys(ProductPrice);
    }

    public void selectPaymentTypeMonthly(){
        driver.findElement(paymentTypeMonthly).click();
    }

    public void selectProductAreaAll(){
        driver.findElement(produkAreaDropDown).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
    }

    public void selectClusterAll(){
        driver.findElement(clusterdropDown).click();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
        w.until(ExpectedConditions.visibilityOfElementLocated(assertCheckboxElement));
        System.out.println("sukses");
        driver.findElement(buttonBerikutnyaCluster).click();

    }

    public void selectStatus(String status){
        driver.findElement(statusDropDown).click();
        Actions keyDown = new Actions(driver);
        if (status.equalsIgnoreCase("testing")) {
            keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
        }
        else if (status.equalsIgnoreCase("live")){
            keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
        }
        else if (status.equalsIgnoreCase("retired")){
            keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
        }

    }

    public void selectBusinessLineAll(){
        driver.findElement(businessLineDropDown).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
    }

    public void selectProductLineOnnet(){
        driver.findElement(productLineDropDown).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
    }

    public void selectChannelAll(){
        driver.findElement(channelDropDown).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
    }

    public void selectChargeTypeAll(){
        driver.findElement(chargeTypeDropDown).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
    }

    public void selectProdukTypeTVAddons(){
        driver.findElement(produkTypeDropDown).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
    }

    public void clickSimpanButton(){
        driver.findElement(buttonSimpanProduct).click();
    }



}
