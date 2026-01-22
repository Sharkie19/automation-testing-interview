package Web;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BaseWebTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            takeScreenshot(result.getMethod().getMethodName());
        }
        if (driver != null) {
            driver.quit();
        }
    }
    private void takeScreenshot(String testName) {
        try {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File screenshotsDir = new File("screenshots");
            if (!screenshotsDir.exists()) {
                //noinspection ResultOfMethodCallIgnored
                screenshotsDir.mkdirs();
            }

            File destFile = new File(screenshotsDir,
                    testName + "_" + timestamp + ".png");

            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot saved to: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Could not save screenshot: " + e.getMessage());
        }
    }
}

