package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersQaPage extends BasePage {

    // WebElement
    @FindBy(css = "#page-head [class*=btn]")
            WebElement seeAllQAJobsBtn;

    // Constructor
    public CareersQaPage(WebDriver driver) {
        super(driver);
    }

    // navigateToQA: QA kariyer sayfasına yönlendirir
    public void navigateToQA() {
        this.driver.get("https://useinsider.com/careers/quality-assurance/");
    }

    // clickSeeAllQAJobsBtn: "See All QA Jobs" butonuna tıklar
    public void clickSeeAllQAJobsBtn() {
        this.click(seeAllQAJobsBtn);
    }
}


