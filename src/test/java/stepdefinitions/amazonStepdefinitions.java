package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class amazonStepdefinitions {
  AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String urladresi) {
        Driver.getDriver().get(ConfigReader.getProperty(urladresi));
        
    }

    @Then("kullanici title degerinin {string} icerdigini dogrular")
    public void kullaniciTitleDegerininIcerdiginiDogrular(String Amazon) {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle=Amazon;
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.quitDriver();
    }


    @Then("kullanici arama sonuclarini yazdirir")
    public void kullanici_arama_sonuclarini_yazdirir() {
        String sonucSayisi=amazonPage.sonucSayisi.getText();
        System.out.println("Arama sonucunda "+sonucSayisi+ " adet sonuç bulundu");
    }

    @Then("kullanici {string} kelimesini yazip arama tusuna tiklar")
    public void kullaniciKelimesiniYazipAramaTusunaTiklar(String aramaKelimesi) {
        amazonPage.aramaKutusu.sendKeys(aramaKelimesi);
        amazonPage.araButonu.click();
    }
}
