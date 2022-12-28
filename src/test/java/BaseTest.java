import general.GeneralActions;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import page.BasePage;
import page.FoundProductsPage;
import page.HomePage;

public class BaseTest {
    protected WebDriver driver = GeneralActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected FoundProductsPage foundProductsPage = new FoundProductsPage(driver);


    @After
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

}
