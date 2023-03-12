package pages.ieEnstitu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//input[@type='text']")
    public WebElement loginEmailBox;


    @FindBy(xpath = "//input[@type='password']")
    public WebElement loginPasswordBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement submitButton;


    public void loginBilgiler(){
        loginEmailBox.sendKeys(ConfigReader.getProperty("email"));
        loginPasswordBox.sendKeys(ConfigReader.getProperty("password1"));
        submitButton.click();

    }

}
