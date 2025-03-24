package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String screenshotName) {
        try {
            // TakesScreenshot arayüzünü kullanarak ekran görüntüsü al
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Ekran görüntüsünü kaydetmek için dosya yolu belirle
            String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";
            FileUtils.copyFile(source, new File(screenshotPath));
            System.out.println("Screenshot taken: " + screenshotPath);
        } catch (IOException e) {
            System.out.println("Failed to take screenshot: " + e.getMessage());
        }
    }
}
