package frames;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

public class FrameTests extends BaseTest {

    @Test
    public void testEditor(){
        WYSIWYGEditorPage wysiwygEditorPage = homePage.clickWYSIWYGEditor();

        wysiwygEditorPage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "world!";

        wysiwygEditorPage.sendTextToArea(text1);
        wysiwygEditorPage.increaseIndent();
        wysiwygEditorPage.sendTextToArea(text2);

        Assert.assertEquals(wysiwygEditorPage.getTextAreaContent(), text1 + text2, "Wrong text in text area");

    }
}
