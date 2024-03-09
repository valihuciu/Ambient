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
    private By clickAcceptCookies = By.id("msbtn-accept-all");
    private By selectStore = By.xpath("//button[@data-bs-toggle='modal']");
    private By storeBistrita=By.xpath("//a[@title='Bistrita']");
    private By produse = By.xpath("//ul//li//a[@title='Produse']");
    private By finisaje = By.xpath("//a[text()='Finisaje']");
    private By ferestre = By.xpath("//p//a[@title='Ferestre']");
    private By addProduct = By.xpath("//button[@data-id='9481']");




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

    public void pressAcceptCookies() {
        LOG.info("Press Accept Cookies");
        driver.findElement(clickAcceptCookies).click();
    }

    public void pressStore(){
        LOG.info("press 'Alege magazin'");
        driver.findElement(selectStore).click();
    }

    public void selectStore(){
        LOG.info("select the 'Bistrita' store");
        driver.findElement(storeBistrita).click();
    }

    public void pressProduse() {
        LOG.info("press Produse");
        driver.findElement(produse).click();
    }

    public void pressFinisaje(){
        LOG.info("press Finisaje");
        driver.findElement(finisaje).click();
    }

    public void pressferestre(){
        LOG.info("press ferestre");
        driver.findElement(ferestre).click();
    }

    public void pressAddToCart(){
        LOG.info("press add product to cart");
        driver.findElement(addProduct).click();
    }



}
