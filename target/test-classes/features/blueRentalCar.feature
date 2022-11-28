Feature: TC001 negative login
@rent1
  Scenario Outline: TC001 kullanici yanlis kullanici adi ve sifre ile login olamaz

    Given kullanici blue rental anasayfasina gider
    And kullanici  yanlis username "<userName>" girer
    And kullanici yanlis password "<password>" girer
    Then kullanici login butona tiklar
    And kullanici login olamadigini gorur
    And kullanici 2 sn bekler


    Examples:
      | userName | password |
    |lll@gmail.com|1234   |
    |kkk@gmail.com|4321   |
    |ttt@gmail.com|1122   |

  @rent2
    Scenario:
      And kullanici girilen sayfayi kapatir

