package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExercisesPage {
    public AutoExercisesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Test Cases']")
    public WebElement testCaseMenu;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement testCasePageText;




}
