package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FoundProductsPage extends BasePage {

    private final By foundProductsOnSail = By.xpath("//div[@class='goods-tile ng-star-inserted']");

    private final By foundProductsNotForSail = By.xpath("//div[@class='goods-tile goods-tile_state_disabled ng-star-inserted']");

    public FoundProductsPage(WebDriver driver) {
        super(driver);
    }

     public FoundProductsPage waitElements() {
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(foundProductsOnSail)));
        return this;
     }
     public List<WebElement> getOnSail() {
         System.out.println(driver.getCurrentUrl());
         System.out.println(driver.getCurrentUrl());

         return (driver.findElements(foundProductsOnSail));
     }

     public List<WebElement> getNotForSail() {
        return driver.findElements(foundProductsNotForSail);
     }

     public FoundProductsPage getProduct(List<WebElement> productList) {
        for(WebElement product: productList) {
            System.out.println(product.getText());
        }
        System.out.println(productList.size());
        return this;
     }
}
