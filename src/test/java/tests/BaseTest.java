package tests;

import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.BuyPage.BuyPage;
import pages.LoginPage.LoginPage;
import pages.ProdusePage.ProdusePage;
import pages.RegisterPage.RegisterPage;

public class BaseTest {

    public RegisterPage registerPage = RegisterPage.getInstance();
    public LoginPage loginPage = LoginPage.getInstance();
    public ProdusePage produsePage = ProdusePage.getInstance();
    public BuyPage buyPage = BuyPage.getInstance();


    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

//    @AfterSuite
//    public void tearDown() {
//        BasePage.tearDown();
//
//    }
}