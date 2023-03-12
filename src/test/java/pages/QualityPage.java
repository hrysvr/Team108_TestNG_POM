package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;


public class QualityPage {

    public QualityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[text()='Accept']")
    private WebElement cookies;

    @FindBy(xpath = "//*[text()='Log in']")
    private WebElement loginLink;

    @FindBy(xpath = "//input[@id='login-email']")
    private WebElement emailBox;

    @FindBy(xpath = "//input[@id='login-password']")
    private WebElement passwordBox;

    @FindBy(xpath = "(//*[text()='Login'])[2]")
    private WebElement loginButton;

    public void providerMethod(String mail,String password){

        if (cookies.isDisplayed()){
            cookies.click();
            loginLink.click();
            emailBox.sendKeys(mail);
            passwordBox.sendKeys(password);
            loginButton.click();
            ReusableMethods.bekle(2);
        } else {
            loginLink.click();
            emailBox.sendKeys(mail);
            passwordBox.sendKeys(password);
            ReusableMethods.bekle(2);
            loginButton.click();

        }


    }

    public void loginMethod(){
        cookies.click();
        loginLink.click();
        emailBox.sendKeys("anevzatcelik@gmail.com");
        passwordBox.sendKeys("Nevzat152032");
        loginButton.click();
    }



       /*
              if (qualityPage.cookies.isDisplayed()){
        qualityPage.cookies.click();
        qualityPage.loginLink.click();
        qualityPage.emailBox.sendKeys(mail);
        qualityPage.passwordBox.sendKeys(password);
        qualityPage.loginButton.click();
        ReusableMethods.bekle(2);
    } else {
        qualityPage.loginLink.click();
        qualityPage.emailBox.sendKeys(mail);
        qualityPage.passwordBox.sendKeys(password);
        ReusableMethods.bekle(2);
        qualityPage.loginButton.click();
    }
        */
}
