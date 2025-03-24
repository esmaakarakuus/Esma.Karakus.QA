Insider Test Automation Project
Bu proje, Insider'ın kariyer sayfası ve QA iş ilanları ile ilgili test senaryolarını otomatize etmek için oluşturulmuştur. Proje, Java + Selenium kullanılarak geliştirilmiştir ve Page Object Model (POM) prensiplerine uygun olarak tasarlanmıştır.

Test Senaryoları
Aşağıdaki test senaryoları otomatize edilmiştir:

Insider Ana Sayfasının Açılması:

https://useinsider.com/ adresine gidilir.

Insider ana sayfasının başarıyla açıldığı kontrol edilir.

Kariyer Sayfasının Kontrolü:

Navigasyon çubuğundaki "Company" menüsünden "Careers" seçeneği seçilir.

Kariyer sayfasının açıldığı ve "Locations", "Teams", "Life at Insider" bölümlerinin görüntülendiği kontrol edilir.

QA İş İlanlarının Filtrelenmesi:

https://useinsider.com/careers/quality-assurance/ adresine gidilir.

"See all QA jobs" butonuna tıklanır.

İş ilanları, "Location: Istanbul, Turkey" ve "Department: Quality Assurance" filtreleri kullanılarak filtrelenir.

Filtrelenen iş ilanlarının listelendiği kontrol edilir.

İş İlanlarının Detaylarının Kontrolü:

Filtrelenen iş ilanlarının "Position", "Department" ve "Location" bilgilerinin doğru olduğu kontrol edilir.

"Position" ve "Department" alanlarının "Quality Assurance", "Location" alanının ise "Istanbul, Turkey" içerdiği doğrulanır.

Lever Başvuru Formuna Yönlendirme:

"View Role" butonuna tıklanır.


## Proje Yapısı
```
src
├── main
│   ├── java
│   │   ├── pages
│   │   │   ├── BasePage.java
│   │   │   ├── HomePage.java
│   │   │   ├── CareersPage.java
│   │   │   ├── CareersQaPage.java
│   │   │   ├── OpenPositionsPage.java
│   │   ├── utilities
│   │   │   ├── Log.java
│   │   │   ├── ScreenshotUtil.java
│   ├── resources
│   │   ├── log4j2.properties
├── test
│   ├── java
│   │   ├── tests
│   │   │   ├── BaseTest.java 
│   │   │   ├── InsiderCareerTestFlow.java
```

## Log4j Entegrasyonu
Projede **Log4j** kullanılarak test süreci detaylı bir şekilde loglanmaktadır. Loglar, konsola ve dosyaya yazılır. Log4j konfigürasyonu **log4j2.properties** dosyasında yapılmıştır.

## Ekran Görüntüsü ve Video Kaydı

### Ekran Görüntüsü Alma
Test adımlarından herhangi biri başarısız olursa, otomatik olarak ekran görüntüsü alınır ve **screenshots** klasörüne kaydedilir.

### Ekran Videosu Kaydı
