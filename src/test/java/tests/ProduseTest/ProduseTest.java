package tests.ProduseTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class ProduseTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(ProduseTest.class);

    @Test
    public void produse() {

        LOG.info("Click on Produse");
        produsePage.pressProduse();

        LOG.info("Click on Gradina");
        produsePage.pressGradina();

        LOG.info("Click on Utilaje pt gradina");
        produsePage.pressUtilaje();

    }

}
