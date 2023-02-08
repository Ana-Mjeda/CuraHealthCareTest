package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"login\"]/div/div/div[2]/form")
    private WebElement loginForm;

    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public boolean isLoginFormPresent(){
        return loginForm.isDisplayed();
    }
}
