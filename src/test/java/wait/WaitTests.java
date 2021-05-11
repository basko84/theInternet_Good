package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class WaitTests extends BaseTest {

    @Test

    public void testWaits(){

        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        DynamicLoadingPage.Example1Page example1Page = dynamicLoadingPage.clickExample1();

        example1Page.clickStartButton();
        Assert.assertEquals(example1Page.getFinishText(), "Hello World!", "Wrong finish text");
    }
}
