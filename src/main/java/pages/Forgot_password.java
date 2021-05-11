package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgot_password {

    private WebDriver driver;
    private By messageField = By.cssSelector("body");

    public Forgot_password(WebDriver driver) {
        this.driver = driver;
    }

    public String getMassage() {
        return driver.findElement(messageField).getText();
    }

}
