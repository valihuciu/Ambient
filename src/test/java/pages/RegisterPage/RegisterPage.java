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
    private By inputLastName = By.xpath("//input[@id='regfirstname']");
    private By inputFirstName = By.xpath("//input[@id='reglastname']");
    private By inputPhoneMumber = By.xpath("//input[@id='regphone']");
    private By inputRegisterEmail = By.xpath("//input[@id='regemail']");
    private By inputRegisterPassword = By.xpath("//input[@id='regpass']");
    private By clickAcceptCookies = By.id("msbtn-accept-all");
    private By clickAcceptCheckBox = By.xpath("//label[@for='regaccept']");
    //private By clickAcceptCheckBox = By.xpath("//div[@class='checkbox ck-terms']/label[@for='regaccept']");
    //private By CheckBox = By.xpath("//div[@class='checkbox ck-terms']/input[@type='checkbox']");

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

    public void pressAcceptCookies() {
        LOG.info("Press Accept Cookies");
        driver.findElement(clickAcceptCookies).click();
    }

    public void clickOnAcceptCheckBox() {
        LOG.info("Click on Accept Check Box");
        //Action(driver).move_to_element(label_element).perform()
        driver.findElement(clickAcceptCheckBox).click();
    }

}
