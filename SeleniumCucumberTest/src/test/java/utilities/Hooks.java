package utilities;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static BrowserDriver driver;

    @Before
    public void setUp() {
        driver = new BrowserDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
