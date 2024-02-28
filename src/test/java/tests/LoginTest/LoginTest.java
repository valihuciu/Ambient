package tests.LoginTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LoginTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(LoginTest.class);
    String loginEmail = "ghj@email.com";
    String loginPassword = "P@ssw0rd1234";

    @Test
    public void logIn() {

        LOG.info("Pressing My Account");
        loginPage.pressMyAcccount();

        LOG.info("Typing login email");
        loginPage.insertEmail(loginEmail);

        LOG.info("Typing login password");
        loginPage.insertPassword(loginPassword);

        LOG.info("Pressing Login Button");
        loginPage.pressLoginButton();


    }

}
