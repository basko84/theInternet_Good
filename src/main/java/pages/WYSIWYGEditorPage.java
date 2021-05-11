package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;

    private String frameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.xpath(".//button[@title='Increase indent']");

    public WYSIWYGEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void clearTextArea(){
        switchToTextArea();
        driver.findElement(textArea).clear();
        switchToMainArea();

    }

    public void switchToTextArea(){
        driver.switchTo().frame(frameId);
    }

    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void sendTextToArea(String text){
        switchToTextArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void increaseIndent(){
        driver.findElement(increaseIndentButton).click();
    }

    public String getTextAreaContent(){
        switchToTextArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
