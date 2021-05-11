package ShiftingContentMenuElements;


import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShiftingContentMenuPage;
import pages.ShiftingContentPage;

import java.util.List;

public class ShiftingContentMenuElementsTests extends BaseTest {

    @Test
    public void testShiftingContentMenuElements() {
        ShiftingContentPage shiftingContentPage = homePage.clickShiftingContent();
        ShiftingContentMenuPage shiftingContentMenuPage = shiftingContentPage.clickShiftingContentMenu();
        Assert.assertEquals(shiftingContentMenuPage.quantityliLinks(), 5, "Wrong number of selected");
    }
}
