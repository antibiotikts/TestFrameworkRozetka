import com.sun.org.glassfish.external.probe.provider.annotations.ProbeListener;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;
import java.util.List;

import static constants.Url.ROZETKA;

public class SearchTest extends BaseTest {
    @Test
    public void checkSearchTest() {
        homePage
                .search()
                .addSearchidProduct("Ipad")
                .presSearchButton()
                .waitPage();
    }

    @Test
    public void getProductsTest() {
        homePage
                .search()
                .addSearchidProduct("Ipad")
                .presSearchButton()
                .waitPage();

        foundProductsPage
                .waitElements()
                .getProduct(foundProductsPage.getOnSail())
                .getProduct(foundProductsPage.getNotForSail());
    }
}

