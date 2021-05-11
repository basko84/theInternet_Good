package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.cssSelector("button[class='radius']");

    public ForgotPasswordPage(WebDriver driver) {
            this.driver = driver;
    }
    public void setEmail(String password) {
        driver.findElement(emailField).sendKeys(password);
    }

    public Forgot_password clickRetrievePasswordButton() {
        driver.findElement(retrievePasswordButton).click();
        return new Forgot_password(driver);
    }

}
