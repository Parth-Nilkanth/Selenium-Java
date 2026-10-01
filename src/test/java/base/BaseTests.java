package base;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseTests
{
    private WebDriver driver;
    public void setUp() 
    {
        System.setProperty("webdriver.chrome.driver", "workspace/webdriver_java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();
        
        driver.manage().window().fullscreen();
        System.out.println(driver.getTitle());
        
        // driver.quit();
    }
    public static void main(String argsp[])
    {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}