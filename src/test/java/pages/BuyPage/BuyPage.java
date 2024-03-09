package pages.BuyPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class BuyPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(BuyPage.class);
    public static BuyPage instance;

    private BuyPage() {
    }

    public static BuyPage getInstance() {
        if (instance == null) {
            instance = new BuyPage();
        }
        return instance;
    }

    private By enterMyAccount = By.xpath("//i[@class='las la-user']");
    private By enterEmail = By.xpath("//input[@id='loginemail']");
    private By enterPassword = By.xpath("//input[@id='loginpass']");
    private By pressLoginButton = By.xpath("//span[text()='Login']");
    private By produse = By.xpath("//ul//li//a[@title='Produse']");
    private By finisaje = By.xpath("//p//a[@title='Finisaje']");
    private By covoare = By.xpath("//p//a[@title='Mocheta, covoare, linoleum si presuri']");



    public void pressMyAcccount() {
        LOG.info("Press My Account");
        driver.findElement(enterMyAccount).click();
    }

    public void insertEmail(String loginEmail) {
        LOG.info("Inserting Login email");
        driver.findElement(enterEmail).sendKeys(loginEmail);
    }

    public void insertPassword(String loginPassword) {
        LOG.info("Inserting Login password");
        driver.findElement(enterPassword).sendKeys(loginPassword);
    }

    public void pressLoginButton() {
        LOG.info("pressing Login button");
        driver.findElement(pressLoginButton).click();
    }

    public void pressProduse() {
        LOG.info("press Produse");
        driver.findElement(produse).click();
    }

    public void pressFinisaje(){
        LOG.info("press Finisaje");
        driver.findElement(finisaje).click();
    }

    public void pressCovoare(){
        LOG.info("press covoare");
        driver.findElement(covoare).click();
    }

}
