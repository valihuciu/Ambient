package tests.BuyTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
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

        sleep(2000);

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

        sleep(1000);

        LOG.info("clicking on cart icon");
        buyPage.pressCart();

        sleep(500);

        LOG.info("clicking on cart details button");
        buyPage.pressCartDetails();

        LOG.info("Verify if the product 'Fereastra PVC stejar 71x116cm, dubla deschidere, 4 camere, dreapta' is displayed in the Cart");
        Assert.assertTrue(buyPage.isProductDisplayed(), "'Fereastra PVC stejar 71x116cm, dubla deschidere, 4 camere, dreapta' is not displayed");

        LOG.info("clicking the plus button");
        buyPage.pressPlusButton();

        sleep(1000);

        LOG.info("clicking the plus button again to increase at 3 pieces");
        buyPage.pressPlusButton();

        sleep(500);

        LOG.info("Verify if the total is correctly displayed");
        Assert.assertTrue(buyPage.isTotalDisplayed(), "Total is not displayed correctly");
    }

}
