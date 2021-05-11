package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShiftingContentMenuPage {
    private WebDriver driver;

    public ShiftingContentMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public int quantityliLinks() {
        List<WebElement> liLinks = driver.findElements(By.tagName("li"));
        return liLinks.size();
    }
}
