package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseTests
{
    private WebDriver driver;
    public void setUp() 
    {
        System.setProperty("webdriver.chrome.driver", "workspace/webdriver_java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
    public static void main(String argsp[])
    {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}