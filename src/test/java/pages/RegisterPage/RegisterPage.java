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


    public void pressMyAcccount() {
        LOG.info("Press My Account");
        driver.findElement(enterMyAccount).click();
    }

    public void insertFullname(String lName, String fName) {
        LOG.info("Insterting LastName and FirstName");
        driver.findElement(inputLastName).sendKeys(lName);
        driver.findElement(inputFirstName).sendKeys(fName);
    }

    public void insertPhoneNumber(String phone){
        LOG.info("Inserting Phone Number");
        driver.findElement(inputPhoneMumber).sendKeys(phone);
    }


}
