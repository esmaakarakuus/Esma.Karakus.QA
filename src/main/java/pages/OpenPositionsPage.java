package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.util.List;
import utilities.Log;


public class OpenPositionsPage extends BasePage {

    private String selectedJob; // Seçilen işin adını tutan değişken

    // WebElement'ler
    @FindBy(xpath = "//span[@id='select2-filter-by-location-container']")
    WebElement locationDropdown;

    @FindBy(xpath = "//li[contains(@id, 'Istanbul, Turkiye')]")
    WebElement istanbulTurkeyOption;

    @FindBy(xpath = "//span[@id='select2-filter-by-department-container']")
    WebElement departmentDropdown;

    @FindBy(xpath = "//li[contains(@id, 'Quality Assurance')]")
    WebElement qualityAssuranceOption;

    @FindBy(xpath = "//div[@class='position-location text-large']")
    List<WebElement> locations;

    @FindBy(xpath = "//div[@class='position-department']")
    List<WebElement> departments;

    @FindBy(xpath = "//div[@class='position-title']")
    List<WebElement> positions;

    @FindBy(xpath = "(//a[contains(text(), 'View Role')])[1]")
    WebElement firstViewRoleButton;

    @FindBy(css = ".position-list-item") // İş ilanı listesi
    List<WebElement> positionListItems;

    @FindBy(css = ".posting-headline h2") // İş ilanı başlığı
    WebElement positionHeadline;

    // Constructor
    public OpenPositionsPage(WebDriver driver) {
        super(driver);
    }

    //Konum seçme işlemi yapar
    public void selectLocation() {
        this.scrollToElement(locationDropdown);
        this.click(locationDropdown);
        this.click(istanbulTurkeyOption);
    }

    // Departman seçme işlemi yapar
    public void selectDepartment() {
        this.waitMs(1000);
        this.click(departmentDropdown); // Dropdown'u aç
        this.click(qualityAssuranceOption); // QA seçeneğini seç
    }

    // Filtrelenmiş iş ilanlarının belirtilen kriterleri karşıladığını kontrol eder
    public void checkFilteredJobs() {
        for (int i = 0; i < positions.size(); i++) {
            String position = positions.get(i).getText();
            String department = departments.get(i).getText();
            String location = locations.get(i).getText();

            // Position kontrolü
            Assert.assertTrue(position.contains("Quality Assurance"),
                    "Position does not contain 'Quality Assurance'. Actual: " + position);

            // Department kontrolü
            Assert.assertTrue(department.contains("Quality Assurance"),
                    "Department does not contain 'Quality Assurance'. Actual: " + department);

            // Location kontrolü
            Assert.assertTrue(location.contains("Istanbul, Turkey"),
                    "Location does not contain 'Istanbul, Turkey'. Actual: " + location);
        }
    }

    // İlk iş ilanını seçer ve "View Role" butonuna tıklar
    public void selectFirstJob() {
        WebElement firstJob = positionListItems.get(0);
        this.hoverElement(firstJob);
        this.selectedJob = firstJob.getText();
        this.click(firstViewRoleButton);
        this.switchToTab(1);
    }

    // Lever başvuru formuna yönlendirme kontrolü yapar
    public void controlNavigateToLever() {
        String actualJob = positionHeadline.getText();
        Log.pass("Expected: " + selectedJob);
        Log.pass("Actual: " + actualJob);
        Assert.assertTrue(selectedJob.contains(actualJob), "Job is not selected");
    }
}
