package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    // WebElement'ler
    @FindBy(xpath = "//*[contains(@class, 'nav-item')]//*[contains(text(), 'Company')]")
        WebElement companyText;

    @FindBy(xpath = "//*[@class='dropdown-sub' and contains(text(), 'Careers')]")
        WebElement careerText;

    @FindBy(css = "#wt-cli-accept-all-btn")
        WebElement acceptCookieButton;

    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // navigateHomePage: Ana sayfaya gitmek ve çerezleri kabul etmek için kullanılır
    public void navigateHomePage() {
        this.driver.get("https://useinsider.com/");
        this.acceptCookies();
    }

    // acceptCookies: Çerez kabul etme butonuna tıklar
    private void acceptCookies() {
        this.click(acceptCookieButton);
    }

    // clickCompanyMenu: "Company" menüsüne tıklar
    public void clickCompanyMenu() {
        this.click(companyText);
    }

    // clickCareerMenu: "Careers" menüsüne tıklar
    public void clickCareerMenu() {
        this.click(careerText);
        }
    }
