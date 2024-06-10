package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class FilmWebMainPage {

    private final WebDriver driver;
    @FindBy(xpath = "//a[@href='/login']")
    WebElement loginButton;

    @FindBy(id = "didomi-notice-agree-button")
    WebElement noticeAgreeButton;

    @FindBy (className = "ws__skip")
    WebElement notice2AgreeButton;

    @FindBy (id = "inputSearch")
    WebElement searchInput;

    
    public FilmWebMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptAllInfo() throws InterruptedException {
        noticeAgreeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
        Thread.sleep(4000);
        //notice2AgreeButton.click();
    }


    public void goToLogin() {
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        WebElement loginByFbButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Zaloguj się kontem Filmweb')]")));
        loginByFbButton.click();

    }
    public void searchFilm(String filmName){
        searchInput.sendKeys(filmName);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        WebElement kungFuPanda4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, '/film/Kung+Fu+Panda+4-2024-10017598')]")));
        kungFuPanda4.click();

    }
}
