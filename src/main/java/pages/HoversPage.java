package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By picture = By.className("figure");
    private By caption = By.className("figcaption");


    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public PictureCaption hoverOverPicture(int index) {
        WebElement image = driver.findElements(picture).get(index);
        Actions action = new Actions(driver);
        action.moveToElement(image).perform();
        return new PictureCaption(image.findElement(caption));

    }

    public class PictureCaption {
        private WebElement caiption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public PictureCaption(WebElement caiption) {
            this.caiption = caiption;
        }

        public boolean captionIsDisplayed() {
            return caiption.isDisplayed();
        }

        public String getHeaderText() {
            return caiption.findElement(header).getText();
        }

        public String getLinkText() {
            return caiption.findElement(link).getText();
        }

        public String getLinkHref() {
            return caiption.findElement(link).getAttribute("href");
        }


    }
}
