package Mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.time.Duration;

public abstract class BaseMobileTest {

    protected AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
//        DesiredCapabilities caps = new DesiredCapabilities();
//
//        String appPath = Paths.get("app", "ApiDemos-debug.apk").toAbsolutePath().toString();
//
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("automationName", "UiAutomator2");
//        caps.setCapability("deviceName", "Android Emulator");
//        caps.setCapability("app", appPath);
//
//
//
//        URL appiumServerUrl = new URL("http://127.0.0.1:4723/");
//        driver = new AndroidDriver(appiumServerUrl, caps);
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setDeviceName("Android Emulator");
        options.setAutomationName("UiAutomator2");
        options.setApp("C:\\Users\\Nour.Abd.El-Razek\\nour2.apk");

        this.driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                options
        );
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
