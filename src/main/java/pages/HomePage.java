package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement clickLink(String linktext) {
        return driver.findElement(By.linkText(linktext));
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication").click();
        return new LoginPage(driver);
    }

    public ShiftingContentPage clickShiftingContent() {
        clickLink("Shifting Content").click();
        return new ShiftingContentPage(driver);
    }

    public DropDownPage clickDropDownPage() {
        clickLink("Dropdown").click();
        return new DropDownPage(driver);
    }

    public HoversPage clickHoversPage() {
        clickLink("Hovers").click();
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPressesPage() {
        clickLink("Key Presses").click();
        return new KeyPressesPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordPage() {
        clickLink("Forgot Password").click();
        return new ForgotPasswordPage(driver);
    }

/*    public AlertsPage clickAlertsPage() {
        clickLink("JavaScript Alerts").click();
        return new AlertsPage(driver);
    }
*/
    public AlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts").click();
        return new AlertsPage(driver);
    }

    public FileUploaderPage clickFileUploader() {
        clickLink("File Upload").click();
        return new FileUploaderPage(driver);
    }

    public EntryAdPage clickEntryAd() {
        clickLink("Entry Ad").click();
        return new EntryAdPage(driver);
    }

    public WYSIWYGEditorPage clickWYSIWYGEditor() {
        clickLink("WYSIWYG Editor").click();
        return new WYSIWYGEditorPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        clickLink("Dynamic Loading").click();
        return new DynamicLoadingPage(driver);
    }
    public LargeDeepDomPage clickLargeDeepDom() {
        clickLink("Large & Deep DOM").click();
        return new LargeDeepDomPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll() {
        clickLink("Infinite Scroll").click();
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows() {
        clickLink("Multiple Windows").click();
        return new MultipleWindowsPage(driver);
    }

}
