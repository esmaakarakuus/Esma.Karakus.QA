package tests;

import org.testng.annotations.*;
import pages.*;

public class InsiderCareerTestFlow extends BaseTest {

    @Test
    public void CareerTest() {

        // Sayfa nesneleri
        var insiderhomePage = new HomePage(driver); // Ana sayfa nesnesi
        var careerPage = new CareersPage(driver); // Kariyer sayfası nesnesi
        var qaCareerPage = new CareersQaPage(driver); // QA kariyer sayfası nesnesi
        var OpenPositionsPage = new OpenPositionsPage(driver); // Açık pozisyonlar sayfası nesnesi

        // Ana sayfaya gidilir ve çerezler kabul edilir
        insiderhomePage.navigateHomePage();

        // "Company" menüsüne tıklanır
        insiderhomePage.clickCompanyMenu();

        // "Careers" menüsüne tıklanır
        insiderhomePage.clickCareerMenu();

        // "Life at Insider", "Teams" ve "Our Location" bölümleri kontrol edilir
        careerPage.checkLifeAtInsider();
        careerPage.checkTeams();
        careerPage.checkOurLocation();

        // QA kariyer sayfasına gidilir
        qaCareerPage.navigateToQA();

        // "See All QA Jobs" butonuna tıklanır
        qaCareerPage.clickSeeAllQAJobsBtn();

        // Konum filtresi olarak "İstanbul, Türkiye" seçilir
        OpenPositionsPage.selectLocation();

        // Departman filtresi olarak "Quality Assurance" seçilir
        OpenPositionsPage.selectDepartment();

        // Filtrelenen iş ilanlarının ilgili kriterleri karşıladığı kontrol edilir
        OpenPositionsPage.checkFilteredJobs();

        // İlk iş ilanını seç ve "View Role" butonuna tıklanır
        OpenPositionsPage.selectFirstJob();

        // Lever başvuru formuna yönlendirme kontrol edilir
        OpenPositionsPage.controlNavigateToLever();
    }

}
