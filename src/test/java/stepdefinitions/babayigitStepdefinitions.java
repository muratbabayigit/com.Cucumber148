package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BabayigitPage;
import utilities.ConfigReader;
import utilities.Driver;

public class babayigitStepdefinitions {
    BabayigitPage babayigitPage=new BabayigitPage();
    @Given("kullanici {string} sayfasina girer")
    public void kullaniciSayfasinaGirer(String giris) {
        Driver.getDriver().get(ConfigReader.getProperty(giris));
    }

    @Then("kullanici Login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        babayigitPage.loginButton.click();
        
    }

    @Then("kullanici username olarak {string} girer")
    public void kullaniciUsernameOlarakGirer(String arg0) {
        
    }

    @Then("kullanici sifre olarak {string} girer")
    public void kullaniciSifreOlarakGirer(String arg0) {
        
    }

    @Then("kullanici giris butonuna tiklar")
    public void kullaniciGirisButonunaTiklar() {
        
    }

    @Then("kullanici giris yapilamadigini dogrular")
    public void kullaniciGirisYapilamadiginiDogrular() {

    }


}
