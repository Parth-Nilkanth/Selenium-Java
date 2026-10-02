package login;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.example.testautomationu.pages.LoginPage;
import com.example.testautomationu.pages.SecureAreaPage;

import base.BaseTests;
public class LoginTests extends BaseTests {
    @Test   
    public void testSuccessfulLogin()
    {
        LoginPage loginPage = homePage.clickFormAuthentication();
        
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!" ), 
        "Alert text is incorrect");

    }
    
}
