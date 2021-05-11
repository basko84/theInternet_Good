package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploaderPage;

public class FileUploadTests extends BaseTest {
    @Test
    public void testFileUpload(){
        FileUploaderPage fileUploaderPage = homePage.clickFileUploader();
        fileUploaderPage.uploadFile("C:/Users/OLGA/IdeaProjects/theInternet_Good/src/test/chromedriver.exe");
        Assert.assertEquals(fileUploaderPage.getUploadFiles(), "chromedriver.exe", "Wrong");
    }
}
