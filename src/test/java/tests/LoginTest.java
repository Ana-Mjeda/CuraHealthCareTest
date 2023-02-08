package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AppointmentPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    private HomePage homePage;
    private LoginPage loginPage;
    private AppointmentPage appointmentPage;

    private final String username = "John Doe";
    private final String password = "ThisIsNotAPassword";
    @BeforeClass
    @Override
    public void beforeClass() {
        super.beforeClass();
        homePage = new HomePage(driver, driverWait);
        loginPage = new LoginPage(driver, driverWait);
        appointmentPage = new AppointmentPage(driver, driverWait);
    }

    @BeforeMethod
    @Override
    public void beforeMethod() {
        super.beforeMethod();
        homePage.openLogin();
    }

    @Test
    public void loginFormPresentedTest() {
        Assert.assertTrue(loginPage.isLoginFormPresent());
    }

    @Test(dependsOnMethods = "loginFormPresentedTest")
    public void loginTest(){
        loginPage.login(username, password);
        Assert.assertTrue(driver.getCurrentUrl().contains("#appointment"));
        Assert.assertTrue(appointmentPage.isAppointmentFormPresent());

    }
}
