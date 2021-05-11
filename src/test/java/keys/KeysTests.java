package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeysTests extends BaseTest {
    @Test
    public void testBackSpace() {
        KeyPressesPage keysPressesPage=homePage.clickKeyPressesPage();
        keysPressesPage.enterText("Hello world!" + Keys.BACK_SPACE);
        Assert.assertEquals(keysPressesPage.getResult(),"You entered: BACK_SPACE","Result is wrong");
    }
    @Test
    public void  testShortCuts(){
        KeyPressesPage keysPressesPage=homePage.clickKeyPressesPage();
        keysPressesPage.enterText("Hello world!" + Keys.BACK_SPACE);
        Assert.assertEquals(keysPressesPage.getTargetValue(),"Hello world","Wrong value");
    }
}
