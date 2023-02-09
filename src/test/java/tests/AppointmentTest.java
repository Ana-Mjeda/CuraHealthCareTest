package tests;

import org.testng.annotations.BeforeMethod;

public class AppointmentTest extends BaseTest{

    @BeforeMethod
    @Override
    public void beforeMethod() {
        super.beforeMethod();
        homePage.openLogin();
    }
}
