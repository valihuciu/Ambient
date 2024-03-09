package tests.BuyTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class BuyTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(BuyTest.class);

    String loginEmail = "ghj@email.com";
    String loginPassword = "P@ssw0rd1234";

    @Test
    public void buyProduct() {


        LOG.info("Pressing My Account");
        buyPage.pressMyAcccount();

        LOG.info("Typing login email");
        buyPage.insertEmail(loginEmail);

        LOG.info("Typing login password");
        buyPage.insertPassword(loginPassword);

        LOG.info("Pressing Login Button");
        buyPage.pressLoginButton();

        LOG.info("Clicking on Accept Cookies");
        buyPage.pressAcceptCookies();

        sleep(500);

        LOG.info("clicking on 'Alege magazin'");
        buyPage.pressStore();

        sleep(1500);

        LOG.info("selecting the 'Bistrita' store");
        buyPage.selectStore();

        sleep(1000);

        LOG.info("clicking on 'Produse'");
        buyPage.pressProduse();

        sleep(1000);

        LOG.info("clicking 'Finisaje'");
        buyPage.pressFinisaje();

        sleep(1000);

        LOG.info("clicking 'Ferestre'");
        buyPage.pressferestre();

        sleep(500);

        LOG.info("adding a product to cart");
        buyPage.pressAddToCart();


    }

}
