package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {


    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // bu sayfa locate verileirni/kodlarını saklamak için kullanılır

   @FindBy (id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy (id = "nav-search-submit-button")
    public WebElement araButonu;

    @FindBy(xpath = "//*[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")
    public WebElement sonucSayisi;


}
