package pages.ieEnstitu;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class KimlikDogrulama {
    public KimlikDogrulama(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement kimlikDogrulamMail;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement kimlikDogrulamaOdemeyeGec;

    @FindBy(xpath = "//p[@class='_1x52f9s1 _1fragema3 _1x52f9sm _1fragem1i _1fragema6']")
    public WebElement ucretsizEgitimCheck;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement siparisiTamamlaButton;
}
