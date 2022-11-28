package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DemoGuruWebPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class DemoGuruPageSteps {
    DemoGuruWebPage demoGuruWebPage=new DemoGuruWebPage();
    @Given("kulanici {string} anasayfasina gider")
    public void kulaniciAnasayfasinaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperties(arg0));
    }

    @And("{string}  sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenbaslik) {
        for (int i = 0; i <demoGuruWebPage.sutunBasliklar.size() ; i++) {
            int index=i+1;
            if(demoGuruWebPage.sutunBasliklar.get(i).getText().equals(istenenbaslik)){
                System.out.println(istenenbaslik);
                List<WebElement> sutunDegerleri=Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
                sutunDegerleri.forEach(t-> System.out.println(t.getText()));
            }
        }
    }

    @And("{string} altindaki degerleri yazdirir")
    public void altindakiDegerleriYazdirir(String tumSutunBasliklari) {
        for (int i = 0; i <demoGuruWebPage.sutunBasliklar.size() ; i++) {
                int index=i+1;
            if(demoGuruWebPage.sutunBasliklar.get(i).getText().equals(tumSutunBasliklari)){
                System.out.println(tumSutunBasliklari);
                List<WebElement> sutunDegerleri=Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
                sutunDegerleri.forEach(t-> System.out.println(t.getText()));
            }
        }
    }


}
