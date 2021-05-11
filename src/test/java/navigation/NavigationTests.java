package navigation;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class NavigationTests extends BaseTest {

    @Test
    public void testNavigation(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        DynamicLoadingPage.Example1Page example1Page = dynamicLoadingPage.clickExample1();

    //    getWindowManager().goBack();
    //    getWindowManager().refresh();
    //    getWindowManager().goForward();
    //    getWindowManager().goTo("https://tut.by");
    }

    @Test
    public void testSwitchToTab(){
        homePage.clickMultipleWindows().setClickHereLink();
        getWindowManager().switchToTab("New Window");
    }
}
