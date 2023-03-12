package tests.AyseHocaPractice;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Q02 {

    /*
    - Birbirine bagimli testler olusturun.
    - ConfigReader ile birbirine bagimli testler olusturarak ;
        =>ilk once wisequarter'a gidin
        =>sonra wisequarter'a bagimli olarak google'a gidin
        =>daha sonra youtube'a bagimli olarak amazon'a gidin
    - driver'i kapatin.
     */

    @Test
    public void wisequarter(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
        Driver.closeDriver();
    }

    @Test (dependsOnMethods = "wisequarter")
    public void youtube(){
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
        Driver.closeDriver();
    }


    @Test (dependsOnMethods = "youtube")
    public void amazon(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.closeDriver();
    }



}
