package com.example.testautomationu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");
    
    LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void setUserName(String name)
    {
        driver.findElement(usernameField).sendKeys(name);
    }

    public void setPassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton()
    {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}