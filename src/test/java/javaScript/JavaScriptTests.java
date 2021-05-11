package javaScript;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeDeepDomPage;

public class JavaScriptTests extends BaseTest {

    @Test
    public void testJS(){
        LargeDeepDomPage largeDeepDomPage = homePage.clickLargeDeepDom();
        largeDeepDomPage.scrollToTable();
    }

    @Test
    public void testScrollToParagraph(){
        InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(5);
    }
}
