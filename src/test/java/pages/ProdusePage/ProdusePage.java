package pages.ProdusePage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ProdusePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(ProdusePage.class);
    public static ProdusePage instance;

    private ProdusePage() {
    }

    public static ProdusePage getInstance() {
        if (instance == null) {
            instance = new ProdusePage();
        }
        return instance;
    }



}
