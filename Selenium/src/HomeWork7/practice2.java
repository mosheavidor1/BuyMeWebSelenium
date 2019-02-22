package HomeWork7;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static HomeWork8.Hello.getData;

public class practice2<driver> {
    private static WebDriver driver;
    private static Object webdriver;


    @BeforeClass
    public static void a() throws IOException, SAXException, ParserConfigurationException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\geckodriver.exe");

        driver = new FirefoxDriver();

        driver.navigate().to(getData("URL"));

        NgWebDriver ngWebDriver = new NgWebDriver((JavascriptExecutor) driver);
        ngWebDriver.waitForAngularRequestsToFinish();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test

    public void c() {
//        driver.get("http://angular.com/");


    }


    @Test

    public void run() {
        driver.get("https://www.youtube.com/");

        WebElement YouTubeButton = driver.findElement(By.id("logo-icon-container"));
        System.out.println(YouTubeButton);


    }

    @Test
    public void b() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("123")));

        WebElement a = driver.findElement(By.id("789"));
        wait.until(ExpectedConditions.elementToBeClickable(a));
    }


    @Test

    public void doublclick() {

        driver.get("https://codepen.io/nfxpnk/pen/vERyxK");

        WebElement myElement = driver.findElement(By.className("item-title"));
        Actions myAction = new Actions(driver);


        myAction.doubleClick(myElement);
        myAction.perform();

    }

    @Test
    public void scroll() {
        driver.get("https://www.ynet.co.il/home/0,7340,L-8,00.html");

        WebElement element = driver.findElement(By.className("homepage_footer_tools_title ftr_tools_title_icon "));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);


    }


    @Test
    public void upload() {
        driver.navigate().to("https://encodable.com/uploaddemo/");
        driver.findElement(By.id("uploadname1")).sendKeys("C:\\Users\\moshe\\Desktop\\תמונות ירח דבש\\New York)");


    }

    @Test

    public void runTest() throws IOException, SAXException, ParserConfigurationException {

        driver.findElement(By.id(Constants2.My_BUTTON_)).click();
        System.out.println(driver.getPageSource());

        driver.findElement(Constants2.MY_LOCATOR).click();

        HomePage.clickLogin(driver);

        HomePage.EnterUserName(driver);


    }

    @AfterClass

    public static void finish() {

        driver.quit();


        //   Constants2.A {
        // System.out.println(Constants2.A);


    }


}




