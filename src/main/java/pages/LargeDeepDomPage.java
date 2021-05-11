package pages;

import org.openqa.selenium.*;

public class LargeDeepDomPage {

    private WebDriver driver;
    private By tableLocator = By.id("large-table");

    public LargeDeepDomPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToTable(){
        WebElement table = driver.findElement(tableLocator);
   //     String script = "document.getElementById('large-table').scrollIntoView()";
        String script = "arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(script, table);

    }
}
