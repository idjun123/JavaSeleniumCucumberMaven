package utilities;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BrowserDriver {
    public static WebDriver driver;
    public static ChromeOptions options;
    public static Wait<WebDriver> wait;
    public BrowserDriver() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        wait =
                new FluentWait<>(this.driver)
                        .withTimeout(Duration.ofSeconds(5))
                        .pollingEvery(Duration.ofMillis(500))
                        .ignoring(ElementNotInteractableException.class);

        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
    }

    public void close(){
        this.driver.close();
    }

}
