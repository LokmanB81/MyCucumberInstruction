package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EditorDataTablePage {
    public EditorDataTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='dt-button buttons-create']")
    public WebElement dataTableNewButton;

    @FindBy (xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement createNewFirstNameBox;

    @FindBy (xpath = "//*[text()='Create']")
    public WebElement createNewFormButton;

    @FindBy (xpath = "//*[@type='search']")
    public WebElement tableSearchBox;

    @FindBy (xpath = "//tbody//tr//td[2]")
    public List<WebElement> tableNameColumn;








}
