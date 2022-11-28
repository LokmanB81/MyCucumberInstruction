Feature: US002 Parametre Kullanimi
  Scenario: TC001 Kullanici amazonda parametreli arama yapar
    Given kullanici amazon anasayfasina gider
    Then  kullanici "nutella " icin arama yapar
    And   sonuclarin "nutella" icerdigini test eder
    And   kullanici sayfayi kapatir

