package pages.ProdusePage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
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

    private By produse = By.xpath("//a[@title='Produse']");
    private By gradina = By.xpath("//p//a[@title='Gradina']");

    public void pressProduse() {
        LOG.info("press Produse");
        driver.findElement(produse).click();
    }

    public void pressGradina() {
        LOG.info("press Produse");
        driver.findElement(gradina).click();



    }

}
