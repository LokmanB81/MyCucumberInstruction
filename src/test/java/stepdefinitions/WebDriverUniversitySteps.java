package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v93.overlay.model.LineStyle;
import org.openqa.selenium.interactions.Actions;
import pages.WebDriverUniversityPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class WebDriverUniversitySteps {
    WebDriverUniversityPage webDriverUniversityPage=new WebDriverUniversityPage();
    ArrayList<String> windowHandles;

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String arg0) {
        Driver.getDriver().get(arg0);
    }

    @Then("kullanici Login Portala kadar asagi iner")
    public void kullaniciLoginPortalaKadarAsagiIner() throws InterruptedException {
        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(300);
    }

    @And("kullanici Login Portala tiklar")
    public void kullaniciLoginPortalaTiklar() {
        webDriverUniversityPage.loginPortalClick.click();

    }

    @And("kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {
       windowHandles=new ArrayList<>(Driver.getDriver().getWindowHandles());
      //  Driver.getDriver().switchTo().window(windowHandles.get(1));
    }

    @And("kullanici {string} kutusuna bilgileri girer")
    public void kullaniciKutusunaBilgileriGirer(String arg0) {
        webDriverUniversityPage.userNameBox.sendKeys(arg0);
    }

    @And("kullanici {string} bolumune bilgileri girer")
    public void kullaniciBolumuneBilgileriGirer(String arg0) {
        webDriverUniversityPage.userPasswordBox.sendKeys(arg0);
    }

    @And("kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
        webDriverUniversityPage.loginButton.click();
    }

    @And("kullanici Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void kullaniciPopupTaCikanYazininValidationFailedOldugunuTestEder() throws InterruptedException {
        Thread.sleep(3000);
        String expectedText="validation failed";
       String actualText=Driver.getDriver().switchTo().alert().getText();
       System.out.println(actualText);
        Assert.assertEquals(expectedText,actualText);
    }

    @And("kullanici Ok diyerek Popup'i kapatir")
    public void kullaniciOkDiyerekPopupIKapatir() throws InterruptedException {
        Thread.sleep(1000);
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() throws InterruptedException {
        Thread.sleep(1000);
        Driver.getDriver().switchTo().window(windowHandles.get(0));
    }

    @And("kullanici ilk sayfaya donuldugunu test eder")
    public void kullaniciIlkSayfayaDonuldugunuTestEder() {
        String expectedUrl="http://webdriveruniversity.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
}
