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
    String regEmail = "abc@email.com";
    String regPassword = "P@ssw0rd";

    @Test
    public void fillRegister() {

        LOG.info("Pressing My Account");
        registerPage.pressMyAcccount();

        LOG.info("Typing Full Name");
        registerPage.insertFullname(lName, fName);

        LOG.info("Typing Phone numeber");
        registerPage.insertPhoneNumber(phone);

        LOG.info("Typing Registration email");
        registerPage.insertRegisterEmail(regEmail);

        LOG.info("Typing registration paswword");
        registerPage.insertRegisterPassword(regPassword);

//        LOG.info("Clicking on Accept Check Box");
//        registerPage.clickOnAcceptCheckBox();

    }

}
