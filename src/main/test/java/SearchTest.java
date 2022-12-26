import org.junit.Test;
import static constants.Url.ROZETKA;

public class SearchTest extends BaseTest {
    @Test
    public void checkSearch() {
        basePage.open(ROZETKA);

        homePage
                .search()
                .addSearchidProduct("Ipad")
                .presSearchButton();
    }
}
