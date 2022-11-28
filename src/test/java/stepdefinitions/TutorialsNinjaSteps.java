package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.TutorialsNinjaPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TutorialsNinjaSteps {
    TutorialsNinjaPage tutorialsNinjaPage=new TutorialsNinjaPage();
    List<String> sepetUrunleri=new ArrayList<>();
    List<String> sayfaUrunleri=new ArrayList<>();
    @Given("Kullanici tutorials anasaysaina gider")
    public void kullanici_tutorials_anasaysaina_gider() {
        Driver.getDriver().get("http://tutorialsninja.com/demo/index.php?route=common/home");
    }

    @Then("Kullanici Phones & PDAs a tiklar")
    public void kullaniciPhonesPDAsATiklar() {
        tutorialsNinjaPage.phonesPDAsButton.click();
    }

    @Then("Kullanici telefon marka isimlerini log eder")
    public void kullaniciTelefonMarkaIsimleriniLogEder() {

        for (WebElement w:tutorialsNinjaPage.urunIsimleri
        ) {
            sayfaUrunleri.add(w.getText());
        }
        sayfaUrunleri.forEach(t-> System.out.println(t));

    }

    @Then("Kullanici tum ogeleri sepete ekler")
    public void kullaniciTumOgeleriSepeteEkler() {
        tutorialsNinjaPage.urunlerAddCartButton.forEach(t-> t.click());
    }

    @Then("Kullanici sepete tiklar")
    public void kullaniciSepeteTiklar() throws InterruptedException {
        Thread.sleep(300);
        tutorialsNinjaPage.AddCartButton.click();
    }

    @Then("Kullanici sepetteki urun isimlerini log eder")
    public void kullaniciSepettekiUrunIsimleriniLogEder() throws InterruptedException {

        Thread.sleep(300);

        for (WebElement w:tutorialsNinjaPage.sepetUrunIsimleri
        ) {
            sepetUrunleri.add(w.getText());
        }
        sepetUrunleri.forEach(t-> System.out.println(t));
    }


    @Then("Kullanici sepet ve sayfadaki urunlerin ayni oldugunu dogrular")
    public void kullaniciSepetVeSayfadakiUrunlerinAyniOldugunuDogrular() {

        Assert.assertTrue(sayfaUrunleri.containsAll(sepetUrunleri));
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
       // Driver.closeDriver();
    }
}
