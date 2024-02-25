package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.RegisterPage.RegisterPage;

public class BaseTest {

    public RegisterPage registerPage = RegisterPage.getInstance();

    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }
    @AfterSuite
    public void tearDown(){
        BasePage.tearDown();

    }
}