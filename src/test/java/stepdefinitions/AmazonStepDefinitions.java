package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
AmazonPage amazonPage=new AmazonPage();

  /*  @Given("kullanici amazon anasayfasina gider")
    public void kullaniciAmazonAnasayfasinaGider() {

           }


  @Given("kullanici amazon anasayfasina gider")
  public void kullaniciAmazonAnasayfasinaGider() {
      Driver.getDriver().get("https://www.amazon.com/");
      Driver.getDriver().navigate().refresh();
  }

    @And("kullanici arama sonuclarinin iPhone icerdigini gorur")
    public void kullaniciAramaSonuclarininIPhoneIcerdiginiGorur() {
        Assert.assertTrue(amazonPage.searchResult.getText().contains("iphone"));

    }

    @Then("kullanci iPhone aratir")
    public void kullanciIPhoneAratir() {

        amazonPage.searchBox.sendKeys("iphone", Keys.ENTER);
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }


    @Then("kullanci selenium aratir")
    public void kullanciSeleniumAratir() {
        amazonPage.searchBox.sendKeys("selenium",Keys.ENTER);
    }

    @And("kullanici arama sonuclarinin selenium icerdigini gorur")
    public void kullaniciAramaSonuclarininSeleniumIcerdiginiGorur() {
        Assert.assertTrue(amazonPage.searchResult.getText().contains("selenium"));

    }

    @Then("kullanci java aratir")
    public void kullanciJavaAratir() {
        amazonPage.searchBox.sendKeys("java",Keys.ENTER);
    }

    @And("kullanici arama sonuclarinin java icerdigini gorur")
    public void kullaniciAramaSonuclarininJavaIcerdiginiGorur() {
        Assert.assertTrue(amazonPage.searchResult.getText().contains("java"));
    }

    @And("kullanci {string} icin arama yapar")
    public void kullanci_icin_arama_yapar(String datalar) {
        amazonPage.searchBox.sendKeys(datalar, Keys.ENTER);
    }

    @Then("kullanici arama sonuclarinin {string} icerdigini gorur")
    public void kullanici_arama_sonuclarinin_icerdigini_gorur(String datalar) {
        Assert.assertTrue(amazonPage.searchResult.getText().contains(datalar));
    }


    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String arananKelime) {

        amazonPage.searchBox.sendKeys(arananKelime,Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        Assert.assertTrue(amazonPage.searchResult.getText().contains(arananKelime));
    }

    @Then("{string} icin arama yapar")
    public void icinAramaYapar(String arananKelime) {
        amazonPage.searchBox.sendKeys(arananKelime,Keys.ENTER);
    }

    @Then("kullanici arama sonucunu yazdirir")
    public void kullaniciAramaSonucunuYazdirir() {
        System.out.println(amazonPage.searchResult.getText());
    }

    @Then("kullanici sonucun {string} icerdigini dogrular")
    public void kullaniciSonucunIcerdiginiDogrular(String arananKelime) {
        Assert.assertTrue(amazonPage.searchResult.getText().contains(arananKelime));

    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arananUrl) {
        Driver.getDriver().get(ConfigReader.getProperties(arananUrl));
    }

   */


}
