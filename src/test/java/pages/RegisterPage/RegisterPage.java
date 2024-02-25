package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By enterMyAccount = By.xpath("//i[@class='las la-user']");
    private By inputLastName = By.id("regfirstname");
    private By inputFirstName = By.id("reglastname");
    private By inputPhoneMumber = By.id("regphone");
    private By inputRegisterEmail = By.id("regemail");
    private By inputRegisterPassword = By.id("regpass");
    private By clickAcceptCheckBox = By.id("regaccept");


    public void pressMyAcccount() {
        LOG.info("Press My Account");
        driver.findElement(enterMyAccount).click();
    }

    public void insertFullname(String lName, String fName) {
        LOG.info("Insterting LastName and FirstName");
        driver.findElement(inputLastName).sendKeys(lName);
        driver.findElement(inputFirstName).sendKeys(fName);
    }

    public void insertPhoneNumber(String phone) {
        LOG.info("Inserting Phone Number");
        driver.findElement(inputPhoneMumber).sendKeys(phone);
    }

    public void insertRegisterEmail(String regEmail) {
        LOG.info("Inserting Registration Email");
        driver.findElement(inputRegisterEmail).sendKeys(regEmail);
    }

    public void insertRegisterPassword(String regPassword) {
        LOG.info("Inserting Registration Password");
        driver.findElement(inputRegisterPassword).sendKeys(regPassword);
    }

//    public void clickOnAcceptCheckBox() {
//        LOG.info("Click on Accept Check Box");
//        driver.findElement(clickAcceptCheckBox).click();
//    }

}
