package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BlueRentalCarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentalStepDefs {
    BlueRentalCarPage blueRentalCarPage=new BlueRentalCarPage();
    @Given("kullanici blue rental anasayfasina gider")
    public void kullanici_blue_rental_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperties("blueRentalUrl"));
        blueRentalCarPage.loginButton.click();
    }


    @And("kullanici girilen sayfayi kapatir")
    public void kullanici_girilen_sayfayi_kapatir() {
       Driver.closeDriver();
    }

    @And("kullanici login olamadigini gorur")
    public void kullaniciLoginOlamadiginiGorur() {
        Assert.assertTrue(blueRentalCarPage.girisLoginButton.isDisplayed());
    }

    @Then("kullanici login butona tiklar")
    public void kullaniciLoginButonaTiklar() {
        blueRentalCarPage.girisLoginButton.click();
    }

    @And("kullanici  yanlis username {string} girer")
    public void kullaniciYanlisUsernameGirer(String userName) {
        blueRentalCarPage.eMailBox.sendKeys(userName);

    }

    @And("kullanici yanlis password {string} girer")
    public void kullaniciYanlisPasswordGirer(String password) {
        blueRentalCarPage.passwordBox.sendKeys(password);
    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int saniye)  {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
