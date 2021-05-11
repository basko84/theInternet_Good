package dropDown;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

public class DropDownTests extends BaseTest {
    @Test
    public void testSelectOption() {
        DropDownPage dropDownPage = homePage.clickDropDownPage();
        String option = "Option 1";
        dropDownPage.selectFromDown(option);
        List<String> selectedOption = dropDownPage.getSelectOption();
        Assert.assertEquals(selectedOption.size(), 1, "Wrong number of selected");
        Assert.assertTrue(selectedOption.contains(option), "Option not selected");

    }
}
