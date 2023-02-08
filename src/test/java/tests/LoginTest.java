package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    private HomePage homePage;

    private LoginPage loginPage;

    @BeforeClass
    @Override
    public void beforeClass() {
        super.beforeClass();
        homePage = new HomePage(driver, driverWait);
        loginPage = new LoginPage(driver, driverWait);
    }

    @Test
    public void loginFormPresentedTest() {

        homePage.openLogin();
        Assert.assertTrue(loginPage.isLoginFormPresent());

    }
}
