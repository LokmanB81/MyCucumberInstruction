package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import pages.AutoExercisesPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class AutoExercisesSteps {

AutoExercisesPage autoExercisesPage=new AutoExercisesPage();

    @Then("kullanici Ana sayfanin gorunur oldugunu dogrular")
    public void kullanici_ana_sayfanin_gorunur_oldugunu_dogrular() {
        Assert.assertEquals("https://automationexercise.com/",Driver.getDriver().getCurrentUrl());
    }
    @Then("kullanici Test Case buttonu na tiklar")
    public void kullanici_test_case_buttonu_na_tiklar() {
       autoExercisesPage.testCaseMenu.click();
    }
    @Then("kullanici Test Case sayfasina geldigini dogrular")
    public void kullanici_test_case_sayfasina_geldigini_dogrular() {
        Assert.assertTrue(autoExercisesPage.testCasePageText.isDisplayed());
    }
    @Then("kullanici ilgili sayfanin ekran goruntusunu alir")
    public void kullanici_ilgili_sayfanin_ekran_goruntusunu_alir() throws IOException {
        ReusableMethods.getScreenshot("testCasesPageAll");
        /*
        TakesScreenshot ts=(TakesScreenshot) Driver.getDriver();
        File testCasesPage=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(testCasesPage,new File("screenShots/testCasePageMain.jpeg"));

         */
    }

    @Given("kullanici automationexercise.com urlsine gider")
    public void kullaniciAutomationexerciseComUrlsineGider() {
        Driver.getDriver().get("https://automationexercise.com");
    }


}
