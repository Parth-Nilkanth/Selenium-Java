package com.example.testautomationu.pages;

// page object model design pattern 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    private WebDriver driver;
     private By formAuthenticationLink = By.linkText("Form Authentication");
    public HomePage(WebDriver driver)
        {
                this.driver = driver;
        }
    
     public LoginPage clickFormAuthentication() 
     {
            driver.findElement(formAuthenticationLink).click();
            return new LoginPage(driver);
     }
     public DropdownPage clickDropDown() 
{
    System.out.println("Current URL: " + driver.getCurrentUrl());
    System.out.println("Page title: " + driver.getTitle());
    System.out.println("Page source contains Dropdown: "
            + driver.getPageSource().contains("Dropdown"));

    clickLink("Dropdown");
    return new DropdownPage(driver);
}
     private  void clickLink(String linkText)
     {
        driver.findElement(By.linkText(linkText)).click();
     }

     public HoversPage clickHovers()
     {
        clickLink("Hovers");
        return new HoversPage(driver);
     }
}
