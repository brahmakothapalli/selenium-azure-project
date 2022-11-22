package PageTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Objects;

public class SeleniumManagerTests {

    @Test
    public void testLaunchingChromeBrowser_001() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        assert Objects.equals(title, "Downloads | Selenium");
        driver.quit();
    }

    @Test
    public void testLaunchingFirefoxBrowser_002() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        assert Objects.equals(url, "https://www.selenium.dev/downloads/");
        driver.quit();
    }

    @Test
    public void testLaunchingEdgeBrowser_003() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        assert Objects.equals(title, "Amazon.com. Spend less. Smile more.");
        driver.quit();
    }
}
