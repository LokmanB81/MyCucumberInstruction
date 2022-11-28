package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorDataTablePage;
import utilities.Driver;

import java.awt.dnd.DragGestureEvent;

public class EditorDataTablesSteps {
    EditorDataTablePage dataTablePage=new EditorDataTablePage();
    Actions action=new Actions(Driver.getDriver());
    @When("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(url);
    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTablePage.dataTableNewButton.click();
    }

    @And("tum bilgileri girer")
    public void tumBilgileriGirer() {
        action.click(dataTablePage.createNewFirstNameBox).sendKeys("Ali")
                .sendKeys(Keys.TAB).sendKeys("Can")
                .sendKeys(Keys.TAB).sendKeys("Software Engineer")
                .sendKeys(Keys.TAB).sendKeys("Istanbul")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys("2022-10-11")
                .sendKeys(Keys.TAB).sendKeys("100000").perform();

    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        dataTablePage.createNewFormButton.click();
    }

    @When("kullanici ilk isim ile arama yapar")
    public void kullaniciIlkIsimIleAramaYapar() {
        dataTablePage.tableSearchBox.sendKeys("Ali",Keys.ENTER);
    }

    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isimBolumundeIsmininOldugunuDogrular() {
        System.out.println(dataTablePage.tableNameColumn.toString());
    }
}
