Feature: US_006 Kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC_001 Kullanici amazonda coklu arama yapar
        Given kullanici amazon anasayfasina gider
        Then "<arananKelime>" icin arama yapar
        Then kullanici arama sonucunu yazdirir
        Then kullanici sonucun "<arananKelime>" icerdigini dogrular

    Examples:
      | arananKelime |
          |pencil|
          |milk  |
          |tomatoe|
          |mouse  |

    Scenario: Sayfayi kapat
      Then kullanici sayfayi kapatir
