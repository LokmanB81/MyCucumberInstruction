#// http://tutorialsninja.com/demo/index.php?route=common/home sayfasına gidiniz
#// Phones & PDAs'a tıklayınız
#// Telefonların markalarını alınız
#// Tüm öğeleri sepete ekleyiniz
#// Sepete tıklayınız
#// Sepetteki isimleri alınız
#// Sepetteki ve sayfadaki ürünlerin doğru olduğunu karşılaştırınız

  Feature: TC001 Tutorials sayfa testi
    @tutorialNinja
    Scenario: Tutorials sayfasinda urunleri sepete ekler

      Given Kullanici tutorials anasaysaina gider
      Then  Kullanici Phones & PDAs a tiklar
      Then  Kullanici telefon marka isimlerini log eder
      Then  Kullanici tum ogeleri sepete ekler
      Then  Kullanici sepete tiklar
      Then  Kullanici sepetteki urun isimlerini log eder
      Then  Kullanici sepet ve sayfadaki urunlerin ayni oldugunu dogrular
      And   Kullanici sayfayi kapatir