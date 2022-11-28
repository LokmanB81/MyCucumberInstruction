Feature: TC 001 trendyol ve morhipo
  Scenario: kullanici trendyol ve morhipoda ayni urunleri aratip sonuc adetlerini karlilastirir


        Given kullanici Google'a gider
        And   kulannici trendyol'u aratir
        And   kullanici trendyol linkini bulup siteye gider
        And   kullanci trendyolda makas aratir
        And   kullanici toplam urun sayısını alir
        And   kullanici yeni sekmede morhipo'ya gider
        And   kullanici morhipo sitesinde makas aratir
        And   kullanici morhipo toplam urun sayısını alir
        And   kullanici iki sitedeki toplam makas sayisini karsilastirir
        And   kullanici once urun sayisi fazla olan siteyi kapatir
        And   kullanici sonra diger sayfayida kapatir