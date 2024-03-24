package pages.ProdusePage;

import org.openqa.selenium.By;
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

    private By produse = By.xpath("//ul//li//a[@title='Produse']");
    private By gradina = By.xpath("//p//a[@title='Gradina']");
    private By utilaje = By.xpath("//img[@alt='Utilaje pentru gradina si accesorii']");
    private By motosape = By.xpath("//a[text()='Motosape']");
    private By motocultor6cp = By.xpath("//figure//a[@title='Motocultor 6CP 173CC DZ-M147-S001-G01']");
    private By motocultor8cp = By.xpath("//figure//a[@title='Motocultor 8CP 212CC DZ-M122-S001-G02']");
    private By consent = By.id("msbtn-accept-all");
    private By reseteaza = By.xpath("//a[@data-bs-original-title = 'Reseteaza']");
    private By sortare = By.id("dropdownMenuButton");
    private By sortarePretCresc = By.xpath("//a[text()='Pret crescator']");
    private By sortarePretDesc = By.xpath("//a[text()='Pret descrescator']");
    private By sortareNumeCresc = By.xpath("//a[text()='Nume crescator']");
    private By sortareNumeDesc = By.xpath("//a[text()='Nume descrescator']");
    private By resetSort = By.xpath("//a[text()='Reseteaza']");
    private By Logo = By.xpath("//img[@alt='Ambient']");


    public void pressProduse() {
        LOG.info("press Produse");
        driver.findElement(produse).click();
    }

    public void pressGradina() {
        LOG.info("press Gradina");
        driver.findElement(gradina).click();
    }

    public void pressUtilaje() {
        LOG.info("press Utilaje si accesorii");
        driver.findElement(utilaje).click();
    }

    public void pressMotosape() {
        LOG.info("select filter Motosape");
        driver.findElement(motosape).click();
    }

    public boolean isMotocultor6cpDisplayed() {
        LOG.info("Verify if 'Motocultor 6CP' is displayed");
        return driver.findElement(motocultor6cp).isDisplayed();
    }

    public boolean isMotocultor8cpDisplayed() {
        LOG.info("Verify if 'Motocultor 8CP' is displayed");
        return driver.findElement(motocultor8cp).isDisplayed();
    }

    public void pressConsent() {
        LOG.info("press consent button");
        driver.findElement(consent).click();
    }

    public void pressReseteaza() {
        LOG.info("press Reseteaza button");
        driver.findElement(reseteaza).click();
    }

    public void pressSorteaza() {
        LOG.info("press Sorteaza dupa");
        driver.findElement(sortare).click();
    }

    public void sortByPretCresc() {
        LOG.info("press Pret crescator");
        driver.findElement(sortarePretCresc).click();
    }

    public void sortByPretDesc() {
        LOG.info("press Pret descrescator");
        driver.findElement(sortarePretDesc).click();
    }

    public void sortByNumeCrescator() {
        LOG.info("press Nume crescator");
        driver.findElement(sortareNumeCresc).click();
    }

    public void sortByNumeDesc() {
        LOG.info("press Nume descrescator");
        driver.findElement(sortareNumeDesc).click();
    }

    public void resetSort() {
        LOG.info("press Sort reset");
        driver.findElement(resetSort).click();
    }

    public void clickLogo() {
        LOG.info("click on Logo to go to Home page");
        driver.findElement(Logo).click();
    }


}