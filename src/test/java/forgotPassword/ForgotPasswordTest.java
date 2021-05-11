package forgotPassword;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.Forgot_password;
import pages.LoginPage;
import pages.SecureAreaPage;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testRetrievePassword() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordPage();
        forgotPasswordPage.setEmail("test@test.com");
        Forgot_password forgot_password = forgotPasswordPage.clickRetrievePasswordButton();
        Assert.assertEquals(forgot_password.getMassage(), "Internal Server Error", "Message is wrong");
    }
}
