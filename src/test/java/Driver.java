import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by vpykhalov on 4/6/2016.
 */

    public class Driver {
        public static WebDriver driver;

        public void startWebDriver() {
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        public void stopWebDriver() {
            driver.quit();
        }

    }


