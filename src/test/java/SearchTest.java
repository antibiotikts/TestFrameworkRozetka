import com.sun.org.glassfish.external.probe.provider.annotations.ProbeListener;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

import static constants.Url.ROZETKA;

public class SearchTest extends BaseTest {
    @Test
    public void checkSearch() throws InterruptedException {
        basePage.open(ROZETKA);

        homePage
                .search()
                .addSearchidProduct("Ipad")
                .presSearchButton();


        foundProductsPage.getProduct(foundProductsPage.getOnSail())
                .getProduct(foundProductsPage.getNotForSail());


    }
}
