

package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public static WebDriver driver;

    public static void setUp() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(5));

        driver.manage().timeouts()
                .pageLoadTimeout(Duration.ofSeconds(30));

        driver.get("https://www.hotstar.com/");
    }

    public static void tearDown() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
