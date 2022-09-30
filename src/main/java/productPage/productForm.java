package productPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productForm {
    WebDriver driver;

    By productName = By.name("productName");
    By descName = By.name("productDesc");
    By productTag = By.name("productTag");
    By productCost = By.name("productCost");
    By productPrice = By.name("productPrice");
}
