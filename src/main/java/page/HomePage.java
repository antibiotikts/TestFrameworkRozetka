package page;

import general.User;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Scanner;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By searchLine = By.xpath("//input[@name='search']");
    private final By searchButton = By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']");
    private final By loginButton = By.xpath("//button[@class='header__button ng-star-inserted']//*[@href='#icon-user-simple']");

    private final By loginField = By.id("auth_email");
    private final By passwordField = By.id("auth_pass");
    private final By loginEnterButton = By.xpath("button[@class='button button--large button--green auth-modal__submit ng-star-inserted']");
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

    public HomePage waitPage() {
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(loginButton)));
        return this;
    }

    public HomePage login() throws FileNotFoundException, InterruptedException {
        User user = new User();
        user.setUserData();

        driver.findElement(loginButton).click();
        Thread.sleep(1000);
        driver.findElement(loginField).click();
        driver.findElement(loginField).sendKeys(user.getLogin());
        driver.findElement(passwordField).click();
        driver.findElement(passwordField).sendKeys(user.getPassword());
        driver.findElement(passwordField).sendKeys(Keys.ENTER);
        //driver.findElement(loginEnterButton).click();
        return this;
    }
}
