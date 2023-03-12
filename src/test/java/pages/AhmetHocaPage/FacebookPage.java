package pages.AhmetHocaPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@title='Only allow essential cookies']")
    public WebElement cookiesKabulButonu;

    @FindBy(xpath = "//input[@placeholder='E-posta veya Telefon Numarası']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@placeholder='Şifre']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButonu;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement girisYapilamadiYaziElementi;
}
