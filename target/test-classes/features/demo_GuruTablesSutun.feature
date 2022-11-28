Feature: US_010_Guru_Web_Tables altinda

  Scenario: TC_010_kullanici_sutun_basligi_ile_liste_alabilmeli
    Given kulanici "guruUrl" anasayfasina gider
    And "Group"  sutunundaki tum degerleri yazdirir


    Scenario Outline: TC_011 kullanci tum basliklardaki degerli alabilmeli
      Given kulanici "guruUrl" anasayfasina gider
      And "<tumSutunBasliklari>" altindaki degerleri yazdirir
      Examples:
        |  tumSutunBasliklari|
        |  Company            |
        |  Group              |
        |  Prev Close (Rs)    |
        |  Current Price (Rs)|
        |  % Change           |

