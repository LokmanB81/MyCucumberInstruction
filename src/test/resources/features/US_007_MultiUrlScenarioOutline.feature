Feature: US_007 Kullanici Coklu urle gider
  Scenario Outline: TC_001
    Given kullanici "<arananUrl>" sayfasina gider
    Then kullanici 2 sn bekler
    Examples:
      | arananUrl |
      |amazonUrl |
      |faceUrl |
      | saudecoUrl |
      | blueRentalUrl|
      |autoExerUrl|

    Scenario: sayfayi kapat
      Given kullanici sayfayi kapatir
