package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShiftingContentPage {
    private WebDriver driver;

    public ShiftingContentPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement clickLink(String linktext) {
        return driver.findElement(By.linkText(linktext));
    }

    public ShiftingContentMenuPage clickShiftingContentMenu() {
        clickLink("Example 1: Menu Element").click();
        return new ShiftingContentMenuPage(driver);
    }
}
