package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CareersPage extends BasePage{

    // WebElement'ler
    @FindBy(css = "#career-our-location")
    WebElement ourLocation;

    @FindBy(xpath = "//section[.//h2[contains(text(), 'Life at Insider')]]")
    WebElement lifeAtInsider;

    @FindBy(css = "#career-find-our-calling")
    WebElement teams;

    // Constructor
    public CareersPage(WebDriver driver) {
        super(driver);
    }

    // checkOurLocation: "Our Location" bölümünün görünür olup olmadığını kontrol eder
    public void checkOurLocation() {
        this.scrollToElement(ourLocation);
        Assert.assertTrue(isElementVisible(ourLocation), "Our Location Section is not visible");
    }

    // checkLifeAtInsider: "Life at Insider" bölümünün görünür olup olmadığını kontrol eder
    public void checkLifeAtInsider() {
        this.scrollToElement(lifeAtInsider);
        Assert.assertTrue(isElementVisible(lifeAtInsider), "Life at Insider Section is not visible");
    }

    // checkTeams: "Teams" bölümünün görünür olup olmadığını kontrol eder
    public void checkTeams() {
        this.scrollToElement(teams);
        Assert.assertTrue(isElementVisible(teams), "Teams Section is not visible");
    }
}
