package HomeWork8;

import com.example.JSUtils;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Actions2 {
    private static WebDriver driver;
    private static String expectedResult = "10";


    @BeforeClass
    public static void beforeAction() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://dgotlieb.github.io/Actions/");

    }

    @Test
    public void test01_dragAndDrop() {

        WebElement locationElement = driver.findElement(By.id("drag1"));
        WebElement destinationElement = driver.findElement(By.id("div1"));
        JSUtils.JavascriptDragAndDrop(driver, locationElement, destinationElement);

    }

    @Test

    public void test02_doubleClick() {


        Actions doubleClickAction = new Actions(driver);

        WebElement doubleClickElement =
                driver.findElement(By.xpath("//p[@ondblclick='doubleClickFunction()']\n"));


        doubleClickAction.doubleClick(doubleClickElement);
        doubleClickAction.doubleClick(doubleClickElement).build().perform();


        String result = driver.findElement(By.id("demo")).getText();
        assertEquals("You double clicked", result);

    }

    @Test
    public void test03_mosueHover() {
        Actions hoverAction = new Actions(driver);
        WebElement firstHoverElement = driver.findElement(By.id("demo"));
        WebElement secondHoverElement = driver.findElement(By.id("close"));
        hoverAction.moveToElement(firstHoverElement).moveToElement(secondHoverElement).
                click().build().perform();
    }

    @Test
    public void test04_selectMultiple() {
        List<WebElement> elementsList = driver.findElements(By.name("kind"));
        Actions builder = new Actions(driver);
        builder.clickAndHold((WebElement)
                elementsList.get(0)).clickAndHold((WebElement) elementsList.get(2)).click();
        builder.build().perform();
    }

    @Test
    public void test05_uploadFile() {
        driver.findElement(By.name("pic")).sendKeys("C:\\Users\\moshe\\Desktop\\תמונות ירח דבש\\cancun\\20180916_131618.jpg");
    }

    @Test
    public void test06_scrollToElement() {
        WebElement element = driver.findElement(By.id("clickMe"));
        ((JavascriptExecutor)
                driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test07_scrollToLocation() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    @AfterClass
//    public static void afterClassEnds() {
//        driver.quit();


    }












