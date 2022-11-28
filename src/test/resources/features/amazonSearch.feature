Feature: Kullanici amazonda aramalar yapar
@grup1
  Scenario:TC01 kullanici amazonda iPhone aratir
    Given kullanici amazon anasayfasina gider
    Then kullanci iPhone aratir
   And kullanici arama sonuclarinin iPhone icerdigini gorur

@grup3
    Scenario: TC02 kullanici amazonda Selenium aratir
      Given kullanici amazon anasayfasina gider
      Then kullanci selenium aratir
      And kullanici arama sonuclarinin selenium icerdigini gorur

@grup2
  Scenario: TC03 kullanici amazonda java aratir
    Given kullanici amazon anasayfasina gider
    Then kullanci java aratir
    And kullanici arama sonuclarinin java icerdigini gorur
    And kullanici sayfayi kapatir




