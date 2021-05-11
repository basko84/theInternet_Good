package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTest extends BaseTest {
    @Test
    public void testAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickAlertButton();
        alertsPage.acceptPopup();
       // Assert.assertEquals(alertsPage.getResultText(), "You successfully clicked an alert\n", "Wrong" );
        Assert.assertEquals(alertsPage.getResultText(), "You successfully clicked an alert", "Wrong" );
    }

    @Test
    public void testConfirm(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickConfirmButton();
        String confirmText = alertsPage.getConfirmText();
        alertsPage.dismissPopup();
        Assert.assertEquals(confirmText, "I am a JS Confirm", "Wrong confirm text");
        Assert.assertEquals(alertsPage.getResultText(), "You clicked: Cancel", "Wrong confirm text");
    }
    @Test
    public void testPrompt(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickPromptButton();
        String text = "Hey there!";
        alertsPage.setPromptInput(text);
        alertsPage.acceptPopup();
        Assert.assertEquals(alertsPage.getResultText(), "You entered: " + text, "Wrong prompt text");
    }
}
