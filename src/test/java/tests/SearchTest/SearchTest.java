package tests.SearchTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.BuyTest.BuyTest;

import static pages.BasePage.sleep;

public class SearchTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(BuyTest.class);

    String loginEmail = "ghj@email.com";
    String loginPassword = "P@ssw0rd1234";
    String product = "Ferroli Bluehelix Maxima 28C";
    String product2 = "Element aluminiu Ferroli Proteo HP 700";

    @Test
    public void searchTest() {

        LOG.info("Pressing My Account");
        loginPage.pressMyAcccount();

        LOG.info("Typing login email");
        loginPage.insertEmail(loginEmail);

        LOG.info("Typing login password");
        loginPage.insertPassword(loginPassword);

        LOG.info("Pressing Login Button");
        loginPage.pressLoginButton();

        sleep(500L);

        LOG.info("inserting product in the search field");
        searchPage.insertProduct(product);

        sleep(500L);

        LOG.info("pressing search button");
        searchPage.pressSearch();

        sleep(500L);

        LOG.info("clicking on 'Alege magazin'");
        buyPage.pressStore();

        sleep(2000);

        LOG.info("selecting the 'Bistrita' store");
        buyPage.selectStore();

        sleep(500L);

        LOG.info("pressing add to cart button");
        searchPage.addToCart();

        sleep(500L);

        LOG.info("inserting product 2 in the search field");
        searchPage.insertProduct(product2);

        sleep(500L);

        LOG.info("pressing search button");
        searchPage.pressSearch();

        sleep(500L);

        LOG.info("pressing add to cart button");
        searchPage.addToCart2();

        sleep(1500L);

        LOG.info("clicking on cart icon");
        buyPage.pressCart();

        sleep(1000);

        LOG.info("clicking on cart details button");
        buyPage.pressCartDetails();

        sleep(500L);

        LOG.info("clicking on remove product 1");
        searchPage.removeProduct();

        sleep(500L);

        LOG.info("clicking on remove product 2");
        searchPage.removeProduct();

        sleep(1000);

        LOG.info("Verify if the message 'Cosul de cumparaturi este gol' is displayed");
        Assert.assertTrue(searchPage.isTextDisplayed(), "'Cosul de cumparaturi este gol'");

        sleep(2000L);
    }
}
