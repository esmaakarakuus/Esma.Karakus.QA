# Insider Test Automation Project

## Proje Açıklaması
Bu proje, Insider'ın kariyer sayfası ve QA iş ilanları ile ilgili test senaryolarını otomatize etmek amacıyla geliştirilmiştir. 
Proje, **Java + Selenium** kullanılarak oluşturulmuş olup, **Page Object Model (POM)** prensiplerine uygun şekilde tasarlanmıştır.

## Otomatize Edilen Test Senaryoları

### 1. Insider Ana Sayfasının Açılması
- **Adım 1:** [Insider ana sayfasına](https://useinsider.com/) gidilir.
- **Adım 2:** Insider ana sayfasının başarıyla açıldığı doğrulanır.

### 2. Kariyer Sayfasının Kontrolü
- **Adım 1:** Navigasyon çubuğundaki **"Company"** menüsünden **"Careers"** seçeneği seçilir.
- **Adım 2:** Açılan kariyer sayfasında **"Locations", "Teams", "Life at Insider"** bölümlerinin görüntülendiği doğrulanır.

### 3. QA İş İlanlarının Filtrelenmesi
- **Adım 1:** [Quality Assurance iş ilanları](https://useinsider.com/careers/quality-assurance/) sayfasına gidilir.
- **Adım 2:** **"See all QA jobs"** butonuna tıklanır.
- **Adım 3:** İş ilanları, **"Location: Istanbul, Turkey"** ve **"Department: Quality Assurance"** filtreleri ile filtrelenir.
- **Adım 4:** Filtreleme sonucunda listelenen iş ilanlarının doğru olduğu doğrulanır.

### 4. İş İlanlarının Detaylarının Kontrolü
- **Adım 1:** Filtrelenen iş ilanlarının **"Position", "Department"** ve **"Location"** bilgilerinin doğru olduğu kontrol edilir.
- **Adım 2:** **"Position"** ve **"Department"** alanlarının **"Quality Assurance"**, **"Location"** alanının ise **"Istanbul, Turkey"** içerdiği doğrulanır.

### 5. Lever Başvuru Formuna Yönlendirme
- **Adım 1:** **"View Role"** butonuna tıklanır.
- **Adım 2:** Kullanıcının **Lever başvuru formu** sayfasına yönlendirildiği doğrulanır.

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
https://www.loom.com/share/7da209f9865747e5aa69611480f5df11?sid=3824bac6-4dea-4f04-914a-f806911245e3
