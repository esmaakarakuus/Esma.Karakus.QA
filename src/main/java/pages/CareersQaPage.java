package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaCareerPage extends BasePage {

    // WebElement, sayfa üzerindeki öğeleri temsil eder
    @FindBy(css = "#page-head [class*=btn]") // "See All QA Jobs" butonunu temsil eden WebElement
            WebElement seeAllQAJobsBtn;

    // Constructor: Bu constructor, basePage sınıfını çağırarak WebDriver'ı alır ve sayfa nesnelerini başlatır
    public QaCareerPage(WebDriver driver) {
        super(driver); // basePage constructor'ını çağırarak WebDriver'ı başlatır
    }

    // navigateToQA: QA kariyer sayfasına yönlendiren metod
    public void navigateToQA() {
        this.driver.get("https://useinsider.com/careers/quality-assurance/"); // QA kariyer sayfasını açar
    }

    // clickSeeAllQAJobsBtn: "See All QA Jobs" butonuna tıklama metodudur
    public void clickSeeAllQAJobsBtn() {
        this.click(seeAllQAJobsBtn); // Butona tıklar
    }


}

