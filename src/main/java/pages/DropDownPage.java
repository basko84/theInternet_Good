package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDown(String option) {
        findDropDownElement().selectByVisibleText(option);
      /*  Select select = (Select) driver.findElement(dropdown);
        select.selectByVisibleText(option);*/
    }

    public List<String> getSelectOption() {
        List<WebElement> selectElements = findDropDownElement().getAllSelectedOptions();
        return selectElements.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement() {
        return new Select((driver.findElement(dropdown)));
    }

}
