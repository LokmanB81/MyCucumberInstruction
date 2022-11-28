Feature: US001_Amazonda search background ile

  Background: amazon sayfasina gitme
    Given kullanici amazon anasayfasina gider

  Scenario:TC01 kullanici amazonda iPhone aratir
    Then kullanci iPhone aratir
    And kullanici arama sonuclarinin iPhone icerdigini gorur


  Scenario: TC02 kullanici amazonda Selenium aratir
    Then kullanci selenium aratir
    And kullanici arama sonuclarinin selenium icerdigini gorur


  Scenario: TC03 kullanici amazonda java aratir
    Then kullanci java aratir
    And kullanici arama sonuclarinin java icerdigini gorur
    And kullanici sayfayi kapatir