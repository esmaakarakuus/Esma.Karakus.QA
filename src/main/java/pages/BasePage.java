package pages;

import utilities.Log;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {

    protected final WebDriver driver;

    // Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // scrollToElement: Verilen WebElement'e sayfayı kaydırır.
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false)", element);
        Log.pass("Scroll to Element: " + element.getText());
        waitMs(1500);
    }

    // click: Verilen WebElement'e tıklama işlemi yapar.
    public void click(WebElement element) {
        scrollToElement(element);
        var text = element.getText();
        element.click();
        Log.pass("Click Element: " + text);
    }

    // waitMs: Belirtilen milisaniye kadar bekler.
    public void waitMs(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException("Exception while waiting for " + milliseconds + " milliseconds", e);
        }
    }

    // hoverElement: Verilen WebElement üzerine fareyi getirir.
    public void hoverElement(WebElement element) {
        this.scrollToElement(element);
        var elementText = element.getText();
        var actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        Log.pass("Move to Element: " + elementText);
    }

    // switchToTab: Belirtilen indeks numarasındaki sekmeye geçiş yapar.
    public void switchToTab(int index) {
        var windowHandles = driver.getWindowHandles().toArray(String[]::new);
        driver.switchTo().window(windowHandles[index]);
    }

    // isElementVisible: Elementin görünür olup olmadığını kontrol eder.
    public boolean isElementVisible(WebElement element) {
        try {
            var wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (TimeoutException ignored) {
            return false;
        }
    }
}

