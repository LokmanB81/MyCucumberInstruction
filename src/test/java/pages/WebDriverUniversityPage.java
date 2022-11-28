package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDriverUniversityPage {
    public WebDriverUniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[text()='LOGIN PORTAL']")
    public WebElement loginPortalClick;

    @FindBy(xpath = "//*[@id='text']")
    public WebElement userNameBox;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement userPasswordBox;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement loginButton;

}
