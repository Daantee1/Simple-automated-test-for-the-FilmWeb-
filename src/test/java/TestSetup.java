import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.FilmWebMainPage;
import pages.FilmWebMoviePage;
import pages.LoginPage;

public class TestSetup {
    WebDriver driver;
    String BASE_URL = "https://www.filmweb.pl/";

    FilmWebMainPage filmWebMainPage;
    LoginPage loginPage;
    FilmWebMoviePage filmWebMoviePage;


    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "D:\\programowanie\\testFilmweb\\chromedriver.exe");
        driver = new ChromeDriver();
        filmWebMainPage = PageFactory.initElements(driver, FilmWebMainPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        filmWebMoviePage = PageFactory.initElements(driver, FilmWebMoviePage.class);
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @After
    public void teardown(){
        //driver.quit();
    }
}
