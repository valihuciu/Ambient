package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    String lName = "Marcu";
    String fName = "Elena";
    String phone = "0721123456";

    @Test
    public void fillRegister() {

        LOG.info("Pressing My Account");
        registerPage.pressMyAcccount();

        LOG.info("Tiping Full Name");
        registerPage.insertFullname(lName, fName);

        LOG.info("Typing Phone numeber");
        registerPage.insertPhoneNumber(phone);

    }

}
