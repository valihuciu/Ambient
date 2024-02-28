package pages.LoginPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class LoginPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(LoginPage.class);
    public static LoginPage instance;

    private LoginPage() {
    }

    public static LoginPage getInstance() {
        if (instance == null) {
            instance = new LoginPage();
        }
        return instance;
    }

    private By enterMyAccount = By.xpath("//i[@class='las la-user']");
    private By enterEmail = By.xpath("//input[@id='loginemail']");
    private By enterPassword = By.xpath("//input[@id='loginpass']");
    private By pressLoginButton = By.xpath("//span[text()='Login']");

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

}
