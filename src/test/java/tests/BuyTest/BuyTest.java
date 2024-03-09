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

        LOG.info("clicking on Produse");
        buyPage.pressProduse();


//        LOG.info("clicking Finisaje");
//        buyPage.pressFinisaje();

//        LOG.info("clicking 'mochete,covoare'");
//        buyPage.pressCovoare();


    }

}
