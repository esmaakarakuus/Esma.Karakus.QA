package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.ScreenshotUtil;


import java.time.Duration;


public class BaseTest {

    protected WebDriver driver;

    // setup: Test metodu öncesinde çalışacak, parametre olarak tarayıcı tipi alır.
    @BeforeMethod
    @Parameters({"The Browser"})
    public void setup(@Optional("Chrome") String browser) {
        createDriver(browser);
    }

    // createDriver: Tarayıcı adına göre uygun WebDriver nesnesi oluşturur.
    private void createDriver(String browserName) {
        driver = switch (browserName) {
            case "Chrome" -> new ChromeDriver();
            case "IE" -> new InternetExplorerDriver();
            case "Firefox" -> new FirefoxDriver();
            default -> throw new RuntimeException("Browser " + browserName + " is not supported");
        };

        // Tarayıcı penceresini tam ekran yapar
        driver.manage().window().maximize();
        // Tarayıcıya 30 saniyelik bir implicit wait (gizli bekleme) süresi ekler
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    // tearDown: Test metodu sonrasında çalışaır, test sırasında kullanılan WebDriver'ı kapatır.
    @AfterMethod
    public void tearDown(ITestResult result) {

        // Test başarısız olduysa ekran görüntüsü alır
        if (result.getStatus() == ITestResult.FAILURE) {
            ScreenshotUtil.takeScreenshot(driver, result.getName());
        }

        // Eğer WebDriver mevcutsa, tarayıcıyı kapatır
        if (driver != null) {
            driver.quit();
        }
    }
}
