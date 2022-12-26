import general.GeneralActions;
import org.openqa.selenium.WebDriver;
import page.BasePage;
import page.HomePage;

public class BaseTest {
    protected WebDriver driver = GeneralActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);

}
