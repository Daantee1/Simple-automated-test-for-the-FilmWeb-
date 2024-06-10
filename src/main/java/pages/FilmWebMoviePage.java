package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilmWebMoviePage {

    @FindBy(xpath = "//a[contains(@class, iconicRate__icon ) and @data-index='7']")
    WebElement movieRate;

    @FindBy(xpath = "//img[contains(@alt, 'Jack Black / Po')]")
    WebElement actor;

    public void rateMovieBySeven(){
        movieRate.click();
    }
    public void goToActor(){
        actor.click();
    }
}
