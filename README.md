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

