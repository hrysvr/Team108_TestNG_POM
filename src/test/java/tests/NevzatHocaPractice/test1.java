package tests.NevzatHocaPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ieEnstitu.*;
import utilities.ConfigReader;
import utilities.Driver;

public class test1 {

    UdemyHomePage homePage = new UdemyHomePage();
    LoginPage loginPage = new LoginPage();
    MyPage myPage = new MyPage();
    OnlineEgitimlerPage online =new OnlineEgitimlerPage();
    KimlikDogrulama kimlik = new KimlikDogrulama();

    @Test
    public void test01(){

        // Kullanici https://www.iienstitu.com/en sayfasina gider
        Driver.getDriver().get("https://www.iienstitu.com/en");

        // Login butonuna tiklar
        homePage.loginButtonHomePage.click();

        // Giris bilgilerini girer ve basarili sekilde giris yaptigini test eder
        loginPage.loginEmailBox.sendKeys(ConfigReader.getProperty("email"));
        loginPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("password1"));
        loginPage.submitButton.click();
        Assert.assertTrue(myPage.loggedCheckControl.isDisplayed());

        // headers da bulunan egitimler kismina tiklar
        myPage.egitimlerOnHeaders.click();

        // acilan egitimler sayfasindan fiyat araligi olarak artan fiyat olarak secer
        Select select = new Select(online.onlineSiralaDdm);
        select.selectByValue("price_ASC");

        // ucretsiz egitimlerden herhangi birini alir
        online.lessonStresYonetimiEgitimi.click();
        online.hemenBaslaButton.click();

        // kimlik dogrulama islemlerini girer
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(kimlik.kimlikDogrulamMail,ConfigReader.getProperty("email")).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("huriye").
                sendKeys(Keys.TAB).
                sendKeys("sever").
                sendKeys(Keys.TAB).
                sendKeys("Konya").
                sendKeys(Keys.TAB).
                sendKeys("15600").
                sendKeys(Keys.TAB).
                sendKeys("Seydisehir").
                sendKeys(Keys.TAB).
                sendKeys("46546546213").perform();

        kimlik.kimlikDogrulamaOdemeyeGec.click();


        // egitimin ucretsiz oldugunu test eder ve siparisi tamamlar
        Assert.assertTrue(kimlik.ucretsizEgitimCheck.isDisplayed());


    }

    @Test
    public void stresYonetimiKontrol(){
        Driver.getDriver().get("https://www.iienstitu.com/en");
        homePage.loginButtonHomePage.click();
        loginPage.loginBilgiler();

    }

}
