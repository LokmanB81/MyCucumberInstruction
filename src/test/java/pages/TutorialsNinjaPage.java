package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialsNinjaPage {
    public TutorialsNinjaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Phones & PDAs']")
    public WebElement phonesPDAsButton;

    @FindBy (xpath = "//h4")
    public List<WebElement> urunIsimleri;

    @FindBy (xpath = "//*[@class='button-group']")
    public List<WebElement> urunlerAddCartButton;

    @FindBy (xpath = "//*[@id='cart']")
    public WebElement AddCartButton;

    @FindBy (xpath = "//*[@class='text-left']")
    public List<WebElement> sepetUrunIsimleri;
}
