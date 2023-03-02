package tests.day11_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C04_HardAssert_SoftAssert {

    @Test
    public void hardAssertionTesti(){

        Assert.assertTrue(5>8);

        Assert.assertFalse(8==8);

        Assert.assertEquals(5,9);

        Assert.assertNotEquals(6,6);


    }

    @Test
    public void softAssertionTesti(){
        /*
            JUnit'teki Assert class'i TestNG'de de vardir
            Ancak bir test method'unda birden fazla failed olan assertion varsa
            ilk failed olan assertion'da calismayi durdurup exception firlattigindan
            tum hatayi bir defada gorup, hepsini duzeltme sansimiz olmaz

            TestNG bunun icin alternatif olusturmus
            Bu alternatife Assert class'indaki static method'lari kullanmak yerine

            SoftAssert class'indan bir obje olusturup
            o obje uzerinden istedigimiz testleri yapiyoruz
            SoftAssert objesi ile yapilan assertion'lar failed olsa da testimiz calismaya devam eder


            ancak testlerin sonucunu gormek istedigimizde
            softassert.assertAll() ile tum yaptigi testleri raporlamasini soyleyebiliriz

            assertAll() method'unun calsitigi satirda
            exception olabilir
         */

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(5>8,"true testi failed oldu"); //

        softAssert.assertFalse(8==8,"false testi failed oldu");

        softAssert.assertEquals(5,9,"equals testi failed oldu");

        softAssert.assertNotEquals(6,6,"not equals testi failed oldu");

        softAssert.assertAll();

    }
}
