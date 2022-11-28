Feature: US_010 Kullanici data ekleyebilmeli
  Scenario: TC_001 Kullanici sayfada 5 yeni kayit ekler

    When kullanici "https://editor.datatables.net" adresine gider
    Then new butonuna basar
    And tum bilgileri girer
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar
    Then isim bolumunde isminin oldugunu dogrular
   # And kullanici sayfayi kapatir
