package pages;

import io.cucumber.messages.internal.com.google.common.io.LittleEndianDataInputStream;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.stylesheets.LinkStyle;
import utilities.Driver;

import java.util.List;


public class DemoGuruWebPage {
    public DemoGuruWebPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> sutunBasliklar;


}
