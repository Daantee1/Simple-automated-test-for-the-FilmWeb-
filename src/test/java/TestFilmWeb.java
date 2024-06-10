import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.xpath;


public class TestFilmWeb extends TestSetup{



    @Test
    public void shouldRun() throws InterruptedException {
        filmWebMainPage.acceptAllInfo();
        filmWebMainPage.goToLogin();
        loginPage.login("*****", "****");
        filmWebMainPage.searchFilm("Kung Fu Panda 4");
        filmWebMoviePage.rateMovieBySeven();
        filmWebMoviePage.goToActor();
    }
}
