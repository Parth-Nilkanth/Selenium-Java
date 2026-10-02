package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.testautomationu.pages.HomePage;
public class BaseTests
{
    private WebDriver driver;
    protected HomePage homePage;
    public void setUp() 
    {
        System.setProperty("webdriver.chrome.driver", "workspace/webdriver_java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        
        homePage = new HomePage(driver);
        // driver.quit();
    }
    public static void main(String argsp[])
    {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}