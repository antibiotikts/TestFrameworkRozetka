import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SearchTest extends BaseTest {
    String products;

    public SearchTest(String products) {
        this.products = products;
    }

    @Parameterized.Parameters
    public static String[] products() {
        return new String[]{"Ipad", "Iphone"};
    }
    @Ignore
    @Test
    public void checkSearchTest() {
        homePage
                .search()
                .addSearchidProduct(products)
                .presSearchButton()
                .waitPage();
    }

    @Test
    public void getProductsTest() {
        homePage
                .search()
                .addSearchidProduct(products)
                .presSearchButton()
                .waitPage();

        foundProductsPage
                .waitElements()
                .getProduct(foundProductsPage.getOnSail())
                .getProduct(foundProductsPage.getNotForSail());
    }
}

