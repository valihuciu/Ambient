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

        LOG.info("click on Motosape");
        produsePage.pressMotosape();

        LOG.info("click on consent button");
        produsePage.pressConsent();

        LOG.info("click on Reseteaza button");
        produsePage.pressReseteaza();

        LOG.info("click on Sorteaza dupa drop down");
        produsePage.pressSorteaza();

        LOG.info("sort by Pret crescator");
        produsePage.sortByPretCresc();

        LOG.info("click on Sorteaza dupa drop down");
        produsePage.pressSorteaza();

        LOG.info("sort by Pret descrescator");
        produsePage.sortByPretDesc();

        LOG.info("click on Sorteaza dupa drop down");
        produsePage.pressSorteaza();

        LOG.info("sort by Nume crescator");
        produsePage.sortByNumeCrescator();

        LOG.info("click on Sorteaza dupa drop down");
        produsePage.pressSorteaza();

        LOG.info("sort by Nume descrescator");
        produsePage.sortByNumeDesc();

        LOG.info("click on Sorteaza dupa drop down");
        produsePage.pressSorteaza();

        LOG.info("reseting sort");
        produsePage.resetSort();

    }

}
