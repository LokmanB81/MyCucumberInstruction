Feature:TC001 amazonda farkli urunler arama
  Scenario Outline: TC001 amazon arama testi

    Given kullanici amazon anasayfasina gider
    And kullanci "<datalar>" icin arama yapar
    Then kullanici arama sonuclarinin "<datalar>" icerdigini gorur
    And kullanici sayfayi kapatir
    Examples:
      | datalar|
    |iphone  |
    |java    |
    |mouse   |
    |selenium|
