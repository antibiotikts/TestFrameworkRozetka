package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By searchLine = By.xpath("//input[@name='search']");
    private final By searchButton = By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']");

    public HomePage search() {
        driver.findElement(searchLine);
        return this;
    }

    public HomePage addSearchidProduct(String request) {
        driver.findElement(searchLine).sendKeys(request);
        return this;
    }

    public HomePage presSearchButton() {
        driver.findElement(searchButton).click();
        return this;
    }

}
